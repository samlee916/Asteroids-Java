package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class KillAsteroid extends Command
{
	private GameWorld gw;
	
	public KillAsteroid(GameWorld gw)
	{
		super("Kill Asteroid");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1)
		{
			gw.killAsteroid();
			System.out.println("------- Kill Asteroid -------");
		}
	}
}
