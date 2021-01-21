package Pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {
	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0;
	static int backgroundY2 = -600, backgroundspeed = 9;
	static int x = 400, y = 400;
	static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
	static int flammenanimation;
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	static Label lbl1;

	static BufferedImage ib1, ib2;
	static BufferedImage irakete, iflamme1, iflamme2;

	public Var() {

		try {
			// Background
			ib1 = ImageIO.read(new File("rsc/b1.png"));
			ib2 = ImageIO.read(new File("rsc/b1.png"));
			// Rakete
			irakete = ImageIO.read(new File("rsc/rakete.png"));
			// Flamme
			iflamme1 = ImageIO.read(new File("rsc/ifl1.png"));
			iflamme2 = ImageIO.read(new File("rsc/ifl2.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konntne nicht geladen werden");
		}

	}

}
