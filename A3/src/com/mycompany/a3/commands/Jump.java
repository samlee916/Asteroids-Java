package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class Jump extends Command
{
	private GameWorld gw;
	
	public Jump(GameWorld gw)
	{
		super("Jump");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1)
		{
			gw.jump();
			System.out.println("------- Jump -------");
		}
	}
}
