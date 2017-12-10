package ProblemBank;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;

import FrameWork.Window;

public class Problem1 extends Problem {

	int numOfTerms = 1;
	int x = (int) ((Window.optimalSizeX / 2 - 0.5 * (int) (Window.getNumbers(Math.abs(0)).getWidth())
			- ((int) (Window.getNumbers(Math.abs(0)).getWidth()) * numOfTerms)) * Window.getScaleX());
	int x1 = (int) ((Window.optimalSizeX / 2 - 0.5 * (int) (Window.getNumbers(Math.abs(0)).getWidth())
			- ((int) (Window.getNumbers(Math.abs(0)).getWidth()) * (numOfTerms + 1))) * Window.getScaleX());
	
	int[] nums = new int[2];


	public Problem1(int a, int b, int d) {
		nums[0] = a;
		nums[1] = b;
		ans = d;
		y = (int) (100 * Window.getScaleX());

	}

	public void displayProblem(Graphics2D g) {
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		for (int i = 0; i < numOfTerms + 1; i++) {
			if (nums[i] < 0) {
				g.drawImage(Window.getImages(Math.abs(19)), (int) (x1 + (i * (300 * Window.getScaleX()))), y,
						(int) (Window.getImages(Math.abs(19)).getWidth() * Window.getScaleX()),
						(int) (Window.getImages(Math.abs(19)).getHeight() * Window.getScaleY()), null);
			} else {
				if (i > 0) {
					g.drawImage(Window.getImages(Math.abs(17)), (int) (x1 + (i * (300 * Window.getScaleX()))), y,
							(int) (Window.getImages(Math.abs(17)).getWidth() * Window.getScaleX()),
							(int) (Window.getImages(Math.abs(17)).getHeight() * Window.getScaleY()), null);
				}
			}
			g.drawImage(Window.getNumbers(Math.abs(nums[i])), (int) (x + (i * (300 * Window.getScaleX()))), y,
					(int) (Window.getNumbers(Math.abs(nums[i])).getWidth() * Window.getScaleX()),
					(int) (Window.getNumbers(Math.abs(nums[i])).getHeight() * Window.getScaleY()), null);
		}
		g.setColor(Color.black);
		
		g.drawString("" + ans, 20, 700);
	}

	public int getAnswer() {
		return ans;

	}
}
