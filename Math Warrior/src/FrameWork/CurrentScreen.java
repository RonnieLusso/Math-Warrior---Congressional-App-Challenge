package FrameWork;

import java.awt.Graphics2D;
import java.util.ArrayList;
import Game.QuestionBank;


public abstract class CurrentScreen {
	protected ArrayList<Comp> comps = new ArrayList<Comp>();
	public int diff;
	public static QuestionBank bank;
	public static int questionNum = 0;
	public static int distance;
	public static int health;
	public static int expGained;
	public static int sp;
	public CurrentScreen(){
		
	}

	protected abstract void draw(Graphics2D g);

	protected abstract void logic();
	
	public void checkNum(){}
	
	public static int getGainedExp(){
		return expGained;
	}

}
