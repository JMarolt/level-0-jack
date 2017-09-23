// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String jacksuper = "Bruh this kid is ugly";
	String elenasuper = "cool";
	String alansuper = "awesome";
	String name = JOptionPane.showInputDialog("Enter a name");

if(name.equals("Jack")) {
	JOptionPane.showMessageDialog(null,jacksuper);
}
		// 2. Ask the user to enter a name. Store their answer in a variable.
 name = JOptionPane.showInputDialog("Enter a different name");

if(name.equals("Elena")) {
	JOptionPane.showMessageDialog(null, elenasuper);
}
		// 3. Show the superpower in a pop-up, depending on the name entered. 
 name = JOptionPane.showInputDialog("Enter the last name");

if(name.equals("Alan")) {
	JOptionPane.showMessageDialog(null, alansuper);
	}
}
}
