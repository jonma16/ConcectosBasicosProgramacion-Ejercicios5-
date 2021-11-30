
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dame un numero y te digo el mes");
		int num = Console.readInt();
		
		if (num==1) {
			System.out.println("Enero");
		}
		
		else if (num ==2) {
			System.out.println("Febrero");
		}
		
		else {
			System.out.println("No hay mes con ese numero");
		}

	}

}
