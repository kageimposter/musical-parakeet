package quizProject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class quizFrame extends JFrame{
	//private Toolkit ig = Toolkit.getDefaultToolkit();
	
	
	public quizFrame(String s){
		
		//start the window
		JFrame init = new JFrame("default");
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		//Image tittleIcon = ig.getImage(i);
		//init.setIconImage(tittleIcon);
		
		
		//fill the window with a useable panel space
		
	//	JPanel title = new insideFrame(getGraphics());
		
		JPanel insideframe = new insideFrame(getGraphics());
		
		//Layout for the Buttons
		//BorderLayout titleQuestions = new BorderLayout(null);

		Layout Answer = new BoxLayout(insideframe,BoxLayout.PAGE_AXIS );
		super.setLayout(Answer);
		
		
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
		
		  
			
		   
		    
		//set window size  and display it	
		    init.setLocationRelativeTo(null);
		
		
	
			}
		


}



