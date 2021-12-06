package alaz_emma;
import java.util.Scanner;
/* 
import java.util.Scanner;
Scanner input = new Scanner(System.in);
double choice = input.nextDouble(); 
 */

public class Lesson2 {
	public static void main (String[] argv){
		Scanner scan = new Scanner(System.in);
	
		System.out.println(" Please enter 3 numbers of your choice.");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if(big(x,y,z) == 1000 ) {
			System.out.println(" Two of the numbers you put are the same.");
		}
		if(big(x,y,z) == 1001) {		
			System.out.println("All of the numbers you chose are the same.");
		}
		if(big(x,y,z) != 1001 && big(x,y,z) != 1000) {	
			System.out.println(big(x,y,z) + " is the biggest number out of the numbers you chose!");
		}
	}
	public static double big (double FirstNumber, double SecondNumber, double ThirdNumber){

		if(FirstNumber == SecondNumber && FirstNumber == ThirdNumber) {
		return 1001;
		}
		
	
	  if(FirstNumber > SecondNumber && FirstNumber > ThirdNumber)
	  {
	    return FirstNumber;
	  } 
	  if(SecondNumber > FirstNumber && SecondNumber > ThirdNumber) 
	  {
	    return SecondNumber;
	  }

	  if(ThirdNumber > FirstNumber && ThirdNumber > SecondNumber) {
	    return ThirdNumber;
	  }
	  
	  if(FirstNumber == SecondNumber || FirstNumber == ThirdNumber) {   
 return 1000 ;
	  
	  } 
	  return 0;
	}
	

	}


	






