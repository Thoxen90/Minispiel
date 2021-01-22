package Pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {

	private int temp = 0;
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
		g.drawImage(Var.ib1, 0, Var.backgroundY2, 800, 600, null);

		for (int i = 0; i <= 4; i++) {
			g.drawImage(Var.ischrott1, Var.schrottx1[i], Var.schrotty1[i], 48, 38, null);
		}

		for (int i = 0; i <= 2; i++) {
			g.drawImage(Var.ischrott2, Var.schrottx2[i], Var.schrotty2[i], 48, 38, null);
		}

		g.drawImage(Var.ischrott3, Var.schrottx3, Var.schrotty3, 48, 38, null);

		if (Var.flammenanimation == 0) {
			g.drawImage(Var.iflamme1, Var.x + 10, Var.y + 55, 30, 40, null);
		} else if (Var.flammenanimation == 1) {
			g.drawImage(Var.iflamme2, Var.x + 10, Var.y + 55, 30, 40, null);
		}

		for (int i = 0; i < 4; i++) {
			g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 50, 50, null);
		}
		g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);

		if (Var.verloren) {
			g.setColor(new Color(0, 230, 155));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Schrott: " + Var.schrott, 310, 200);
			repaint();
		} else {
			g.setColor(new Color(0, 230, 155));
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("Schrott: " + Var.schrott, 20, 20);
			repaint();
		}

		if (Var.kollidiert) {
			for (int i = 0; i < 10; i++) {
				if (Var.expanimation == i) {
					g.drawImage(Var.iexplosion[i], Var.x - 10, Var.y - 10, 73, 100, null);
				}
			}

			if (Var.expanimation > 1 && Var.expanimation <= 4) {
				g.setColor(new Color(230, 0, 0, 45));
				g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
			} else if (Var.expanimation >= 6 && Var.expanimation <= 9) {
				g.setColor(new Color(230, 0, 0, 45));
				g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
			}

		}

		repaint();

	}

}
