import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class GameController {

	private int noOfGuesses=9;
    boolean correct=false;


	public void guessLetters(String randomMovie,char[] movieNameHide) {

		System.out.println("Guess the movie");
		System.out.println("Enter a letter");
		for(int j=0;j<10;j++)
		{
		Scanner scanner=new Scanner(System.in);
		char guess=scanner.next().charAt(0);
		for(int i=0;i<movieNameHide.length;i++)
		{
	    	
	    	if(randomMovie.charAt(i)==guess)
		   {	
				
				
	     		
			    movieNameHide[i]=guess;
				System.out.println(movieNameHide);
				noOfGuesses--;
				System.out.println("\nEnter the next letter");
                
		   }
	    	
	    	
		   
		}
		  
		   System.out.println("You have guessed a wrong letter");
    		System.out.println("\nYou have " +  noOfGuesses  + " chances " + " left " );
    	
	    	
		 }
		
		
		System.out.println("You lost");
		
		
		
}
		
	
	public static void main (String [] args) throws FileNotFoundException
	{

		System.out.println("I have generated a random movie name, try to guess it");
		//File file=new File("/home/veena/Movies.txt")


		String[] movies= {"the godfather","pulp fiction","forrest gump","the matrix","the shawshank redemption"};

		Random rand=new Random();
		int	indexOfRandomMovie=rand.nextInt(movies.length);
		String randomMovie=  movies[indexOfRandomMovie];

		System.out.println(randomMovie );
		String movieNameHidden=randomMovie.replaceAll("[a-zA-Z]", "_");

		System.out.println(movieNameHidden);
		char[]  movieNameHide = movieNameHidden.toCharArray();
		GameController gc=new GameController();
		gc.guessLetters(randomMovie,movieNameHide);


	}

}













