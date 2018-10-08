
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	boolean check;
	boolean correct;
	int tries=0;
	char[] movieNameHiddenToCharacters;
	String randomMovie;
	char guess;
	int wrong=0;
	
	 private ArrayList<Character> wrongCharacters = new ArrayList<>();
	
	public void checkForMatchingLetters(String randomMovie,char[] movieNameHiddenToCharacters)

	{

		this.randomMovie=randomMovie;
		this.movieNameHiddenToCharacters=movieNameHiddenToCharacters;
		check=true;

		while(check)
		{
			System.out.println("Guess a letter :" );
			Scanner scanner=new Scanner(System.in);
			guess=scanner.next().charAt(0);
			correct=false;
			for(int i=0;i<this.movieNameHiddenToCharacters.length;i++)
			{

				if(randomMovie.charAt(i)==guess) 

				{   
					this.movieNameHiddenToCharacters[i]=guess;
					correct=true;

				}

			}
			if(correct) {
				checkForWin();
			}
			else
			{

				checkForLoose();
			}
		}

	}


	public void checkForWin()
	{
		{


			String movieGuessed=String.valueOf(this.movieNameHiddenToCharacters);
			if(this.randomMovie.equals(movieGuessed))
			{
				System.out.println("You win!");
				System.out.println("You have guessed " + "'"+movieGuessed +"'"+" correctly");
				check=false;
			}
			else {

				System.out.println("You are guessing : " + movieGuessed);
				System.out.println("You have guessed " + "(" + wrong + ")"  + " wrong letters" );
			}
		}
	}

	public void checkForLoose()

	{

		wrong++;
	 
		wrongCharacters.add(guess);
		String movieGuessed=String.valueOf(this.movieNameHiddenToCharacters);
		System.out.println("You are guessing : " + movieGuessed);
		System.out.println("You have guessed " + "(" + wrong + ")"  + " wrong letters:" + wrongCharacters);
		tries++;

		if(tries==10)
		{

			check=false;
			System.out.println("Game over, You lost the game");
		}

	}

}


