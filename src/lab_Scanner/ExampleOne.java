/**
 * 
 */

package lab_Scanner;
// Class that uses a scanner class to input info from the console. inputs a line. We can also manually input.
import java.util.Scanner;
/**
 * @author user
 *
 */
public class ExampleOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type in a line and hit Enter.");
		String line = scanner.nextLine();
		
		System.out.println("You have typed out: " + line);
		
		scanner.close();
		
		String numbers = "1 2 3 5 7 8";
		
		scanner = new Scanner(numbers);
		
		while (scanner.hasNextInt()) {
			System.out.print(scanner.nextInt());
		}
		scanner.close();
		
		
		
	}
}
