package Level_Character;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Expbar extends Comp {
	float change = 0.008f;
	boolean moused;

	public Expbar() {
		index = 38;

		x = (int) (1133  * Window.getScaleX());
		y = (int) (262  * Window.getScaleY());

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
