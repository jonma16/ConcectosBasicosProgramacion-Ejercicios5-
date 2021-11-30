
public class Ejercicio5 {
	public static void main(String args[]) {
		int fila, i, j;

		// getting number of rows from user
		System.out.println("Mete el numero de filas:");
		fila = Console.readInt();

		for (i = 0; i < fila; i++) {
			for (j = 1; j < fila - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
