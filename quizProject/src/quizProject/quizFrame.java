package quizProject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import javax.swing.*;

public class quizFrame extends JFrame{
	Toolkit ig = Toolkit.getDefaultToolkit();
	
	
	public quizFrame(String s){
		
//start the window
		JFrame init = new JFrame("default");
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		init.setBounds(40,40,400,400);
		//Image tittleIcon = ig.getImage();
		//init.setIconImage(tittleIcon);
		
	//Buttons with text
	  	
	    Box text = Box.createVerticalBox();
	    //the text for the questions
	    
	    
	    
	    //buttons with options
	    text.add(new JCheckBox("A"));
	    text.add(new JCheckBox("B"));
	    text.add(new JCheckBox("C"));
	    text.add(new JCheckBox("d"));
	    text.add(new JCheckBox("e"));
	  
	    //next screen button
	    text.add(new JButton("Next Question"));
	
	 //another container to display objects side by side
	    //Box top = Box.createHorizontalBox();
	    //top.add(text);
	    //   top.add(comp)
	  
	//set up the container for everything
	    
	    Container content = init.getContentPane();
	    content.setLayout(new BorderLayout());
	    content.add(text, BorderLayout.CENTER);
	    content.setBackground(null);
	    
	//set window location  and display it	
		    init.setLocationRelativeTo(null);
		init.setVisible(true);
		
	
			}
	public static void strings(){
		
		
		
		
	}
}



