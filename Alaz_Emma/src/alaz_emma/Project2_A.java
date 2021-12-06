
package alaz_emma;
import java.util.Scanner;
public class Project2_A {

	public static void main(String[] args) {
	//We put in years
	//Store it as variable
	//Use the MOD
	Scanner scan = new Scanner(System.in);
	

	System.out.println(" Please enter a year of your choice.");
	int year = scan.nextInt();
	KYLE(year);
	}
	public static void KYLE (int x) {
		if(x % 4 == 0 || x % 400 == 0 && x % 100 != 0) {
    System.out.println("The year you put in is a leap year");
	}
	else {
	System.out.println("Sorry, the year you put in is not a leap year");

	}
	}
}

