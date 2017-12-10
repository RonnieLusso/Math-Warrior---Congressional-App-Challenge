package Game;

import java.awt.Color;
import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class HealthBar extends Comp {

	int x1 = (int) (35 * Window.getScaleX());
	int y1 = (int) (((Window.getP().H + 3) * 40) * Window.getScaleY());

	public HealthBar() {
		index = 40;
		x = 0;
		y = (int) (y1 + 40 * Window.getScaleY());
		index2 = 41;
	}

	@Override
	public void doDraw(Graphics2D g) {
		g.setColor(Color.black);
		for (int i = 0; i < GameScreen.health; i++) {
			g.drawImage(Window.getImages(index2), x1, y1 - (i * 50),
					(int) (Window.getImages(index2).getWidth() * Window.getScaleX()),
					(int) (Window.getImages(index2).getHeight() * Window.getScaleY()), null);
		}

	}


	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeScreen(0);

	}

}
