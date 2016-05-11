package quizProject;
import javax.swing.JFrame;

public class quizFrame {

	public quizFrame(String s){
		JFrame init = new JFrame("default");
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		init.add(null);
		
		
		init.pack();
		init.setLocationRelativeTo(null);
		init.setVisible(true);
		
	
	}
}
