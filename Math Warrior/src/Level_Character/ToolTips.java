package Level_Character;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class ToolTips extends Comp {
	float change = 0.003f;
	public ToolTips() {
		index = 14;
		x = (int) (Window.getPanel().getWidth() / 2 - (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
		y = (int)(5 * Window.getScaleY());
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {
		if (opacity < 0.1111111) {
			change = -change;
		}
		if (opacity > 0.9999999) {
			change = -change;
		}
		opacity += change;
	}

	@Override
	protected void pressed() {
		Window.changeScreen(3);
	}

}
