package Options;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class res3 extends Comp {

	public res3() {
		index = 9;
		clickable = true;
		x = (int) (50 * Window.getScaleX());
		y = (int)((100 + (2 * 150)) * Window.getScaleY());
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeDisplaySize(1080, 607, 2);
		System.out.println("hiu");
	}

}
