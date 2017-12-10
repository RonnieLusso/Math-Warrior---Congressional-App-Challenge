package Game;

import java.awt.Graphics2D;
import FrameWork.Comp;
import FrameWork.CurrentScreen;
import FrameWork.Mouse;
import FrameWork.Save;
import FrameWork.Window;


public class GameScreen extends CurrentScreen {
	int numWrong, numRight;
	private boolean tryingToRun = false;
	private int first = 1;
	private int xpMulti = 2;


	public GameScreen(int diff) {
		this.diff = diff;
		bank = new QuestionBank(this.diff);
		comps.add(new Background());
		comps.add(new Timer());
		comps.add(new TimerBar());
		comps.add(new HealthBar());
		comps.add(new Run());
		comps.add(new Mouse());
		expGained = 0;
		health = Window.getP().H + 3;
		distance = Math.max(1, (-Window.getP().S + 6));
	
	}

	@Override
	protected void draw(Graphics2D g) {
		g.clearRect(0, 0, 2000, 2000);
		for (int i = 0; i < comps.size(); i++) {
			Comp c = comps.get(i);
			c.draw(g);

		}
		if(tryingToRun && first  > 0){
			comps.add(new Runaway());
			first--;
		}
		bank.getProblems(diff).get(questionNum).displayProblem(g);
		Answer.displayProblem(g);

	}

	@Override
	protected void logic() {
		for (int i = 0; i < comps.size(); i++) {
			Comp c = comps.get(i);
			c.logic();
		}
		checkTimer();
		checkHealth();
	}

	private void checkHealth() {
		if(health < 1){
			Window.getP().E = 0;
			Window.getP().S = 0;
			Window.getP().I = 0;
			Window.getP().L = 0;
			Window.getP().H = 0;
			Save.save();
			Window.changeScreen(0);
			
		}else{
			if(distance < 1){
				Window.changeScreen(10);
			}
		}
	
		
	}

	private void checkTimer() {
		if(Timer.reset){
			Answer.resetNum();
			questionNum++;
			numWrong++;
		}
		
	}

	public void checkNum() {
		int foo = Integer.parseInt(Answer.getNum());
		if (foo == bank.getProblems(diff).get(questionNum).getAnswer()) {
			questionNum++;
			numRight++;
			Timer.resetClock();
			Answer.resetNum();
			expGained += diff * (5 * xpMulti * 3);
			if(tryingToRun)
				distance--;
		} else {
			Answer.resetNum();
			
		}
	}

	public String toString() {
		return "Game";
	}

	public void setRunaway(boolean b) {
		tryingToRun = true;
		comps.remove(4);
		
	}
	
}
