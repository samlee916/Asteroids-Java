package com.mycompany.a3.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.Game;

public class Pause extends Command
{
	private Game game;

	public Pause(Game game)
	{
		super("PAUSE");
		this.game = game;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1) 
		{
			if(game.isPaused())
			{
				game.startTimer();
			}
			else
			{
				game.pauseTimer();
			}

			System.out.println("------- Game Pause -------");
		}
	}
	
}
