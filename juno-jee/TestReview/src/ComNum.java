import java.util.Scanner;

public class ComNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		if (number < 10) {
			System.out.println("This number is too small");
		}
		
		else {
			System.out.println("This number is too large");
		}
	}

}
