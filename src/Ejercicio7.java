
public class Ejercicio7 {
	public static void main(String args[]) {
		int ROWS, rowCounter, whiteSpCounter, rowStarTotal, starCounter;
		int topRowAmount, bottomRowAmount;
		
		// getting number of rows from user
		System.out.println("Enter number of rows:");
		ROWS = Console.readInt();
		
		topRowAmount = ROWS/2 + 1;
		rowStarTotal = 1;
		rowCounter = 1;
		while (rowCounter <= topRowAmount) {
			
			whiteSpCounter = 1;
			while (whiteSpCounter <= topRowAmount - rowCounter) {
				System.out.print("  ");
				whiteSpCounter++;
			}
			
			starCounter = 1;
			while (starCounter <= rowStarTotal) {
				System.out.print("* ");
				starCounter++;
			}
			rowStarTotal = rowStarTotal + 2;
			
			System.out.println();
			rowCounter++;
		}
		
		
		bottomRowAmount = ROWS/2;
		rowStarTotal = rowStarTotal - 4;
		rowCounter = 1;
		while (rowCounter <= bottomRowAmount) {
			
			whiteSpCounter = 1;
			while (whiteSpCounter <= rowCounter) {
				System.out.print("  ");
				whiteSpCounter++;
			}
			
			starCounter = 1;
			while (starCounter <= rowStarTotal) {
				System.out.print("* ");
				starCounter++;
			}
			rowStarTotal = rowStarTotal - 2;
			
			System.out.println();
			rowCounter++;
		}
	}
}
