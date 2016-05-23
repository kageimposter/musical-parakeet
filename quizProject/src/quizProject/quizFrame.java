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
	    JTextArea question = new JTextArea(5,10);
	    question.setEditable(false);
	    
	    
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
		
		String[] Gryphondor = new String[10];
		String[] RavenClaw = new String[10];
		String[] Slyterin = new String[10];
		String[] HonneyBadger = new String[10];
		String[] Variates = new String[10];
		
		Gryphondor[0] = "A1";Gryphondor[1] = "A1";Gryphondor[2] = "A1";Gryphondor[3] = "A1";Gryphondor[4] = "A1";Gryphondor[5] = "A1";Gryphondor[6] = "A1";Gryphondor[7] = "A1";Gryphondor[8] = "A1";Gryphondor[9] = "A1";

		RavenClaw[0] = "A2";RavenClaw[1] = "A2";RavenClaw[2] = "A2";RavenClaw[3] = "A2";RavenClaw[4] = "A2";RavenClaw[5] = "A2";RavenClaw[6] = "A2";RavenClaw[7] = "A2";RavenClaw[8] = "A2";RavenClaw[9] = "A2";

		Slyterin[0] = "A3";Slyterin[1] = "A3";Slyterin[2] = "A3";Slyterin[3] = "A3";Slyterin[4] = "A3";Slyterin[5] = "A3";Slyterin[6] = "A3";Slyterin[7] = "A3";Slyterin[8] = "A3";Slyterin[9] = "A3";
		
		HonneyBadger[0] = "A4";HonneyBadger[1] = "A4";HonneyBadger[2] = "A4";HonneyBadger[3] = "A4";HonneyBadger[4] = "A4";HonneyBadger[5] = "A4";HonneyBadger[6] = "A4";HonneyBadger[7] = "A4";HonneyBadger[8] = "A4";HonneyBadger[9] = "A4";
		
		Variates[0] = "A5";Variates[1] = "A5";Variates[2] = "A5";Variates[3] = "A5";Variates[5] = "A5";Variates[6] = "A5";Variates[7] = "A5";Variates[8] = "A5";Variates[9] = "A5";
		}
}



