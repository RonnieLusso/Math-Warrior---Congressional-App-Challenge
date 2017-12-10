package Help;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class HelpText extends Comp {

	public HelpText() {
		index = 6;
		x = (int) (Window.getPanel().getWidth() / 2
				- (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
		y = (int) (250 * Window.getScaleY());

	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {

	}

}
