package abl.actions;

import game.Bot;
import game.GameEngine;

import java.awt.Point;
/**
 * Sets the trajectory of the chaser. 
 * 
 * @author Sam Davidson & Ashwin Bandahar 2-2-19
 */
public class Move extends BaseAction {

	/**
	 * Sets the trajectory of the player to a specified point.
	 * args[0] - bot id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[2]) {
				b.setTrajectory(new Point((Integer)args[0], (Integer)args[1]));
			}
		}
	}
}
