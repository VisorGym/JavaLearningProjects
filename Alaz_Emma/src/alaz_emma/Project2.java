
package alaz_emma;
import java.util.Scanner;
public class Project2 {

	public static void main(String[] args) {
	//We put in years
	//Store it as variable
	//Use the MOD
	Scanner scan = new Scanner(System.in);

	System.out.println(" Please enter a year of your choice.");
		
	int x = scan.nextInt();
	if(x % 4 == 0 || x % 400 == 0 && x % 100 != 0) {

	System.out.println("The year you put in is a leap year");
	}
	else {
	System.out.println("Sorry, the year you put in is not a leap year");
	}
	}
}

