package Game;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Window;

public class Run extends Comp {

	public Run() {
		index = 44;
		index2 = 43;
		movable = true;
		clickable = true;
		x = (int) (40 * Window.getScaleX());
		y = (int)(460 * Window.getScaleY());
		
		

	}

	@Override
	public void doDraw(Graphics2D g) {

	

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		CurrentScreen a = Window.getScreen();
		((GameScreen) a).setRunaway(true);
		
	}

}
