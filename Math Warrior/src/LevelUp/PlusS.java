package LevelUp;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;
import Game.GameScreen;

public class PlusS extends Comp {

	public PlusS() {
		index = 45;
		index2 = 46;
		clickable = true;
		movable = true;
		x = (int) (156 * Window.getScaleX());
		y = (int)((241 + (2 * 190)) * Window.getScaleY());
		change = (Window.getImages(index).getWidth() * Window.getScaleX()) / 500;
		
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {

	}

	@Override
	protected void pressed() {
		if (GameScreen.sp > 0) {
			Window.getP().S++;
			GameScreen.sp--;
		}
	}

}
