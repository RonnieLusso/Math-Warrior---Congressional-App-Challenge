package FrameWork;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.Window;

public class Mouse extends Comp {

	float change = 0.008f;

	public Mouse() {
		index = 16;
		x = (int) (Window.getMouse().x);
		y = (int) (Window.getMouse().y);

	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {
		x = (int) (Window.getMouse().x);
		y = (int) (Window.getMouse().y);

	}

	@Override
	protected void pressed() {
		// TODO Auto-generated method stub

	}

}
