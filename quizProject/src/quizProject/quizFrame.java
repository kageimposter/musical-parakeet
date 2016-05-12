package quizProject;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;

import javax.swing.*;

public class quizFrame {

	public quizFrame(String s){
	
		//Title and size
		private Toolkit ig = Toolkit.getDefaultToolkit();
		Image tittleicon = ig.getImage(null);
		private Dimension size  = ig.getScreenSize();
		
		
		//start the window
		JFrame init = new JFrame("default");
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		init.setIconImage(null);
		
		
		
		// for later
		//init.addWindowListener(new WindowAdapter());
		
		//fill the window with a useable panel space
		JPanel inhere = new JPanel();
		inhere.setSize(300, 300);
		
		
		//pack up the window and display it
		init.pack();
		init.setLocationRelativeTo(null);
		init.setVisible(true);
		
	
	}
		
}

