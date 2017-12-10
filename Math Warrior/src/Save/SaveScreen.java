package Save;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Mouse;
import Splash.Background;

public class SaveScreen extends CurrentScreen {

	public SaveScreen() {
		comps.add(new Background());
		comps.add(new Back());
		comps.add(new Save1());
		comps.add(new Save2());
		comps.add(new Save3());
		comps.add(new Mouse());


	}

	@Override
	protected void draw(Graphics2D g) {
		g.clearRect(0, 0, 2000, 2000);
		for (int i = 0; i < comps.size(); i++) {
			Comp c = comps.get(i);
			c.draw(g);

		}

	}

	@Override
	protected void logic() {
		for (int i = 0; i < comps.size(); i++) {
			Comp c = comps.get(i);
			c.logic();
		}
	}

	public String toString() {
		return "Save";
	}
}
