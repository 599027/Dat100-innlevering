package innlevering;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class B5innlevering {

	public static void main(String[] args) {
		final int ANT_ELEVER=10;
				for (int elevnr=1; elevnr<=ANT_ELEVER; elevnr++ ) {
					
					int poeng=parseInt(showInputDialog("Hva er din poengsum p� pr�ven?"));
					if (poeng < 0 || poeng > 100) {
						boolean t = false;
						while(t == false) {
							poeng = parseInt(showInputDialog( poeng + " er ikke en gyldig poengsum p� denne pr�ven"));
							if(poeng < 100 && poeng > 0) {
								t = true;
							}
						}
					}
				
		
			
		if (poeng>=0 && poeng<=39) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter p� pr�ven er F");
        }
        else if (poeng>=40 && poeng<=49){
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter p� pr�ven er E");
        }
        else if (poeng>=50 && poeng<=59) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter p� pr�ven er D");
        }
        else if (poeng>=60 && poeng<=79) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter p� pr�ven er C");
        }
        else if (poeng>=80 && poeng<=89) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter p� pr�ven er B");
        }
        else if (poeng>=90 && poeng<=100) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter p� pr�ven er A");
        }
        else if (poeng>=101 || poeng<=-1) {
        	System.out.println("ugyldig sum");
        }
		}
        	
	}

}

