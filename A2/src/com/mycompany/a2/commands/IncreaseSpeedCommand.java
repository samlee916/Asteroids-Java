package com.mycompany.a2.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class IncreaseSpeedCommand extends Command
{
	private GameWorld gw;
	
	public IncreaseSpeedCommand(GameWorld gw)
	{
		super("Increase Speed");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1)
		{
			gw.increaseSpeed();
			System.out.println("Increase Speed command~~~~~~~~~~~~~~~~~~");
		}
	}
}
