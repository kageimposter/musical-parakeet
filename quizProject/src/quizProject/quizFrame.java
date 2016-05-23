package quizProject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.*;

public class quizFrame extends JFrame implements ActionListener{
	Toolkit ig = Toolkit.getDefaultToolkit();
	int section = 0;
	
	
	public quizFrame(String s){
		
//start the window
		JFrame init = new JFrame("default");
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		init.setBounds(40,40,400,400);
		//Image tittleIcon = ig.getImage();
		//init.setIconImage(tittleIcon);
		
		
		
//get strings
				String[] Questions = new String[10];
				Questions[0] = "q";Questions[1] = "q";Questions[2] = "q";Questions[3] = "q";Questions[4] = "q";Questions[5] = "q";Questions[6] = "q";Questions[7] = "q";Questions[8] = "q";Questions[9] = "q";
	
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
				
	
	//Buttons with text
	  	
	    Box text = Box.createVerticalBox();
	    //the text for the questions
	    JTextArea question = new JTextArea(Questions[section]);
	    question.setEditable(false);
	  
	//set the fonts 
	    Font font;
			try {
				font = Font.createFont(Font.TRUETYPE_FONT, new File("Akula.ttf")).deriveFont(12f);
			} catch (FontFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//    question.setFont(font);
	    question.setLineWrap(true);
	    question.setWrapStyleWord(true);
	    
	    

	    //buttons with options   
	   JCheckBox Gryp = new JCheckBox(new AbstractAction(Gryphondor[section]){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.Gryphondor();
	        }
	   });
	   JCheckBox Raven = new JCheckBox(new AbstractAction(RavenClaw[section]){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.RavenClaw();
		   
		   }
	   });
	   JCheckBox Snake = new JCheckBox(new AbstractAction(Slyterin[section]){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.Slytherin();
	        }
	   });
	   JCheckBox Bagger = new JCheckBox(new AbstractAction(HonneyBadger[section]){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.HonneyBagger();
	        }
	   });
	   JCheckBox VarAll = new JCheckBox(new AbstractAction(Variates[section]){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.Variants();
			   
	        }
	   });
	  
	    //next screen button
	    JButton NextScreen = new JButton(new AbstractAction("Next Question"){
			   @Override
		        public void actionPerformed( ActionEvent e ) {
		            // hit the next section
				   section++;
				   quizFrame.RepaintFrame();
		        }
		   });
	    
	    //Add the buttons to the space
	    text.add(Gryp);
	    text.add(Raven);
	    text.add(Snake);
	    text.add(Bagger);
	    text.add(VarAll);
	    text.add(NextScreen);
	    
	  
	    
	
	//set up the container for everything
	    
	    Container content = init.getContentPane();
	    content.setLayout(new BorderLayout());
	    content.add(question, BorderLayout.PAGE_START );
	    content.add(text, BorderLayout.CENTER);
	    content.setBackground(null);
	    
	//set window location  and display it	
		    init.setLocationRelativeTo(null);
		init.setVisible(true);
		
	
			}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void RepaintFrame(){
		quizFrame.text.repaint();
		
	}

		
}



