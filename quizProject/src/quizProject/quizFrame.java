package quizProject;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class quizFrame extends JFrame{
	private Toolkit ig = Toolkit.getDefaultToolkit();
	
	
	public quizFrame(String s){
		
		//start the window
		JFrame init = new JFrame("default");
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		//Image tittleIcon = ig.getImage(i);
		//init.setIconImage(tittleIcon);
		init.setSize(600,600);
		
		
		//fill the window with a useable panel space
		JPanel insideframe = new insideFrame(getGraphics());
		//JPanel buttons = new buttons();
		super.setLayout(new GridLayout(0, 2));
		
		
		//Buttons with text
		JButton b1 = new JButton("1");
		 JButton b2 = new JButton("2");
		 JButton b3 = new JButton("3");
		 JButton b4 = new JButton("4");
		 JButton b5 = new JButton("5");
		 JButton b6 = new JButton("6");
		    
		    super.add(b1);
		    super.add(b2);
		    super.add(b3);
		    super.add(b4);
		    super.add(b5);
		    super.add(b6);
		    
		    
		//pack up the window and display it
		init.pack();
		init.setLocationRelativeTo(null);
		
		
	
	}
		
}

