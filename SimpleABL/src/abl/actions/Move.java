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
				int locationX = b.getX();
				int locationY = b.getY();
				
				int targetX = (Integer)args[0];
				int targetY = (Integer)args[1];
				
				int dx = targetX - locationX;
				int dy = targetY - locationY;
				
				int magnitude = (int)Math.round(Math.sqrt(dx*dx + dy*dy));
				
				if (magnitude > 0) {
					dx = 2*dx/magnitude;
					dy = 2*dy/magnitude;
				}
				
				b.setTrajectory(new Point(dx, dy));
			}
		}
	}
}
