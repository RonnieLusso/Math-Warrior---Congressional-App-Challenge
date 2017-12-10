package Game;

import java.awt.Graphics2D;

import FrameWork.Window;

public class Answer {
	protected static String answer = "";
	static int a;
	private static boolean destroy;
	static int x = (int) ((Window.optimalSizeX / 2 - 0.5 * (int) (135)
			- ((int) (75) * (answer.length() - 1))) * Window.getScaleX());
	static int y = (int) (470 * Window.getScaleX());
	public static void changeNum(String a) {
		if (answer.length() == 0 && Window.getKey().minus) {
			answer += "-" + a;
		} else {
			answer += a;
		}
	}

	public static void resetNum() {
		destroy = true;
		
	}

	public static String getNum() {
		return answer;

	}


	public static void displayProblem(Graphics2D g) {
		if(destroy){
			y*= 1.08;
			if(y > 800){
				destroy = false;
				answer = "";
				Window.getKey().minus = false;
				y = (int) (470 * Window.getScaleX());
			}
		}
	 x = (int) ((Window.optimalSizeX / 2 - 0.5 * (int) (135)
				- ((int) (75) * (answer.length() - 1))) * Window.getScaleX());
		
		if(Window.getKey().minus && answer.length() < 1){
			g.drawImage(Window.getImages(Math.abs(19)), (int) (x + -300 + ((150 * Window.getScaleX()))), y,
					(int) (Window.getImages(Math.abs(19)).getWidth() * Window.getScaleX()),
					(int) (Window.getImages(Math.abs(19)).getHeight() * Window.getScaleY()), null);
		}

		for (int i = 0; i < answer.length(); i++) {
			if (Window.getKey().minus && i == 0) {
				a = Integer.parseInt(answer.substring(i, i + 2));
				i++;
			} else {
				a = Integer.parseInt(answer.substring(i, i + 1));
			}

			g.drawImage(Window.getNumbers(Math.abs(a)), (int) (x + (i * (150 * Window.getScaleX()))), y,
					(int) (Window.getNumbers(Math.abs(a)).getWidth() * Window.getScaleX()),
					(int) (Window.getNumbers(Math.abs(a)).getHeight() * Window.getScaleY()), null);

		}

		if (Window.getKey().minus && answer.length() > 0) {
			g.drawImage(Window.getImages(Math.abs(19)), (int) (x + -150 + ((150 * Window.getScaleX()))), y,
					(int) (Window.getImages(Math.abs(19)).getWidth() * Window.getScaleX()),
					(int) (Window.getImages(Math.abs(19)).getHeight() * Window.getScaleY()), null);
		}
	}


}
