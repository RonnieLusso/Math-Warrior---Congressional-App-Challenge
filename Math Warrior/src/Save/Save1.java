package Save;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Save1 extends Comp {

	public Save1() {
		index = 33;
		index2 = 26;
		clickable = true;
		movable = true;
		x = (int) (Window.getPanel().getWidth() / 2 - (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
		y = (int)((100 + 0 * 200) * Window.getScaleY());
		
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.setP(1);
		Window.changeScreen(3);
	}

}
