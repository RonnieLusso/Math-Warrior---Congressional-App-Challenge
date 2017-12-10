package FrameWork;

import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class Render_Thread extends Thread {
	CurrentScreen s;
	BufferStrategy strategy;

	public Render_Thread(CurrentScreen s, BufferStrategy strategy) {
		this.s = s;
		this.strategy = strategy;
	}

	public void change(CurrentScreen s){
		this.s = s;
	}

	public void run() {

		//long lastLoopTime = System.currentTimeMillis();

		while (true) {
			//long delta = System.currentTimeMillis() - lastLoopTime;
			//lastLoopTime = System.currentTimeMillis();
			Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
			s.draw(g);
			g.dispose();
			strategy.show();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}

	}

}
