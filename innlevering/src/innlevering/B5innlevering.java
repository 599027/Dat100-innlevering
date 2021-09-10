package innlevering;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class B5innlevering {

	public static void main(String[] args) {
		final int ANT_ELEVER=10;
				for (int elevnr=1; elevnr<=ANT_ELEVER; elevnr++ ) {
					
					int poeng=parseInt(showInputDialog("Hva er din poengsum på prøven?"));
					if (poeng < 0 || poeng > 100) {
						boolean t = false;
						while(t == false) {
							poeng = parseInt(showInputDialog( poeng + " er ikke en gyldig poengsum på denne prøven"));
							if(poeng < 100 && poeng > 0) {
								t = true;
							}
						}
					}
				
		
			
		if (poeng>=0 && poeng<=39) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter på prøven er F");
        }
        else if (poeng>=40 && poeng<=49){
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter på prøven er E");
        }
        else if (poeng>=50 && poeng<=59) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter på prøven er D");
        }
        else if (poeng>=60 && poeng<=79) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter på prøven er C");
        }
        else if (poeng>=80 && poeng<=89) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter på prøven er B");
        }
        else if (poeng>=90 && poeng<=100) {
        	System.out.println("elev nummer:" +  elevnr + " " + "Din karakter på prøven er A");
        }
        else if (poeng>=101 || poeng<=-1) {
        	System.out.println("ugyldig sum");
        }
		}
        	
	}

}

