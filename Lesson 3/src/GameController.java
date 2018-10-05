import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameController {

	public static void main (String [] args) throws FileNotFoundException 
	{
		ArrayList<String> movies=new ArrayList<>();

		String[] moviesListToArray= null;
		System.out.println("I have generated a random movie name, try to guess it");
		File file=new File("Movies.txt");
		Scanner scanner=new Scanner(file);
		while(scanner.hasNextLine())
		{

			movies.add(scanner.nextLine());

			moviesListToArray  = movies.toArray(new String[]{});
		}
		Random rand=new Random();
		int	indexOfRandomMovie=rand.nextInt(moviesListToArray.length);
		String randomMovie=  moviesListToArray[indexOfRandomMovie];
		String movieNameHidden=randomMovie.replaceAll("[a-zA-Z]", "_");
		System.out.println(movieNameHidden);
		char[]  movieNameHiddenToCharacters = movieNameHidden.toCharArray();
		Game game =new Game();
		game.checkForMatchingLetters(randomMovie, movieNameHiddenToCharacters);

	}
}

















