package main;
import java.util.Scanner; 
public class Main 
{
    public static void main (String[]args)
    {
    	int input;
    	Scanner userInput;
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Do you want to play? 1 for yes 999 for no");
    	
    	input = in.nextInt();
    	if(input == 1)    	
    	{
    		//displaying board
    		PlainBoard.displayBetterBoard(input);
    		testBoard.displayBoard();
    	}   
    	else if (input == 999)
    	{
    		System.out.println("Your loss lul");
    	}
    	else
    	{
    		System.out.println("Cant read? ");
    	}
    	
    	
    	
    	
			
	
    }  
}
