package Save;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Back extends Comp {

	public Back() {
		index = 3;
		clickable = true;
		x = (int) ((Window.optimalSizeX - Window.getImages(index).getWidth()) * Window.getScaleX()); 
		y = (int) (1 * Window.getScaleY()); 
		
	}

	@Override
	public void doDraw(Graphics2D g) {


	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.changeScreen(0);
		
	}

}
