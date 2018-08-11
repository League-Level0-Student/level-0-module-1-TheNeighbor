package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String bryPower = "Bryan's power is writing on a white board.";
		String tomPower = "Tommy's power is shape shifting.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Type in your name.");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
		if(name.equalsIgnoreCase("Bryan")) {
			JOptionPane.showMessageDialog(null, bryPower);
		}
		if(name.equalsIgnoreCase("Tommy")) {
			JOptionPane.showMessageDialog(null, tomPower);
		}
	}
}

