package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class Reload extends Command
{
	private GameWorld gw;
	
	public Reload(GameWorld gw)
	{
		super("RELOAD");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1)
		{
			gw.reloadMissiles();
			System.out.println("------- Reload -------");
		}
	}
}
