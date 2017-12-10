package Save;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Save3 extends Comp {

	public Save3() {
		index = 33;
		index2 = 28;
		movable = true;
		clickable = true;
		x = (int) (Window.getPanel().getWidth() / 2 - (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
		y = (int)((100 + 2 * 200) * Window.getScaleY());
	
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.setP(3);
		Window.changeScreen(3);
	}

}
