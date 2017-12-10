package Level_Character;

import java.awt.Graphics2D;

import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Mouse;
import FrameWork.Window;
import Options.Back;

public class Level_CharacterScreen extends CurrentScreen {

	public Level_CharacterScreen() {
		comps.add(new Background());
		comps.add(new Card());
		comps.add(new ToolTips());
		comps.add(new Back());
		comps.add(new Level_1());
		comps.add(new Level_2());
		comps.add(new Level_3());
		comps.add(new Level_4());
		comps.add(new Level_5());
		comps.add(new A1());
		comps.add(new A2());
		comps.add(new A3());
		comps.add(new Bars());
		comps.add(new Expbar());
		comps.add(new Mouse());
		System.out.println("ecp " + Window.getP().E);
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
