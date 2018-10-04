import java.util.Scanner;
import java.util.Random;

public class GameController {
	
    

	


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
		Game game =new Game();
		game.guesstheMovie(randomMovie, movieNameHiddenToArray);


	}

}












