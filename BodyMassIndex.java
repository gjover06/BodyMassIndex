/**
Author:George Samu
Date:5/24/2020
Purpose: taking weight in lbs and inches
and converting it to calculate BMI

*/
import java.util.Scanner;

public class BodyMassIndex
{
	public static void main (String[]args)
	{
	
	System.out.println("Calculating the body mass index");
	
	//create a scanner to get input data and data from keyboard
	Scanner keyboard= new Scanner(System.in);
	System.out.println("What is the weight in pounds: ");
	double weightInLbs= keyboard.nextDouble();
	
	//get data of height from keyboard
	System.out.println("What is the height in inches: ");
	double heightInInches=keyboard.nextDouble();
	
	double weightInKg=weightInLbs/2.2;
	double heightInMeters=heightInInches * 0.0254;
	
	double BMI=weightInKg/Math.pow(heightInMeters,2);
	
	System.out.println(" Enter weight in pounds: " + weightInLbs );
	System.out.println(" The weight is " + weightInLbs + 
						" pound(s) or " + weightInKg + " kilograms(s).");
	System.out.println(" The height is " + heightInInches + " inche(s) or "
						+ heightInMeters + " meters(s).");
	System.out.println(" The body mass index is " + BMI );
	
	}//end main
}// end BodyMassIndex