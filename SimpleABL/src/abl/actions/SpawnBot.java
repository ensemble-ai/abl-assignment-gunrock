package abl.actions;

import java.awt.Point;

import game.Bot;
import game.GameEngine;

public class SpawnBot extends BaseAction{
	public void execute(Object[] args) {
		Bot b2 = new Bot();
		b2.setLocation(new Point((Integer)args[0], (Integer)args[1]));
		
		GameEngine.getInstance().getBots().add(b2);
	}
}
