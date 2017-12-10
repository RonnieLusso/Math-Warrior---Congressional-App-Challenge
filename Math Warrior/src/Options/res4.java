package Options;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class res4 extends Comp {

	public res4() {
		index = 10;
		clickable = true;
		x = (int) (50 * Window.getScaleX());
		y = (int)((100 + (3 * 150)) * Window.getScaleY());
		
	}

	@Override
	public void doDraw(Graphics2D g) {


	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeDisplaySize(720, 405, 2);
	}

}
