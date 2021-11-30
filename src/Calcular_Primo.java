
public class Calcular_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dame un numero: ");
		int numero = Console.readInt();
		int contador=0;
		
		for (int x=1;x<=numero;x++) {
			
			if (numero%x==0) {
				contador++;	
			}

		}
		
		if (contador<=2) {
			System.out.println(numero + " Es primo");
		}
		
		else {
			System.out.println(numero + " No es primo");
		}
		

	}

}
