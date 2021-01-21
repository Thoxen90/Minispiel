package Pack1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(Var.ib1, 0 , Var.backgroundY1,800,600, null);
		g.drawImage(Var.ib1, 0 , Var.backgroundY2, 800, 600, null);
		
		g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
		
		if(Var.flammenanimation==0) {
			g.drawImage(Var.iflamme1, Var.x, Var.y+60, 50, 50, null);
		}else if(Var.flammenanimation==1) {
			g.drawImage(Var.iflamme2, Var.x, Var.y+60, 50, 50, null);
		}
		
		repaint();

	}

}
