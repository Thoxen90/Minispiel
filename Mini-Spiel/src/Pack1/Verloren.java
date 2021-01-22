package Pack1;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Verloren {
Timer loose;
private int temp = 0, temp1 = 0, temp2 = 0;
private Random r = new Random();

	public Verloren() {
		loose = new Timer();
		loose.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(temp>=0 && temp <=55) {
					temp++;
				}else if (temp == 56) {
					
					System.out.println("Verloren");
					//Schrott platzierung
					for(int i =0;i<=4;i++) {
						Var.schrottx1[i]= 20+temp1;
						Var.schrotty1[i]= -200 -temp1;
						
						temp1+=160;
					}
					
					Var.schrottx2[0]=266;
					Var.schrottx2[1]=532;
					Var.schrotty2[0]=-1000;
					Var.schrotty2[1]=-1500;
					
					Var.schrottx3 = 350;
					Var.schrotty3 = -4000;
					
					//gegner platzierung
					
					for(int i = 0; i <= 4; i++) {
						Var.gegnery[i]=0;
					}
					for (int i = 0; i < 5; i++) {
						Var.gegnerx[i] = r.nextInt(800);
						Var.gegnery[i] = -100 - temp;

						temp += 160;
					}
					
					temp=0;
					if(Var.schrott>=50) {
						Var.schrott-=50;
					}else {
						Var.schrott = 0;
					}
					
					Var.leben = Var.maxleben;
					Var.verloren = false;
					
				}
			}
			
			
			
		},0,15);
	}

}
