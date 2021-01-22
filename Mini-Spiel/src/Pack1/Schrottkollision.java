package Pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Schrottkollision {
Timer kollision;
	public Schrottkollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				for(int i = 0; i<=4; i++) {
					
					if(Var.x>=Var.schrottx1[i]-50 && Var.x<=Var.schrottx1[i]+70 &&
							Var.y>= Var.schrotty1[i]-50 && Var.y <= Var.schrotty1[i]+50) {
						
						Var.schrott+=1;
						Var.schrotty1[i]=-200;
						
					}
					
				}
				for(int i = 0; i<=4; i++) {
					
					if(Var.x>=Var.schrottx3-50 && Var.x<=Var.schrottx3+70 &&
							Var.y>= Var.schrotty3-50 && Var.y <= Var.schrotty3+50) {
						
						Var.schrott+=1;
						Var.schrotty1[i]=-1500;
						
					}
					
				}
				for(int i = 0; i<=4; i++) {
					
					if(Var.x>=Var.schrottx2[i]-50 && Var.x<=Var.schrottx2[i]+70 &&
							Var.y>= Var.schrotty2[i]-50 && Var.y <= Var.schrotty2[i]+50) {
						
						Var.schrott+=1;
						Var.schrotty2[i]=-1500;
						
					}
					
				}
				
			}
			
			
			
		},0 , 15);
	}

}
