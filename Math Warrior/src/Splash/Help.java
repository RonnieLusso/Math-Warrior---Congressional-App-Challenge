package Splash;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.Window;

public class Help extends Comp {

	public Help() {
		index = 12;
		clickable = true;
		x = (int) (10 * Window.getScaleX());
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
		Window.changeScreen(1);
		
	}

}
