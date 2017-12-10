package LevelUp;

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
		x = (int) (340 * Window.getScaleX());
		y = (int) (165 * Window.getScaleY());
		y2 = (int) ((165 + 1 * 165) * Window.getScaleY());
		y3 = (int) ((165 + 2 * 165) * Window.getScaleY());
		newX = (int) (1136 * Window.getScaleX());
		newY = (int) (271 * Window.getScaleY());

	}

	@Override
	public void doDraw(Graphics2D g) {
		g.setColor(Color.black);
		for (int i = 0; i < Window.getP().H; i++) {
			g.fillRect(x + (i * 60), y, 40, 80);
		}
		for (int i = 0; i < Window.getP().I; i++) {
			g.fillRect(x + (i * 60), y2, 40, 80);
		}
		for (int i = 0; i < Window.getP().S; i++) {
			g.fillRect(x + (i * 60), y3, 40, 80);
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
