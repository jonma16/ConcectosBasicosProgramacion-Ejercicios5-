
public class Ejercicio3 {

	public static void main(String[] args) {
		int rowNumber, number, userRowNumber, numToPrint;
		
		System.out.println("Dame un numero:");
		userRowNumber = Console.readInt();
		
		for (rowNumber=1; rowNumber<=userRowNumber; rowNumber++) {
			if(rowNumber % 2 == 0) {
				numToPrint = 0;
			}
			else {
				numToPrint = 1;
			}
			numToPrint = rowNumber % 2;
			for (number=1;number<=rowNumber;number++) {
				System.out.print(numToPrint);
				if (numToPrint == 1) {
					numToPrint = 0;
				}
				else {
					numToPrint = 1;
				}
			}
			System.out.println();
		}
	}

}
