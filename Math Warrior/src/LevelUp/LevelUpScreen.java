package LevelUp;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Mouse;
import FrameWork.Save;
import FrameWork.Window;

public class LevelUpScreen extends CurrentScreen {
int gained;

	public LevelUpScreen() {
		comps.add(new Background2());
		comps.add(new Background());
		
		comps.add(new Back());
		comps.add(new PlusH());
		comps.add(new PlusI());
		comps.add(new PlusS());
		comps.add(new Bars());
		comps.add(new Mouse());
		
		Window.getP().E = (Window.getP().E + CurrentScreen.expGained);
		Window.getP().L = Window.getP().L + (Window.getP().E / 100);
		sp = Window.getP().E / 100;
		comps.add(new Sp());
		Window.getP().E = Window.getP().E % 100;
		
		Save.save();
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
