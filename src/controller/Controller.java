package controller;

import java.util.Scanner; 

public class Controller
{
	public void start()
	{
		questions();
		
		moreInput();
		
	}

	private void questions ()
	
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("What is your favorite color?");
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("To be or nah?");
		answer = inputScanner.next();
		System.out.println(answer);
		
		inputScanner = new Scanner(System.in);
		
		System.out.println("What is the best type of food?");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("Why im I so sad?");
		answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println("Who?");
		answer = inputScanner.next();
		System.out.println(answer);
		
		System.out.println("Intel?");
		answer = inputScanner.next();
		System.out.println(answer);
		

//      inputScanner.close();
		//CLOSED BECAUSE I AM STILL USING THE InputStream FROM THE KEYBOARD AND SONT WANT ERRORS 
	}
	
	private void moreInput()
	{

		Scanner textScanner; //This is a declaration of a Scanner variable.
		
		textScanner = new Scanner(System.in); //Initialization of the textScanner variable.
		
		System.out.println("Type in your favorite number");
		int userNumber = textScanner.nextInt();		
		System.out.println("Your favorite number is: " + userNumber);
		
		textScanner = new Scanner(System.in);
		
		System.out.println("Type in some more information");
		
		
		//Need to call .nextLine() to consume the enter press after the call to .next, .nextInt,or .nextDoublee
 		textScanner.nextLine();
		
		textScanner.close();

		
	}

   public boolean validInt(String sample)
    {
	 boolean isValid = false;
	 
	 return isValid;
    }
}