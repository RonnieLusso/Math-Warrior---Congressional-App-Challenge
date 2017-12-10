package Splash;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Options extends Comp {

	public Options() {
		index = 5;
		clickable = true;
		x = (int) (Window.getPanel().getWidth() - (8 + Window.getImages(index).getWidth()  * Window.getScaleX()));
		y = 0;
		
		

	}

	@Override
	public void doDraw(Graphics2D g) {

	

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeScreen(2);
		
	}

}
