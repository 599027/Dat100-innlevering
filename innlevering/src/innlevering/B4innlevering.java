package innlevering;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class B4innlevering {

	public static void main(String[] args) {
double skatt =parseInt(showInputDialog("Hva er din bruttoinntekt?"));

		 if (skatt>=0 && skatt<=164100){
		 skatt*=0;
		 }
		 else if(skatt >=164101 && skatt<=230950){
		 skatt*=0.0093;
		 }
		 else if(skatt>=230951 && skatt<=580650){
			 skatt*=0.0241;
		 }
		 else if(skatt>=580651 && skatt<=934050) {
			 skatt*=0.1152;
		 }
		 else if(skatt>=934051) {
		 skatt*=0.01452;
		 }
			 
	
			 
	showMessageDialog(null,"Skatten du må betale er" + " " + skatt + "kr");			 

	}
	
}

