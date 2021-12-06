package alaz_emma;
import java.util.Scanner;
import java.util.Random;

public class Project_3 {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
	Random Big = new Random();
int Var1 = 1 + Big.nextInt(10);
int Var2 = 1 + Big.nextInt(10);
	System.out.println("Your first card is a " + Var1);
	System.out.println("Your second card is a "+Var2);
int AddVar = (Var1 + Var2);
	
	
	if(AddVar < 21) {
	System.out.println("Do you choose to hit or stand?");
	
	}

}

}