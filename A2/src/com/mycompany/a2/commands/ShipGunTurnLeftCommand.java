package com.mycompany.a2.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class ShipGunTurnLeftCommand extends Command
{
	private GameWorld gw;
	
	public ShipGunTurnLeftCommand(GameWorld gw)
	{
		super("Rotate Gun Left");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1)
		{
			gw.turnMissileLauncherLeft(10);
			System.out.println("Rotate Gun Left command~~~~~~~~~~~~~~~~~");
		}
	}
}
