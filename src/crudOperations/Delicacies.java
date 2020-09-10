package crudOperations;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import model.Options;
public class Delicacies {
	
	static ArrayList<String> delicacies = new ArrayList<String>(20);
	public static void crudop() throws IOException {
		int x;
		Scanner s1 = new Scanner(System.in);
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. Display");
		System.out.println("4. Exit");
		x = s1.nextInt();
		switch (x) {
		case 1: 
			add();
			break;
		
		case 2:
			delete();
			break;
			
		case 3:
			display();
			break;	
		
		case 4:
			Options.option();
			break;
		}	
	}
	public static void add() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("No of delicacies you want to add");
		i =  s.nextInt();
		for(int j=0;j<=i;j++) {
			String d = br.readLine();
			delicacies.add(d);
		}
//		for(int j=0;j<=delicacies.size();j++) {
//			System.out.println(delicacies.get(j));
//		}
		System.out.println("");
		System.out.println("");
		System.out.println("Delicacies added successfully");
		crudop();
	}
	
	public static void delete() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
//		System.out.println("No of delecacies you want to delete");
//		int i = s.nextInt();
//		for(int j=0;j<=i;j++) {
//			String d = br.readLine();
//			delicacies.remove(d);
//		}
		String name = br.readLine();
		delicacies.remove(name);
//		for(int j=0;j<= delicacies.size();j++) {
//			System.out.println(delicacies.get(i));
//		}
		for(int j=0;j<(delicacies.size()-1);j++) {
			System.out.println(delicacies.get(j));
		}
		System.out.println("Delicacie/s deleted successfully");
		crudop();
	}
	
	public static void display() throws IOException {
		for(int j=0;j<(delicacies.size()-1);j++) {
			System.out.println(delicacies.get(j));
		}
		crudop();
	}
	
	
}