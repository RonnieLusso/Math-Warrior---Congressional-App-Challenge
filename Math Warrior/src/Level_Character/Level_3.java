package Level_Character;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class Level_3 extends Comp {
	float change = 0.008f;
	boolean moused;
	public Level_3() {
		clickable = true;
		movable = true;
		index = 36;
		index2 = 23;
		x = (int) (69 * Window.getScaleX());
		y = (int)((215 + 2 * 85) * Window.getScaleY());
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {
	
	
	
		}
		
	

	@Override
	protected void pressed() {
		Window.changeScreen(6);
	}

}
