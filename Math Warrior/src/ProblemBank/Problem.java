package ProblemBank;

import java.awt.Graphics2D;
import FrameWork.Window;


public abstract class Problem {
static int y;
	public static boolean destroyed;
	public abstract void displayProblem(Graphics2D g);
	int ans;
	protected static float opacity = 1;
	public static boolean over = false;
	public int getAnswer() {
		return ans;
	}
	public void destroy() {
		over = true;
		destroyed = false;
		y*= 1.1;
		opacity *= .9;
		System.out.println(y);
		if(y > 800){
			y = (int) (100 * Window.getScaleX());
			opacity = 1;
			destroyed = true;
			over = false;
		}
		
		
	}

}
