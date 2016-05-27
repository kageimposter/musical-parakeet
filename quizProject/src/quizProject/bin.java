package quizProject;

import javax.swing.JOptionPane;

public class bin{
	public static void main(String[] args) {
		String warning = "DO NOT SELECT MORE THAN ONE, DESELECT ANY OTHER OPTIONS OR YEE WILL BE CAST OUT OF THE WORLD OF MAGI!!";
		JOptionPane.showMessageDialog(null,warning, "LISTEN TO THESE ELDRITCH WORDS",2);
		quizFrame quizFrame = new quizFrame("Harry Potter Quiz");
 
	}
}
