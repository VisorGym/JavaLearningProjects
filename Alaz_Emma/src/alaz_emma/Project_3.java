package alaz_emma;
import java.util.Scanner;
import java.util.Random;

public class Project_3 {
	
	public static void main(String[] args) {
															//Receive two random cards in the beginning
	Random Big = new Random();	
	int Var1 = 1 + Big.nextInt(10);
	int Var2 = 1 + Big.nextInt(10);
	System.out.println("Your first card is a " + Var1);
	System.out.println("Your second card is a "+ Var2);
															//Add the first two numbers 
	int AddVar = (Var1 + Var2);
	Scanner scan = new Scanner(System.in);
	boolean Input = false;
															//if the total value is lower than 21, ask if you want to get more cards
	if(AddVar < 21) {
		System.out.println("Do you want more cards?");
	 Input = scan.nextBoolean(); 
															// If you chose hit, you will add that value of the new card to Var3, and add Var3 to AddVar to see if the total is greater than 21.
	 if(Input == true) {
		 int Var3 = 1 + Big.nextInt (10);
		 System.out.println("Your 3rd card is a "+ Var3);
	}
	 if(Input == false) {
	 System.out.println("You lost. The other opponent's cards are close to 21 than yours.");
	}
															//if the total value is greater than 21, you loose automatically) 
}
	}
}