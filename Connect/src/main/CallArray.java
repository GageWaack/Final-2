package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CallArray {
	 static int[][] array = {
		        {1,2,3},
		        {4,5,6},
		        {7,8,9} 
		        };
	 public static void DisplayArray()	 
	   {
		 int random;
		
	        for (int i = 0; i < array.length; i++) {
	        	for (int j = 0; j < array[i].length; j++) {
	        		System.out.print(" " + array[i][j] + " ");
	        	}
	        	System.out.println();
	        }
	        ArrayList<String> list = new ArrayList<>();
	        Scanner input = new Scanner(System.in);
	        int user; 
	        System.out.println(" Your turn, where would you like to place your coin? ");
	        user = input.nextInt();
	        // Display Choice
	        if (user == 1 ) 
	        {
	        	array[0][0] = 'x';
	        }
	        if (user == 2 ) 
	        {
	        	array[0][1] = 'x';
	        }
	        if (user == 3 ) 
	        {
	        	array[0][2] = 'x';
	        }
	        if (user == 4 ) 
	        {
	        	array[1][0] = 'x';
	        }
	        if (user == 5 ) 
	        {
	        	array[1][1] = 'x';
	        }
	        if (user == 6 ) 
	        {
	        	array[1][2] = 'x';
	        }
	        if (user == 7 ) 
	        {
	        	array[2][0] = 'x';
	        }
	        if (user == 8 ) 
	        {
	        	array[2][1] = 'x';
	        }
	        if (user == 9 ) 
	        {
	        	array[2][2] = 'x';
	        }

	        for (int i = 0; i < array.length; i++) {
	        	for (int j = 0; j < array[i].length; j++) {
	        		System.out.print(" " + array[i][j] + " ");
	        	}
	        	System.out.println();
//	    // AI
//	        	Random rand = new Random();
//	        	random = rand.nextInt((9) + 1);
//	        	if (random == 1 ) 
//		        {
//		        	array[0][0] = 'x';
//		        }
//	        	else if (random == 2 ) 
//		        {
//		        	array[0][1] = 'x';
//		        }
//	        	else if (random == 3 ) 
//		        {
//		        	array[0][2] = 'x';
//		        }
//	        	else if (random == 4 ) 
//		        {
//		        	array[1][0] = 'x';
//		        }
//	        	else if (random == 5 ) 
//		        {
//		        	array[1][1] = 'x';
//		        }
//	        	else if (random == 6 ) 
//		        {
//		        	array[1][2] = 'x';
//		        }
//	        	else if (random == 7 ) 
//		        {
//		        	array[2][0] = 'x';
//		        }
//	        	else if (random == 8 ) 
//		        {
//		        	array[2][1] = 'x';
//		        }
//	        	else if (random == 9 ) 
//		        {
//		        	array[2][2] = 'x';
//		        }
//		        for (int a = 0; a < array.length; a++) {
//		        	for (int b = 0; b < array[a].length; b++) {
//		        		System.out.print(" " + array[a][b] + " ");
//		        	}
	    }
	   }
	   }
	   
