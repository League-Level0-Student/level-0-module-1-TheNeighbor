import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String date = JOptionPane.showInputDialog("What is your birth date?");
	if(date.equals("07/21")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
else {
	JOptionPane.showMessageDialog(null, "Happy Unbirthday");
}
}
}