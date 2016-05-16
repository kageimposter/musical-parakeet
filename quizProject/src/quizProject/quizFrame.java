package quizProject;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;

import javax.swing.*;

public class quizFrame extends JFrame{
	private Toolkit ig = Toolkit.getDefaultToolkit();
	private Dimension size  = ig.getScreenSize();
	
	public quizFrame(String s, String i){
		
		//start the window
		JFrame init = new JFrame("default");
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		Image tittleIcon = ig.getImage(i);
		init.setIconImage(tittleIcon);
		init.setSize(size.width/2,size.height/2);
		
		
		//fill the window with a useable panel space
		JPanel insideframe = new insideFrame(null);
		JPanel buttons = new buttons();
		
		
		//pack up the window and display it
		init.pack();
		init.setLocationRelativeTo(null);
		
		
	
	}
		
}

