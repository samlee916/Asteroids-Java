package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class QuitGame extends Command
{
	private GameWorld gw;
	
	public QuitGame(GameWorld gw)
	{
		super("QUIT");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		gw.quitGame();
		System.out.println("------- Quit Game -------");
	}
}
