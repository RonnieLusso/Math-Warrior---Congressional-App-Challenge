package FrameWork;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;

public abstract class Comp {
	protected int x, y, x2, y2;
	protected boolean clickable;
	protected int index = 0;
	protected int index2 = 0;
	protected float opacity = 1;
	protected boolean notSeen = true;
	protected boolean notUnlocked, movable, bigable;
	protected double scale = 0;
	protected double change;
	private boolean drawN = true;

	public Comp() {
		change = (Window.getImages(index).getWidth() * Window.getScaleX()) / 2;
	}

	public void draw(Graphics2D g) {
		x2 = (int) (x + scale);
		y2 = (int) (y);
	
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		if(drawN){
		g.drawImage(Window.getImages(index), x, y, (int) (Window.getImages(index).getWidth() * Window.getScaleX()),
				(int) (Window.getImages(index).getHeight() * Window.getScaleY()), null);
		}
		if (movable) {
			movable(g);

		}
		

		if (clickable && isMousedOver()) {
			notSeen = false;
			if(bigable){
				sizeUp(g);
				drawN = false;
			}

		}else{
			drawN = true;
		}

		doDraw(g);

	}

	private void sizeUp(Graphics2D g) {
		x2 = x;
		y2 = y;
		g.drawImage(Window.getImages(index2), x2, y2,
				(int) (Window.getImages(index2).getWidth() * (Window.getScaleX())),
				(int) (Window.getImages(index2).getHeight() * (Window.getScaleY())), null);
		
	}

	private void movable(Graphics2D g) {
		x2 = (int) (x + scale);
		g.drawImage(Window.getImages(index2), x2, y2,
				(int) (Window.getImages(index2).getWidth() * (Window.getScaleX())),
				(int) (Window.getImages(index2).getHeight() * (Window.getScaleY())), null);
		if (clickable && isMousedOver()) {
			notSeen = false;
			move(g);

		} else {
			if (scale > 0) {
				scale *= 0.95;
			}
			if (scale < 0) {
				scale *= 0.95;
			}
			if (Math.random() > 0.5) {
				change = -change;
			}
		}

	}

	public boolean getIsHighlighting() {
		return clickable && isMousedOver();

	}

	protected boolean isMousedOver() {

		if (Window.getMouse().x < x + Window.getImages(index).getWidth() * Window.getScaleX()) {
			if (Window.getMouse().x > x) {
				if (Window.getMouse().y < y + Window.getImages(index).getHeight() * Window.getScaleY()) {
					if (Window.getMouse().y > y) {
						return true;
					}
				}

			}

		}
		return false;

	}

	private void move(Graphics2D g) {

		if (scale < -(Window.getImages(index).getWidth() * Window.getScaleX()) / 30) {
			change = -change;
		}
		if (scale > (Window.getImages(index).getWidth() * Window.getScaleX()) / 30) {
			change = -change;
		}
		scale += change;
	}

	public abstract void doDraw(Graphics2D g);

	public void logic() {

		if (isMousedOver() && isClicked() && clickable) {
			pressed();
		}

		doLogic();
	}

	protected abstract void pressed();

	private boolean isClicked() {
		return Window.getMouse2().clicked;
	}

	public abstract void doLogic();

}
