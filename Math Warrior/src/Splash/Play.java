package Splash;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Play extends Comp {

	public Play() {
		//index2 = 35;
		index = 1;
		//bigable = true;
		clickable = true;
		x = (int) (Window.getPanel().getWidth() / 2 - (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
		y = (int)(560 * Window.getScaleY());
		
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeScreen(9);
	}

}
