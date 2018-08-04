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
		if (answer1.toLowerCase().contains("candle")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "WRONG! The answer is: A Candle");
		}
		String answer2 = JOptionPane.showInputDialog("There was a husband named Joe and a wife named Mary.\n"
				+ "At nightime, Joe was watching TV and Mary was reading a book.\n"
				+ "All of a sudden, the power went out and Joe went to bed, but Mary kept on reading. How is this possible?");
		if (answer2.toLowerCase().contains("mary is blind")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "WRONG! The answer is: Mary is blind so she reads brail.");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score: " + score + "/2");
	}
}
