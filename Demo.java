import java.util.Arrays;

public class Demo {
	
	   public static void main(String[] args) {
		    
		   Auto a = new Auto();
		   Monteur m = new Monteur();
		   m.repareren(a);
		  	   
	   }
	   
}

class Auto {
	
	boolean motor;
	boolean deur;
	boolean voorruit;
	boolean uitlaat;

	boolean o[];
	Auto() {
		
		   o = new boolean[4];
		   o[0] = false;
		   o[1] = true;
		   o[2] = false;
		   o[3] = false;
		   
		   System.out.println(Arrays.toString(o));
		
	}
	  
}

class Monteur {
	int prijs = 0;
	void repareren(Auto auto) {
		
		for(int i = 0; i < auto.o.length; i++) {
			if(auto.o[i] == true) {
				prijs += 25;
				auto.o[i] = false;
			}
		}
		
		System.out.println(prijs);
		
	}
}
