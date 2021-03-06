package abl.wmes;

import java.awt.Point;
import java.awt.Color;

import wm.WME;
/**
 * Stores information about the bot.
 * 
 * @author Ben Weber 3-7-11
 * @author Josh McCoy 1-23-2019
 */
public class BotWME extends WME {

	/** Location of the bot */
	private Point location;
	
	/** Trajectory of the bot */
	private Point trajectory;
	
	/** ID of the bot */
	private int id;
	
	/** Color of the bot */
	private Color color;
	
	/**
	 * Instantiates a working memory element for tracking a bot.
	 */
	public BotWME(Point location, Point trajectory, int id, Color color) {
		this.location = location;
		this.trajectory = trajectory;
		this.id = id;
		this.color = color;
	}
	
	/**
	 * Returns the x location of the bot. 
	 */
	public int getLocationX() {
		return location.x;
	}
	
	/**
	 * Returns the y location of the bot. 
	 */
	public int getLocationY() {
		return location.y;
	}
	
	/**
	 * Returns the x direction of the bot. 
	 */
	public int getTrajectoryX() {
		return trajectory.x;
	}
	
	/**
	 * Returns the y direction of the bot. 
	 */
	public int getTrajectoryY() {
		return trajectory.y;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int[] getRBG() {
		
		int colorList[] = new int[3];
		
		colorList[0] = color.getRed();
		colorList[1] = color.getBlue();
		colorList[2] = color.getGreen();
		
		return colorList;
	}
	
	public int getRed() {
		return color.getRed();
	}
	
	public int getBlue() {
		return color.getBlue();
	}
	
	public int getGreen() {
		return color.getGreen();
	}
}
