package FrameWork;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class ImageBank {
	ArrayList<BufferedImage> Images = new ArrayList<BufferedImage>();
	ArrayList<BufferedImage> Numbers = new ArrayList<BufferedImage>();
	String[] imageNames = new String[] { "0.png", "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png",
			"8.png", "9.png", "10.png", "11.png", "12.png", "13.png", "14.png", "15.png", "16.png", "plus.png",
			"18.png", "minus.png", "multi.png", "minus2.png", "22.png", "23.png", "24.png", "25.png", "26.png",
			"27.png", "28.png", "29.png", "30.png", "31.png", "32.png", "33.png", "34.png", "35.png", "36.png",
			"37.png", "38.png", "39.png", "40.png", "41.png", "42.png", "43.png", "44.png", "45.png", "46.png",
			"47.png", "48.png", "n1.png", "n2.png", "n3.png", "n4.png", "n5.png", "n6.png", "n7.png", "n8.png",
			"n9.png", "n10.png" };

	public ImageBank() {

		for (int i = 0; i < imageNames.length; i++) {
			BufferedImage b = null;
			try {
				b = ImageIO.read(getClass().getResourceAsStream("/ResourcesStatic/" + imageNames[i]));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(i > imageNames.length - 11){
				Numbers.add(b);
			}else{
			Images.add(b);
			}
		}
	}

	public ArrayList<BufferedImage> getImages() {
		return Images;

	}

	public ArrayList<BufferedImage> getNumbers() {
		return Numbers;

	}
}
