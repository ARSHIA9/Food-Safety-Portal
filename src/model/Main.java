package model;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
	    System.out.println("                          FOOD SAFETY PORTAL                                ");
	    System.out.println("----------------------------------------------------------------------------");
	    System.out.println("                          Login to your account                             ");
	    System.out.println("----------------------------------------------------------------------------");
	    Login.login();
	    Options.option();
	}


}
