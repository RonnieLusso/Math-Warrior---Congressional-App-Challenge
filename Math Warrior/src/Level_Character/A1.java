package Level_Character;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.Window;

public class A1 extends Comp {
	float change = 0.008f;
	boolean moused;
	public A1() {
		notUnlocked = true;
		index = 29;
		x = (int) ((960 + 0 * 90) * Window.getScaleX());
		y = (int)((320) * Window.getScaleY());
		
	}

	@Override
	public void doDraw(Graphics2D g) {

	}

	@Override
	public void doLogic() {
	
	
		if (notUnlocked) {
		
			opacity = 0.5f;

		} else {
			opacity = 1f;
		}
		}
		
	

	@Override
	protected void pressed() {
		Window.changeScreen(6);
	}

}
