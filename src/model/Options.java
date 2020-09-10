package model;

import java.io.IOException;
import java.util.Scanner;

import crudOperations.Delicacies;

public class Options {
	
	public static void option() throws IOException {
	Scanner sc = new Scanner(System.in);
	int number ;
	System.out.println("------------------------------------------------------------------Choose option------------------------------------------------------------");
	System.out.println("");
	System.out.println("");
	System.out.println("------------------------------------------1.Description-----------------------------------------");
	System.out.println("------------------------------------------2.Food Habits-----------------------------------------");
	System.out.println("------------------------------------------3.Delcacies-------------------------------------------");
	System.out.println("------------------------------------------4.Certifications--------------------------------------");
	System.out.println("------------------------------------------5. Restaurants----------------------------------------");
	System.out.println("------------------------------------------6. Exit-----------------------------------------------");
	number = sc.nextInt();
	switch (number) {
    case 1: 
    	    
    case 2: 
    	System.out.println("");
            break;
    case 3: 
    	 Delicacies.crudop();
 		 break;
    case 4:
    	System.out.println(""); 
             break;
	}       
 }



}
