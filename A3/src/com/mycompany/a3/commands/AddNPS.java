package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class AddNPS extends Command
{
	private GameWorld gw;
	
	public AddNPS(GameWorld gw)
	{
		super("Add Non-PlayerShip");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1) 
		{
			gw.addNPS();
			System.out.println("------- Add Non-PlayerShip -------");
		}
	}
}
