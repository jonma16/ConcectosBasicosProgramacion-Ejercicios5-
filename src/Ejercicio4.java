
public class Ejercicio4 {

	public static void main(String[] args) {
		int rowNumber, number, userRowNumber, numToPrint;
		
		System.out.println("Give how many rows you want:");
		userRowNumber = Console.readInt();
		
		numToPrint = 1;
		
		for (rowNumber=1; rowNumber<=userRowNumber; rowNumber++) {

			for (number=1;number<=rowNumber;number++) {
				System.out.print(numToPrint + " ");
				numToPrint++;
			}
			System.out.println();
		}
	}

}
