package Game;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.Window;

public class TimerBar extends Comp {
	static int mTime;
	static int cTime;
	int rate;
	public static boolean reset;
	int x3, y3;

	public TimerBar() {

		index = 47;
		clickable = true;
		x = (int) (311 * Window.getScaleX());
		y = (int) (270 * Window.getScaleY());


	}

	@Override
	public void doDraw(Graphics2D g) {
		

	}

	public static void resetClock() {
		cTime = mTime;
	}

	@Override
	public void doLogic() {
		if (cTime < 0) {
			cTime = mTime;
			GameScreen.health--;
			reset = true;
		} else {
			reset = false;
		}
	}

	@Override
	protected void pressed() {
		Window.changeScreen(0);

	}

}
