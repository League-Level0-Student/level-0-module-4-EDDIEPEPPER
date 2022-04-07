package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickelsInt = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
int dimesInt = Integer.parseInt(dimes);
String quarters = JOptionPane.showInputDialog("How many quaters do you have?");		
// Calculate how much money the user has.  Hint: Use a double variable 
int quartersInt = Integer.parseInt(quarters);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
double money = 0.05 * nickelsInt + 0.10 * dimesInt + 0.25 * quartersInt;
JOptionPane.showMessageDialog(null, "you have " + money);
	}
}

