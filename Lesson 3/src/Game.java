import java.util.Scanner;

public class Game {

	
	public void guesstheMovie(String randomMovie,char[] movieNameHiddenToArray)
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
				String str=String.valueOf(movieNameHiddenToArray);
			
				if(randomMovie.equals(str))
				{
					System.out.println("Great!!! Congos! You win the game");
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
				System.out.println(movieNameHiddenToArray);
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
