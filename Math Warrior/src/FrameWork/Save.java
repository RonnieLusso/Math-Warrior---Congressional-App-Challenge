package FrameWork;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class Save {

	public static void save() {
		String path = "";
		switch (Load.saveNum) {
		case 1:
			path = "src\\Saves\\Save1";
			break;
		case 2:
			path = "src\\Saves\\Save2";
			break;
		case 3:
			path = "src\\Saves\\Save3";
			break;
		}
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"))) {
			writer.write(Window.getP().G + " " + Window.getP().H + " " + Window.getP().I + " " + Window.getP().S + " "
					+ Window.getP().E + " " + Window.getP().L);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
