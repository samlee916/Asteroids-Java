package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class AboutGame extends Command
{
	private GameWorld gw;
	
	public AboutGame(GameWorld gw)
	{
		super("ABOUT");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.about();
		System.out.println("------- About -------");
	}
}
