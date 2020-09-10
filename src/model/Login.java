package model;

import java.util.Scanner;

public class Login
{
	static void login()
	{
		    String loginName;
			String loginPass;
		    System.out.println("LOGIN");
		    System.out.println("Username : ");
		    Scanner s1 = new Scanner (System.in);
		    loginName = s1.nextLine();
		    System.out.println("Password : ");
		    loginPass = s1.nextLine();
		    if((loginName.equals("Admin") && loginPass.contentEquals("Admin"))== true) {
		    	System.out.println(                          "Login Successful!!                            ");
		    	System.out.println("------------------------------------------------------------------------");
		    	System.out.println("WELCOME TO THE FOOD SAFETY PORTAL OF HYDERABAD !!");
		    }
		    else {
		    	System.out.println("         Incorrect username or password !! Try logging in again !!      ");
		    	System.out.println("------------------------------------------------------------------------");
		    	login();
		    }
	}

}
