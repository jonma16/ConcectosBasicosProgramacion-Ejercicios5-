
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dame un numero: ");
		int numero = Console.readInt();
		
		for (int fila=1; fila<=numero; fila++) {
			for (int num=1; num<=fila;num++) {
				System.out.print(fila);
			}
			System.out.println ();
		}
	}

}
