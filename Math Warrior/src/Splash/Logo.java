package Splash;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Logo extends Comp {

	public Logo() {
		index = 7;
		x = (int) (Window.getPanel().getWidth() / 2 - (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
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
		// TODO Auto-generated method stub
		
	}

}
