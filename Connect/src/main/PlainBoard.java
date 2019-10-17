package main;


public class PlainBoard 
{
    public static void displayBetterBoard() 
    {
    	
    	//Displays big board
    	
		for(int j =0; j< 15; ++j) 
		{
		System.out.println("|	  			 |			    			|				|");
		}
		for (int i = 0; i < 113; ++i) 
		{
			System.out.print("_");
		}
		for (int j = 0; j < 15; ++j ) 
		{
		System.out.println("|	  			 |			    			|				|");
		}
		for (int i = 0; i < 113; ++i) 
		{
			System.out.print("_");
		}
		for(int j =0; j< 15; ++j) 
		{
		System.out.println("|	  			 |			    			|				|");
		}
		for (int i = 0; i < 113; ++i) 
		{
			System.out.print("_");
		}
		
		//Spacing between the boards
		
		System.out.println(" ");
		
		//Displays small board
		
		
    }
}

