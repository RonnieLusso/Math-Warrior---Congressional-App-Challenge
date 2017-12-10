package Game;

import java.awt.Color;
import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Runaway extends Comp {

	public int distance = Math.max(1, (-Window.getP().S + 6));

	public Runaway() {

		x = (int) (50 * Window.getScaleX());
		y = (int) ((Window.getPanel().getHeight() - 100) * Window.getScaleY());
		index2 = 42;
	}

	@Override
	public void doDraw(Graphics2D g) {
		g.setColor(Color.black);

		for (int i = 0; i < GameScreen.distance; i++) {

			g.drawImage(Window.getImages(index2), x + (i * 90), y,
					(int) (Window.getImages(index2).getWidth() * Window.getScaleX()),
					(int) (Window.getImages(index2).getHeight() * Window.getScaleY()), null);
		}

	}

	public static void resetClock() {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeScreen(0);

	}

}
