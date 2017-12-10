package Options;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class res2 extends Comp {

	public res2() {
		index = 8;
		clickable = true;
		x = (int) (50 * Window.getScaleX());
		y = (int)((100 + (1 * 150)) * Window.getScaleY());
		
	}

	@Override
	public void doDraw(Graphics2D g) {
	

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeDisplaySize(1366, 768, 2);
		
	}

}
