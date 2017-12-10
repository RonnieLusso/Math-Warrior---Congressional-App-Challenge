package Level_Character;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Card extends Comp {
	float change = 0.008f;
	boolean moused;

	public Card() {
		index = 32;
		x = (int) (730 * Window.getScaleX());
		y = (int) (215 * Window.getScaleY());

	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeScreen(4);
	}

}
