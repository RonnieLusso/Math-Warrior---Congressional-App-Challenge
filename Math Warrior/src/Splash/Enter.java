package Splash;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.Window;

public class Enter extends Comp {

	float change = 0.008f;
	float blah = 1;
	public Enter() {
		index = 4;
		x = (int) (Window.getPanel().getWidth() / 2
				- (0.5 * Window.getImages(index).getWidth() * Window.getScaleX()));
		y = (int) (640 * Window.getScaleY());

	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {
		if (blah < -0.06) {
			change = -change;
		}
		if (blah > 0.9999) {
			change = -change;
		}
		blah += change;
		
		if(blah > 0.0001){
			opacity = blah;
		}

	}

	@Override
	protected void pressed() {
		// TODO Auto-generated method stub

	}

}
