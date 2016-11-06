/**
 * 
 */

/**
 * @author Mohsen
 *
 */
import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
		System.out.print("Please enter your name: ");
		Scanner scanner = new Scanner(System.in);
		HelloUser helloUser = new HelloUser(scanner.nextLine());
		helloUser.greetUser();
		scanner.close();
	}

}
