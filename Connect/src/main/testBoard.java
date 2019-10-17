package main;

import java.util.Scanner;

public class testBoard 
{

	public static void displayBoard() 
	{
		// TODO Auto-generated method stub
	//do {
		String [] slots = {"1","2","3","4","5","6","7","8","9"};        
	        String user; 
	        System.out.println(" Your turn, where would you like to place your coin? 1-9, 999 to surrender");
	     
			Scanner input = new Scanner(System.in);
			user = input .next();
	        // Display Choice  
			for(int x = 0; x < slots.length; ++x) 
			{
				if(user.equals(slots[x]))
				{
					slots[x] = "X";
				}
			}
	        for (int i = 0; i < slots.length; i++) {
        		System.out.print(slots[i] + " ");
        		if(slots[i].equals("3") || slots[i].equals("6")) {	
        			System.out.println();
        //}
         //while(user != 999);
        			
        			
        		}
        }
	}

}
