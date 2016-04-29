import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class conditionals 
{

	public static void main(String[] args)
	{
		ageQuestion();
		askingPet();
		numberGame();
		exitingTicket();
		rollDice();
	}
	public static void ageQuestion() 
	{
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = userInput.nextInt();
		if (age<5)
		{
			System.out.println("Wisdom comes with age.");
		}
		else if (age>10)
		{
			System.out.println("You're practically a teenager");
		}
		else
		{
			System.out.println("Savor your years.");
		}	
	}
 
	public static void askingPet()
		{
			Scanner favPet = new Scanner(System.in);
			System.out.println("What's your favorite type of pet?");
			System.out.println("Turtle");
			System.out.println("Lion");
			System.out.println("Mouse");
			String choice = favPet.nextLine();
			if (choice.equals("Turtle"))
			{
				System.out.println("Cool!  They're the Bee's knees");
			}
			else if (choice.equals("Lion"))
			{
				System.out.println("Do you like the Lion King by chance?");	
			}
			else 
			{
				System.out.println("...are you sure?");
			}
		}
	public static void numberGame()
		{
			Scanner decision = new Scanner(System.in);
			System.out.println("Let's play a game!");
			String answer = decision.nextLine();
			System.out.println("I want to play.");
			System.out.println("I'm thinking of a number between 1 and 80");
			int randomNumber = (int) (Math.random()*80)+1;	
			int guess = decision.nextInt();
			if (guess < 30)
			{
				System.out.println("Too low.  Do you like chairs?");
			}
			else if (guess > 40)
			{
				System.out.println("Too High...  Do you doors?");
			}
			else
			{
				System.out.println("Niiicccccceeeeeeeeeeeeee!  Do you like light switches?");
			}
			Scanner yesNo = new Scanner(System.in);
			String ruling = yesNo.nextLine();
			System.out.println("Chill~~~");
		}
	public static void exitingTicket ()
		{
			System.out.println("Well, it was nice talking to you. :)");
			System.out.println("I am going to leave you with this chill lyric...(ahem) My mama don't like you and she like everyyone~~~");
	
		}
	static int diceTotal;
	public static void rollDice ()
	
	{
		System.out.println("dice total of 2 rolls");
		Scanner userInput2= new Scanner(System.in);
		int roll= (int) (Math.random()*6)+1;
		int roll2= (int) (Math.random()*6)+1;
		int diceTotal = roll + roll2;
		System.out.println("you rolled a "+ diceTotal);
	}
	{
	System.out.println("you rolled a "+ diceTotal);
}
}


