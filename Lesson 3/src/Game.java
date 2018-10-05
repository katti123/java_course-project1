import java.util.Scanner;

public class Game {


	public void guesstheMovie(String randomMovie,char[] movieNameHiddenToCharacters)
	{
		int tries=0;
		System.out.println("\nGuess the movie");
		System.out.println("\nEnter a letter");
		boolean check=true;
		while(check)

		{

			Scanner scanner=new Scanner(System.in);
			char guess=scanner.next().charAt(0);
			boolean correct=false;
			for(int i=0;i<movieNameHiddenToCharacters.length;i++)

			{		    
				if(randomMovie.charAt(i)==guess) 

				{
					movieNameHiddenToCharacters[i]=guess;
					System.out.println(movieNameHiddenToCharacters);	
					correct=true;

				}

			}

			if(correct)

			{
				String movieGuessed=String.valueOf(movieNameHiddenToCharacters);

				if(randomMovie.equals(movieGuessed))
				{
					System.out.println("Great!!! Congos! You win");
					check=false;
				}
				else {
					System.out.println("You have guessed the right letter");
					System.out.println("\nEnter the next letter");
					System.out.println();
				}

			}

			else

			{   
				System.out.println("This letter is not there in the movie title");
				System.out.println(movieNameHiddenToCharacters);
				tries++;
				System.out.println("You lost " + tries + " points");
			}

			if(tries==10)
			{

				check=false;
				System.out.println("Game over, You lost the game");
			}

		}
	}	

}
