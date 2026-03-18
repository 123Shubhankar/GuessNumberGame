package com;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*Develop a number guessing game where the program generate a random number and user has to guess it*/
/*
 * Use java's Random class to generate a random number
 * give feedback to user (e.g., "too high", "too low").
 * limit the number of attempts and handle invalid inputs
 */
public class GuessNumberGame {

	public static void main(String[] args) {
		
		//creating instance of random class provided by java .
		Random random = new Random();
		
		//Scanner class object to input number from user
		Scanner sc = new Scanner(System.in);
		try{

			//It will generate number between 0-99.To take number between 1-100 we add 1.
			int generatedNumber = 1 + random.nextInt(100);
//			System.out.println("RandomNumber is : "+generatedNumber);
			
			//handling the number attempts i.e., limiting attempt for users
			for(int i=0; i < 5; i++) {
				System.out.println("guess the number : ");
				int gussedNumber = sc.nextInt();
				if(generatedNumber == gussedNumber) {
					System.out.println("Your guess is correct.You won! ");
					break;
				}
				
				int differnce = Math.abs(generatedNumber - gussedNumber );
				
//				int diff = (generatedNumber > gussedNumber) ? generatedNumber-gussedNumber : gussedNumber-generatedNumber;
				if(differnce >= 50) {
					System.out.println("high");
				} else {
					System.out.println("low");
				}
				
			}
			System.out.println("Better luck next time!");
			sc.close();
		
		}
		//handling InputMismatchException
		catch(InputMismatchException e) {
			System.out.println("Invalid input. Enter numeric value between 1 - 100");
		}

		
	}

}
