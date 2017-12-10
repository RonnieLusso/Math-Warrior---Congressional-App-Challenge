package Help;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Mouse;

public class HelpScreen extends CurrentScreen {

	public HelpScreen() {
		comps.add(new Back());
		comps.add(new HelpText());
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
		return "Help";
	}
}
