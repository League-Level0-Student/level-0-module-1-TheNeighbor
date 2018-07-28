package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer1 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer1.equalsIgnoreCase("A Candle")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "WRONG! The answer is: A Candle");
		}
		JOptionPane.showInputDialog("You are a prisoner in a room with 2 doors and 2 guards.\n"
				+ "One of the doors will guide you to freedom and behind the other is a death trap and you don’t know which is which.\n"
				+ "One of the guards always tells the truth and the other always lies.\n"
				+ "You don’t know which one is the truth teller or the the liar either.\n"
				+ "You have to choose and open one of these doors, but you can only ask a single question to one of the guards.\n"
				+ "What do you ask so you can pick the door to freedom?\n");

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score: " + score + "/2");
	}
}
