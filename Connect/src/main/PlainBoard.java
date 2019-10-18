package main;
import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers

public class PlainBoard 
{

	public static void displayBetterBoard(int input) 
    {
		if (input == 1)
		{
			System.out.println("|							   /	|									  |										   |");
			System.out.println("|							  /	    |									  |										   |");
			System.out.println("|							 /		|									  |										   |");
			System.out.println("|							/		|									  |										   |");
			System.out.println("|						   /		|									  |										   |");
			System.out.println("|						  /			|									  |										   |");
			System.out.println("|						 /			|									  |										   |");
			System.out.println("|						/			|									  |										   |");
			System.out.println("|					   /			|									  |										   |");
			System.out.println("|					  /				|									  |										   |");
			System.out.println("|					 /				|									  |										   |");
			System.out.println("|					/				|									  |										   |");
			System.out.println("|				   /				|									  |										   |");
			System.out.println("|				  /					|									  |										   |");
			System.out.println("|				 /					|									  |										   |");
			System.out.println("________________/_________________________________________________________________________________________________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("___________________________________________________________________________________________________________________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
		}
		if (input == 2)
		{
			System.out.println("|							   		|									 /|										   |");
			System.out.println("|							  	    |									/ |										   |");
			System.out.println("|							 		|								   /  |										   |");
			System.out.println("|									|								  /   |										   |");
			System.out.println("|						   			|								 /    |										   |");
			System.out.println("|						  			|								/	  |										   |");
			System.out.println("|						 			|							   /	  |										   |");
			System.out.println("|									|							  /		  |										   |");
			System.out.println("|					   				|							 /	      |										   |");
			System.out.println("|					  				|							/		  |										   |");
			System.out.println("|					 				|						   /		  |										   |");
			System.out.println("|									|						  /			  |										   |");
			System.out.println("|				   					|						 /			  |										   |");
			System.out.println("|				  					|						/			  |										   |");
			System.out.println("|				 					|					   /			  |										   |");
			System.out.println("__________________________________________________________/______________________________________________________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("___________________________________________________________________________________________________________________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
		}
		if (input == 3)
		{
			System.out.println("|							   		|									  |										  /|");
			System.out.println("|							  	    |									  |										 / |");
			System.out.println("|							 		|									  |										/  |");
			System.out.println("|									|									  |									   /   |");
			System.out.println("|						   			|									  |									  /    |");
			System.out.println("|						  			|									  |								     / 	   |");
			System.out.println("|						 			|									  |									/      |");
			System.out.println("|									|									  |								   /	   |");
			System.out.println("|					   				|									  |								  /		   |");
			System.out.println("|					  				|									  |								 /		   |");
			System.out.println("|					 				|									  |								/		   |");
			System.out.println("|									|									  |							   /		   |");
			System.out.println("|				   					|									  |							  /			   |");
			System.out.println("|				  					|									  |							 /			   |");
			System.out.println("|				 					|									  |							/			   |");
			System.out.println("___________________________________________________________________________________________________/_______________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("___________________________________________________________________________________________________________________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
		}
		if (input == 4)
		{
			System.out.println("|							    	|									  |										   |");
			System.out.println("|							  	    |									  |										   |");
			System.out.println("|							 		|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|						    		|									  |										   |");
			System.out.println("|						    		|									  |										   |");
			System.out.println("|						 			|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|					    			|									  |										   |");
			System.out.println("|					    			|									  |										   |");
			System.out.println("|					 				|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|				    				|									  |										   |");
			System.out.println("|				    				|									  |										   |");
			System.out.println("|				 					|									  |										   |");
			System.out.println("___________________________________________________________________________________________________________________");
			System.out.println("|								/	|									  |										   |");
			System.out.println("|							   /	|									  |										   |");
			System.out.println("|							  / 	|									  |										   |");
			System.out.println("|							 /		|									  |										   |");
			System.out.println("|							/		|									  |										   |");
			System.out.println("|						   /		|									  |										   |");
			System.out.println("|						  /			|									  |										   |");
			System.out.println("|						 /			|									  |										   |");
			System.out.println("|						/			|									  |										   |");
			System.out.println("|					   /			|									  |										   |");
			System.out.println("|					  /				|									  |										   |");
			System.out.println("|					 /				|									  |										   |");
			System.out.println("|					/				|									  |										   |");
			System.out.println("|				   /				|									  |										   |");
			System.out.println("__________________/________________________________________________________________________________________________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
		}
		if (input == 5)
		{
			System.out.println("|							    	|									  |										   |");
			System.out.println("|							  	    |									  |										   |");
			System.out.println("|							 		|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|						    		|									  |										   |");
			System.out.println("|						    		|									  |										   |");
			System.out.println("|						 			|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|					    			|									  |										   |");
			System.out.println("|					  				|									  |										   |");
			System.out.println("|					 				|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|				    				|									  |										   |");
			System.out.println("|				  					|									  |										   |");
			System.out.println("|				 					|									  |										   |");
			System.out.println("__________________________________________________________________________________________________________________");
			System.out.println("|									|									/ |										   |");
			System.out.println("|									|								   /  |										   |");
			System.out.println("|									|								  /   |										   |");
			System.out.println("|									|								 /    |										   |");
			System.out.println("|									|								/     |										   |");
			System.out.println("|									|							   /	  |										   |");
			System.out.println("|									|							  /	      |										   |");
			System.out.println("|									|							 /	      |										   |");
			System.out.println("|									|							/	      |										   |");
			System.out.println("|									|						   /  		  |										   |");
			System.out.println("|									|						  / 		  |										   |");
			System.out.println("|									|						 /	    	  |										   |");
			System.out.println("|									|						/	    	  |										   |");
			System.out.println("|									|					   /	 		  |										   |");
			System.out.println("__________________________________________________________/________________________________________________________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
		}
		if (input == 6)
		{
			System.out.println("|							    	|									  |										   |");
			System.out.println("|							  	    |									  |										   |");
			System.out.println("|							 		|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|						    		|									  |										   |");
			System.out.println("|						   			|									  |										   |");
			System.out.println("|						  			|									  |										   |");
			System.out.println("|						 			|									  |										   |");
			System.out.println("|					    			|									  |										   |");
			System.out.println("|					   				|									  |										   |");
			System.out.println("|					  				|									  |										   |");
			System.out.println("|					 				|									  |										   |");
			System.out.println("|				    				|									  |										   |");
			System.out.println("|				   					|									  |										   |");
			System.out.println("|				  					|									  |										   |");
			System.out.println("___________________________________________________________________________________________________________________");
			System.out.println("|									|									  |										  /|");
			System.out.println("|									|									  |										 / |");
			System.out.println("|									|									  |										/  |");
			System.out.println("|									|									  |									   /   |");
			System.out.println("|									|									  |									  /    |");
			System.out.println("|									|									  |									 /     |");
			System.out.println("|									|									  |									/      |");
			System.out.println("|									|									  |								   /	   |");
			System.out.println("|									|									  |								  / 	   |");
			System.out.println("|									|									  |								 /   	   |");
			System.out.println("|									|									  |								/	       |");
			System.out.println("|									|									  |							   / 		   |");
			System.out.println("|									|									  |							  /	     	   |");
			System.out.println("|									|									  |							 /		       |");
			System.out.println("____________________________________________________________________________________________________/______________");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
			System.out.println("|									|									  |										   |");
		}
		
    }
}
			