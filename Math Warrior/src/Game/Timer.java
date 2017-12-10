package Game;

import java.awt.Color;
import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.Window;
import ProblemBank.Problem;


public class Timer extends Comp {
	static double mTime;
	static double cTime;
	double rate;
	public static boolean reset;
	int x3, y3;

	public Timer() {
		mTime = (int) ((700) * Window.getScaleX());
		cTime = mTime;
		rate = Math.max(0.01,((5 - ((Window.getP().I + 3) * 0.25))) * Window.getScaleX());
		index = 0;
		clickable = true;
		x = (int) (310 * Window.getScaleX());
		y = (int) (270 * Window.getScaleY());
		x3 = (int) (Window.getPanel().getWidth() / 2 - (mTime / 2) - (0.5 * 0 * Window.getScaleX()));
		y3 = (int) (296 * Window.getScaleY());

	}

	@Override
	public void doDraw(Graphics2D g) {
		if(cTime > 0)
		cTime -= (rate / 2);
		if (cTime > mTime * .66) {
			g.setColor(Color.green);
		} else if (cTime > mTime * .33) {
			g.setColor(Color.yellow);
		} else {
			g.setColor(Color.red);
		}
		g.fillRect(x3, y3, (int) (cTime), (int) (60 * Window.getScaleY()));

	}

	public static void resetClock() {
		cTime = mTime;
	}

	@Override
	public void doLogic() {
		if (cTime < 1) {
			GameScreen.bank.getProblems(Window.getScreen().diff).get(GameScreen.questionNum).destroy();
			if(Problem.destroyed){
			cTime = mTime;
			GameScreen.health--;
			reset = true;
			}
			
			
		} else {
			reset = false;
		}
	}

	@Override
	protected void pressed() {
		Window.changeScreen(0);

	}

}
