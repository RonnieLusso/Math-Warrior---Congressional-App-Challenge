package Options;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class res1 extends Comp {

	public res1() {
		index = 11;
		clickable = true;
		x = (int) (50 * Window.getScaleX());
		y = (int)((100 + (0 * 150)) * Window.getScaleY());
		
	}

	@Override
	public void doDraw(Graphics2D g) {



	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeDisplaySize(1920, 1080, 2);
	}

}
