
public class CuboAsteriscos {


		public static void main(String[] args) {
			System.out.print("Introduce la altura: ");
	        int altura = Console.readInt();
	        
	        System.out.print("Introduce la anchura: ");
	        int anchura = Console.readInt();
	        
	        
	        
	        for (int i=0; i<altura; i++) {
	            for (int j=0; j<anchura; j++) {
	                if (i==0 | i == altura-1) {
	                	System.out.print("* ");                      
	                } else {
	                    if (j==0 || j == anchura-1) System.out.print("* "); //OR
	                    if (j!=0 && j != anchura-1) System.out.print("  "); //AND
	                }
	                
	                if (j == anchura-1) System.out.print("\n");
	            }
	        }			
				
		}

	

}
