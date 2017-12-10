package FrameWork;

import java.util.Scanner;

public class Load {
	public static int saveNum;

	public static void setNum(int i) {
		saveNum = i;
	}

	public static int get1() {
		int i2 = 1;
		return read(i2);

	}

	public static int get2() {
		int i2 = 2;
		return read(i2);

	}

	public static int get3() {
		int i2 = 3;
		return read(i2);

	}

	public static int get4() {
		int i2 = 4;
		return read(i2);

	}

	public static int get5() {
		int i2 = 5;
		return read(i2);

	}

	public static int get6() {
		int i2 = 6;
		return read(i2);

	}

	@SuppressWarnings("resource")
	private static int read(int i2) {
		int i = 1;
		String path = "";
		switch (saveNum) {
		case 1:
			path = "/Saves/Save1";
			break;
		case 2:
			path = "/Saves/Save2";
			break;
		case 3:
			path = "/Saves/Save3";
			break;

		}
		String text = new Scanner(Load.class.getResourceAsStream(path), "UTF-8").useDelimiter("\\A").next();
				for (String part : text.split("\\s+")) {
					if (i2 == i) {
						return Integer.parseInt(part);
					}
					i++;
				}
			
		
		return 0;
	}

}
