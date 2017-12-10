package ProblemBank;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;

import FrameWork.Window;

public class Problem5 extends Problem {
	int numOfTerms = 3;
	int index;
	int x = (int) ((Window.optimalSizeX / 2 - 0.5 * (int) (Window.getNumbers(Math.abs(0)).getWidth())
			- ((int) (Window.getNumbers(Math.abs(0)).getWidth()) * numOfTerms)) * Window.getScaleX());
	int x1 = (int) ((Window.optimalSizeX / 2 - 0.5 * (int) (Window.getNumbers(Math.abs(0)).getWidth())
			- ((int) (Window.getNumbers(Math.abs(0)).getWidth()) * (numOfTerms + 1))) * Window.getScaleX());
	int x3 = (int) ((Window.optimalSizeX / 2 - 0.7 * (int) (Window.getNumbers(Math.abs(0)).getWidth())
			- ((int) (Window.getNumbers(Math.abs(0)).getWidth()) * numOfTerms)) * Window.getScaleX());
	
	int[] nums = new int[4];

	public Problem5(int a, int b, int c, int e, int index, int d) {
		nums[0] = a;
		nums[1] = b;
		nums[2] = c;
		nums[3] = e;
		this.index = index;
		ans = d;
		y = (int) (100 * Window.getScaleX());
	}

	public void displayProblem(Graphics2D g) {
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		for (int i = 0; i < numOfTerms + 1; i++) {

			if (i > 0) {
				if (index == i || index == 4) {
					g.drawImage(Window.getImages(Math.abs(20)), (int) (x1 + (i * (300 * Window.getScaleX()))), y,
							(int) (Window.getImages(Math.abs(20)).getWidth() * Window.getScaleX()),
							(int) (Window.getImages(Math.abs(20)).getHeight() * Window.getScaleY()), null);

				} else {
					g.drawImage(Window.getImages(Math.abs(17)), (int) (x1 + (i * (300 * Window.getScaleX()))), y,
							(int) (Window.getImages(Math.abs(17)).getWidth() * Window.getScaleX()),
							(int) (Window.getImages(Math.abs(17)).getHeight() * Window.getScaleY()), null);
				}
			}
			if (nums[i] < 0) {
				g.drawImage(Window.getImages(Math.abs(21)), (int) (x3 + (i * (300 * Window.getScaleX()))), y,
						(int) (Window.getImages(Math.abs(21)).getWidth() * Window.getScaleX()),
						(int) (Window.getImages(Math.abs(21)).getHeight() * Window.getScaleY()), null);
			}
			g.drawImage(Window.getNumbers(Math.abs(nums[i])), (int) (x + (i * (300 * Window.getScaleX()))), y,
					(int) (Window.getNumbers(Math.abs(nums[i])).getWidth() * Window.getScaleX()),
					(int) (Window.getNumbers(Math.abs(nums[i])).getHeight() * Window.getScaleY()), null);

			g.setColor(Color.black);
			
			g.drawString("" + ans, 20, 700);
		}
	}

	public int getAnswer() {
		return ans;

	}
}
