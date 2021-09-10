package innlevering;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
	

	public static void main(String[] args) {
		boolean t = false;
		int heltall = 0;
		while(t == false) {
			heltall = parseInt(showInputDialog("skriv inn ett heltall"));
			if(heltall > 0) {
				t = true;
			}
		}
		int sum = 1;
		for(int i = 1; i <= heltall; i++) {
			 sum*= i;
		}
			
		System.out.println("Fakultet av " + heltall + " er " + sum);
	}

}
