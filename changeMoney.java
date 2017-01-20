package greedyAlgorithm_US_change;


import java.io.IOException;
import java.util.Scanner;
public class changeMoney {
	public static void main(String[] args) throws IOException, InterruptedException {
		int c = 0,c11=0,c2=0;
		final Scanner STDIN_SCANNER = new Scanner(System.in);	
		//reading money
		/*
		System.out.println("How much dollars you owed? ");
		c11 = STDIN_SCANNER.nextInt(); 
		System.out.println("How much cents you owed? ");
		c2 = STDIN_SCANNER.nextInt(); 
		*/
		//convert all money to cents
		c= c2+ (c11*100);
		c=44;
		System.out.print("with "+c+" cents ");
		int c25 = 0, c10 = 0, c5 = 0, c1 = 0;
		//Gets 25c coins
		while(c >= 25) {
			c25++;
			c = c - 25;
		}
		//Gets 10c coins
		while(c >= 10) {
			c10++;
			c = c - 10;
		}
		//Gets 5c coins
		while(c >= 5) {
			c5++;
			c = c - 5;
		}
		//Gets 1c
		while(c >= 1) {
			c1++;
			c = c - 1;
		}
		//print the results
		System.out.println("You have: " + c25 + " Quarters, " + c10 +" Dimes, "+ c5 +" Nickels and "+c1+" Pennies with remainder  " + c);		
	}
}