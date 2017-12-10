package Options;

import java.awt.Graphics2D;
import java.util.ArrayList;
import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Mouse;

public class OptionsScreen extends CurrentScreen {

	public OptionsScreen() {
		comps.add(new Back());
		comps.add(new res1());
		comps.add(new res2());
		comps.add(new res3());
		comps.add(new res4());
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

	public ArrayList<Comp> getComps() {
		return comps;

	}

	public String toString() {
		return "Options";
	}
}
