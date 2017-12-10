package Controls;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseControl implements MouseMotionListener {
	public int x, y;

	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

}
