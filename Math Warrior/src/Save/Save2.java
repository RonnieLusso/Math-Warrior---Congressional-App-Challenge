package Save;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Save2 extends Comp {

	public Save2() {
		index = 33;
		index2 = 27;
		movable = true;
		clickable = true;
		x = (int) (Window.getPanel().getWidth() / 2 - (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
		y = (int)((100 + 1 * 200) * Window.getScaleY());

		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		Window.setP(2);
		Window.changeScreen(3);
	}

}
