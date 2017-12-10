package LevelUp;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;
import Game.GameScreen;

public class Sp extends Comp {
	int a;

	public Sp() {
		a = GameScreen.sp;
		index = 0;
		clickable = true;
		x = (int) ((1000) * Window.getScaleX());
		y = (int) (270 * Window.getScaleY());

	}

	@Override
	public void doDraw(Graphics2D g) {
		
		g.drawImage(Window.getNumbers(Math.abs(a)), x, y,
				(int) (Window.getNumbers(Math.abs(a)).getWidth() * Window.getScaleX()),
				(int) (Window.getNumbers(Math.abs(a)).getHeight() * Window.getScaleY()), null);
	}

	@Override
	public void doLogic() {
		a = GameScreen.sp;
	}

	@Override
	protected void pressed() {
		Window.changeScreen(3);

	}

}
