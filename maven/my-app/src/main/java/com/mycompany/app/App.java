package com.mycompany.app;

import java.util.Scanner;
/**
 * Don't Resist!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Resistance is Futile!!!" );
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter username");	
		String userName = myObj.nextLine();  // Read user input
		System.out.println("Username is: " + userName);
		
    }
}
