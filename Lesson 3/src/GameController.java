import java.util.Scanner;
import java.util.Random;

public class GameController {


	public void guesstheMovie(String randomMovie,char[] movieNameHiddenToArray) {

		System.out.println("\nGuess the movie");
		System.out.println("\nEnter a letter");

		for(int j=1;j<=10;j++)
		{
			
			Scanner scanner=new Scanner(System.in);
			char guess=scanner.next().charAt(0);
			boolean correct=false;
			for(int i=0;i<movieNameHiddenToArray.length;i++)

			{		    

				if(randomMovie.charAt(i)==guess) 

				{
					
					movieNameHiddenToArray[i]=guess;
					System.out.println(movieNameHiddenToArray);	
					correct=true;
					
					
				}
				
			}
			
			if(correct)
			{
				System.out.println("You have guessed the right letter");
				System.out.println("\nEnter the next letter");
				
			}
			else
			{
				System.out.println("You have guessed a wrong letter, try again");
				System.out.println(movieNameHiddenToArray);
				
			}

		}
		System.out.println("You lost,all 10 chances are over");
	}

public void win()

         {
   	}
	public static void main (String [] args) 
	{

		System.out.println("I have generated a random movie name, try to guess it");
		//File file=new File("/home/veena/Movies.txt")


		String[] movies= {"the godfather","pulp fiction","forrest gump","the matrix","the shawshank redemption"};

		Random rand=new Random();
		int	indexOfRandomMovie=rand.nextInt(movies.length);
		String randomMovie=  movies[indexOfRandomMovie];

		//System.out.println(randomMovie );
		String movieNameHidden=randomMovie.replaceAll("[a-zA-Z]", "_");

		System.out.println(movieNameHidden);
		char[]  movieNameHiddenToArray = movieNameHidden.toCharArray();
		GameController gameController=new GameController();
		gameController.guesstheMovie(randomMovie,movieNameHiddenToArray);


	}

}












