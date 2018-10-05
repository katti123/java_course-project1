import java.util.Scanner;

public class Game {

	boolean check;
	boolean correct;
	int tries=0;
	char[] movieNameHiddenToCharacters;
	String randomMovie;
	char guess;
	

	public void checkForMatchingLetters(String randomMovie,char[] movieNameHiddenToCharacters)

	{
		this.randomMovie=randomMovie;
		this.movieNameHiddenToCharacters=movieNameHiddenToCharacters;
		check=true;
		System.out.println("\nGuess the movie");
		System.out.println("\nEnter a letter");
		while(check)
		{
			Scanner scanner=new Scanner(System.in);
			guess=scanner.next().charAt(0);
			correct=false;
			for(int i=0;i<this.movieNameHiddenToCharacters.length;i++)

			{		    
				if(randomMovie.charAt(i)==guess) 

				{
					this.movieNameHiddenToCharacters[i]=guess;
					System.out.println(this.movieNameHiddenToCharacters);	
					correct=true;
					
				}
				
			}
			
			if(correct) {
				checkForWin();
			}
			else
			{
				checkForPointsLost();
			}
		}

		}
	
	
	public void checkForWin()

	{
		{
			
		String movieGuessed=String.valueOf(this.movieNameHiddenToCharacters);
			if(this.randomMovie.equals(movieGuessed))
			{
				System.out.println("Great!!! Congos! You win");
				check=false;
			}
			else {
				System.out.println("You have guessed the right letter");
				System.out.println("\nEnter the next letter");
			}
		}
	}

	public void checkForPointsLost()
	
	{  
		
		tries++;
		System.out.println("\nThis letter is not there in the movie title,try with different letter");
		System.out.println("\nYou lost " + tries + " points");
		System.out.println(this.movieNameHiddenToCharacters);
		if(tries==10)
		{

			check=false;
			System.out.println("Game over, You lost the game");
		}

	}

}


