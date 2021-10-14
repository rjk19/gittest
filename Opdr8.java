
public class Opdr8 {

	   public static void main(String[] args) {
		    
		   Boot boot = new Boot();
		   Speedboat spboat = new Speedboat();
		   Kapitein k = new Kapitein();
		   k.varen(spboat);
		  	   
	   }
}

class Boot{
	void starten() {
		
	}
}

class Speedboat extends Boot {
	void starten() {
		System.out.println("Ik zet even mijn pet af");
	}
}

class Kapitein {
	
	void varen(Boot boot) {
		
		boot.starten();
		
		
	}
	
}
