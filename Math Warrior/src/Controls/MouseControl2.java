package Controls;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseControl2 implements MouseListener {
	public boolean clicked;

	@Override
	public void mouseClicked(MouseEvent e) {
System.out.println(e.getX());
System.out.println(e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		clicked = true;
	}

}
