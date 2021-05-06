package com.mycompany.a3.commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

// for debugging
public class TempMap extends Command
{
	private GameWorld gw;
	
	public TempMap(GameWorld gw)
	{
		super("Map Delete Later");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getKeyEvent() != -1)
		{
			gw.printMap();
			System.out.println("------- Print Map -------");
		}
	}
}
