package main;

public class DisplayBoard {
	
	 public static void displayPlayingBoard(String[]slots) {

	        for (int i = 1; i < slots.length; i++) {
	            if (i == 3 || i == 6 || i == 10) {
	                System.out.print(slots[i] + " \n");
	                System.out.print("---------\n");
	            } else if (i <= 8){
	                System.out.print(slots[i] + " | ");
	            } else if(i == 9){
	                System.out.print(slots[i]);
	            }
	        }
	    }
}
