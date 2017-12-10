package Controls;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import FrameWork.Window;
import Game.Answer;
import ProblemBank.Problem;

public class KeyControl implements KeyListener {
	public boolean minus;

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_MINUS) {
			if (Answer.getNum().equals("")) {
				minus = true;
			}

		}
		if (key == KeyEvent.VK_1) {
			Answer.changeNum("1");
		}
		if (key == KeyEvent.VK_2) {
			Answer.changeNum("2");
		}
		if (key == KeyEvent.VK_3) {
			Answer.changeNum("3");
		}
		if (key == KeyEvent.VK_4) {
			Answer.changeNum("4");
		}
		if (key == KeyEvent.VK_5) {
			Answer.changeNum("5");
		}
		if (key == KeyEvent.VK_6) {
			Answer.changeNum("6");
		}
		if (key == KeyEvent.VK_7) {
			Answer.changeNum("7");
		}
		if (key == KeyEvent.VK_8) {
			Answer.changeNum("8");
		}
		if (key == KeyEvent.VK_9) {
			Answer.changeNum("9");
		}
		if (key == KeyEvent.VK_0) {
			Answer.changeNum("0");
		}

		if (key == KeyEvent.VK_ENTER) {
			if (Window.getScreen().toString().equals("Game")) {
				if (!Problem.over) {
					Window.getScreen().checkNum();
				}
			}
			if (Window.getScreen().toString().equals("Splash")) {
				Window.changeScreen(9);
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
