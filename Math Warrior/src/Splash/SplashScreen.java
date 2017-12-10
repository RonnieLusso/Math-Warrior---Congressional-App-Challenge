package Splash;

import java.awt.Graphics2D;
import java.util.ArrayList;
import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Mouse;

public class SplashScreen extends CurrentScreen {

	

	public SplashScreen() {
		comps.add(new Background());
		comps.add(new Logo());
		comps.add(new Play());
		comps.add(new Symbol());
		comps.add(new Options());
		comps.add(new Help());
		comps.add(new Enter());
		comps.add(new Mouse());
	
		

	}

	@Override
	protected void draw(Graphics2D g) {
		g.clearRect(0, 0, 2000, 2000);
		for (int i = 0; i < comps.size(); i++){
			Comp c = comps.get(i);
			c.draw(g);

		}

	}
	
	@Override
	protected void logic() {
		for (int i = 0; i < comps.size(); i++){
			Comp c = comps.get(i);
			c.logic();
		}
	}
	public ArrayList<Comp> getComps(){
		return comps;
		
	}
	public String toString(){
		return "Splash";
	}

}
