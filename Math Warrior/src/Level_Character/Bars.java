package Level_Character;

import java.awt.Color;
import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Bars extends Comp {
	float change = 0.008f;
	boolean moused;
	int y2, y3;
	int newX, newY;
	public Bars() {
		index = 0;
		x = (int) (956 * Window.getScaleX());
		y = (int) (456 * Window.getScaleY());
		y2 = (int)((456 + 1 * 55) * Window.getScaleY());
		y3 = (int) ((456 + 2 * 55) * Window.getScaleY());
		newX = (int) (1136  * Window.getScaleX());
		newY = (int) (271  * Window.getScaleY());

		
	}

	@Override
	public void doDraw(Graphics2D g) {
		g.setColor(Color.black);
		for (int i = 0; i < Window.getP().H; i++) {
			g.fillRect(x + (i * 15), y, 10, 20);
		}
		for (int i = 0; i < Window.getP().I; i++) {
			g.fillRect(x + (i * 15), y2, 10, 20);
		}
		for (int i = 0; i < Window.getP().S; i++) {
			g.fillRect(x + (i * 15), y3, 10, 20);
		}
		for (int i = 0; i < Window.getP().L; i++) {
			g.fillRect(newX + (i * 15), newY - 30, 8, 20);
		}
		g.setColor(Color.green);
		for (int i = 0; i < Window.getP().E; i++) {
			g.fillRect(newX + (int)(i * 1.25), newY,  2, 20);
		}
	}

	@Override
	public void doLogic() {

	
		}
		
	

	@Override
	protected void pressed() {
		Window.changeScreen(6);
	}

}
