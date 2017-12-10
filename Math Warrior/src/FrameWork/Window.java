package FrameWork;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Character.Player;
import Controls.KeyControl;
import Controls.MouseControl;
import Controls.MouseControl2;
import Game.GameScreen;
import Help.HelpScreen;
import LevelUp.LevelUpScreen;
import Level_Character.Level_CharacterScreen;
import Options.OptionsScreen;
import Save.SaveScreen;
import Splash.SplashScreen;

public class Window extends Canvas {
	private static final long serialVersionUID = 1L;
	private static BufferStrategy strategy;
	private static KeyControl key = new KeyControl();
	private static MouseControl mouse = new MouseControl();
	private static MouseControl2 mouse2 = new MouseControl2();
	private static JPanel panel;
	private static JFrame container;
	private static Player p;
	private static CurrentScreen screen;
	public static ImageBank bank;
	static Logic_Thread r;
	static Render_Thread r2;
	private static double displaySizeX = 1366, displaySizeY = 768;
	public static double optimalSizeX = 1366, optimalSizeY = 768;

	public Window() {

		container = new JFrame("Math Warrior");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		panel = (JPanel) container.getContentPane();
		panel.setPreferredSize(new Dimension((int) optimalSizeX, (int) optimalSizeY));
		setBounds(0, 0, 800, 600);
		panel.add(this);
		setIgnoreRepaint(true);
		container.pack();
		container.setResizable(false);
		container.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Save.save(); //IMPORTANT
				System.exit(0);
			}
		});
		bank = new ImageBank();
		addKeyListener(key);
		addMouseMotionListener(mouse);
		addMouseListener(mouse2);

		requestFocus();
		int x = (int) ((dimension.getWidth() - container.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - container.getHeight()) / 2);
		container.setLocation(x, y);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		screen = new SplashScreen();
		r = new Logic_Thread(screen);
		Thread t = new Thread(r);
		r2 = new Render_Thread(screen, strategy);
		Thread t2 = new Thread(r2);
		t.start();
		t2.start();
		changeDisplaySize(1366, 768, 0);
		container.setVisible(true);
		container.setCursor(container.getToolkit()
				.createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), "null"));

	}

	public static void changeDisplaySize(double x, double y, int index) {
		displaySizeX = x;
		displaySizeY = y;
		container.setSize((int) displaySizeX, (int) displaySizeY);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		container.setLocation((int) ((dimension.getWidth() - container.getWidth()) / 2),
				(int) ((dimension.getHeight() - container.getHeight()) / 2));
		for (int i = 0; i < 150; i++) {
			changeScreen(index);
		}
	}

	public static double getScaleX() {
		return displaySizeX / optimalSizeX;

	}

	public static double getScaleY() {
		return displaySizeY / optimalSizeY;

	}

	public static void changeScreen(int i) {
		//screen.comps.clear();
		switch (i) {
		case 0:
			screen = new SplashScreen();
			break;
		case 1:
			screen = new HelpScreen();
			break;
		case 2:
			screen = new OptionsScreen();
			break;
		case 3:
			screen = new Level_CharacterScreen();
			break;
		case 4:
			screen = new GameScreen(1);
			break;
		case 5:
			screen = new GameScreen(2);
			break;
		case 6:
			screen = new GameScreen(3);
			break;
		case 7:
			screen = new GameScreen(4);
			break;
		case 8:
			screen = new GameScreen(5);
			break;
		case 9:
			screen = new SaveScreen();
			break;
		case 10:
			screen = new LevelUpScreen();
			break;
		}
		r.change(screen);
		r2.change(screen);

	}

	public static CurrentScreen getScreen() {
		return screen;
	}

	public static JPanel getPanel() {
		return panel;
	}

	public static KeyControl getKey() {
		return key;
	}

	public static Player getP() {
		return p;
	}
	public static void setP(int i) {
		switch(i){
		case 1:
			Load.setNum(i);
			p = new Player(Load.get1(), Load.get2(), Load.get3(), Load.get4(), Load.get5(), Load.get6());
			break;
		case 2:
			Load.setNum(i);
			p = new Player(Load.get1(), Load.get2(), Load.get3(), Load.get4(), Load.get5(), Load.get6());
			break;
		case 3:
			Load.setNum(i);
			p = new Player(Load.get1(), Load.get2(), Load.get3(), Load.get4(), Load.get5(), Load.get6());
			break;
		}
		
	}
	
	public static MouseControl getMouse() {
		return mouse;
	}

	public static MouseControl2 getMouse2() {
		return mouse2;
	}

	public static BufferedImage getImages(int i) {
		return bank.getImages().get(i);
	}

	public static BufferedImage getNumbers(int i) {
		return bank.getNumbers().get(i);
	}

	public static void main(String args[]) {
		new Window();

	}
}
