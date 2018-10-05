import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameController {
	 private static ArrayList<String> movies=new ArrayList<>();
	 
	
	public static void main (String [] args) throws FileNotFoundException 
	{

		String[] listToArray= null;
		System.out.println("I have generated a random movie name, try to guess it");
	 	 File file=new File("/home/veena/Movies.txt");
		  Scanner sc=new Scanner(file);
           while(sc.hasNextLine())
           {
        	   
             movies.add(sc.nextLine());
    
        	 listToArray  = movies.toArray(new String[]{});
           }
        	Random rand=new Random();
    		
			int	indexOfRandomMovie=rand.nextInt(listToArray.length);
    		
    		String randomMovie=  listToArray[indexOfRandomMovie];

    		System.out.println(randomMovie );
    		String movieNameHidden=randomMovie.replaceAll("[a-zA-Z]", "_");

    		System.out.println(movieNameHidden);
    		char[]  movieNameHiddenToCharacters = movieNameHidden.toCharArray();
    		Game game =new Game();
    		game.guesstheMovie(randomMovie, movieNameHiddenToCharacters);
                   
	
	}
	}
		

	














