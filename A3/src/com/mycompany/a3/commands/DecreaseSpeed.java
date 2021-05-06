package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class DecreaseSpeed extends Command
{
	private GameWorld gw;
	
	public DecreaseSpeed(GameWorld gw)
	{
		super("Decrease Speed");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1)
		{
			gw.decreaseSpeed();
			System.out.println("------- Decrease Speed -------");
		}
	}
}
