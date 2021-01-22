package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Flammenanimationen {
	Timer flamme;
	private int temp = 0;

	public Flammenanimationen() {

		flamme = new Timer();
		flamme.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (temp == 0) {
					Var.flammenanimation = 0;
					temp++;
				} else if (temp == 1) {
					Var.flammenanimation =1;
					temp--;
				}
				}

		}, 0, 100);

	}

}
