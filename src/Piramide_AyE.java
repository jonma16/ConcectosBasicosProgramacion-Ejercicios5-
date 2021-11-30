
public class Piramide_AyE {

	public static void main(String[] args) {
		System.out.println("Dame un numero : ");
		int numero = Console.readInt();
		        for(int fila = 1; fila<=numero; fila++){
		            for(int esapcios = 1; esapcios<=numero-fila; esapcios++){
		                System.out.print(" ");
		            }
		           
		            for(int asteriscos=1; asteriscos<=(fila*2)-1; asteriscos++){
		                System.out.print("*");
		            }
		            System.out.println();   
		        }
		        
		        for(int fila =numero-1; fila>=1; fila--){
		            for(int esapcios = 1; esapcios<=numero-fila; esapcios++){
		                System.out.print(" ");
		            }
		           
		            for(int asteriscos=1; asteriscos<=(fila*2)-1; asteriscos++){
		                System.out.print("*");
		            }
		            System.out.println();   
		        }
		}



}
