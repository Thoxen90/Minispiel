package Pack1;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Gegnermovement {
	Timer movement;
	private int temp = 0;
	private Random r= new Random();

	public Gegnermovement() {

		for (int i = 0; i < 5; i++) {
			Var.gegnerx[i] = r.nextInt(800);
			Var.gegnery[i] = -100 - temp;

			temp += 160;
		}

		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					Var.gegnery[i] += Var.gegnerspeed[i];
					if (Var.gegnery[i] >= Var.screenheight) {
						Var.gegnery[i] = -100;
						Var.gegnerx[i] = r.nextInt(800);
					}
				}
			}

		}, 0, 9);

	}

}
