package FrameWork;

public class Logic_Thread extends Thread {
	CurrentScreen s;

	public Logic_Thread(CurrentScreen s) {
		this.s = s;
	}

	public void change(CurrentScreen s){
		this.s = s;
	}

	public void run() {
		//long lastLoopTime = System.currentTimeMillis();

		while (true) {
			//long delta = System.currentTimeMillis() - lastLoopTime;
			//lastLoopTime = System.currentTimeMillis();
			s.logic();
			Window.getMouse2().clicked = false;
			try {
				Thread.sleep(11);
			} catch (Exception e) {
			}
		}

	}
}
