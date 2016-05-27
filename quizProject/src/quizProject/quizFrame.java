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
import javax.imageio.ImageIO;
import javax.swing.*;

public class quizFrame implements ActionListener{
	
	public quizFrame(String s){
		
//start the window
		JFrame init = new JFrame("default"){
			public void paint(Graphics g) {System.out.println("repaint");};
		};	
		init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init.setTitle(s);
		init.setBounds(40,40,400,400);
		int section = 0;
		
		
//get strings
		
		 Box questext = Box.createVerticalBox();
		  
		
				String[] Questions = new String[10];
				Questions[0] = "What is your Philosophy in life?";Questions[1] = "q2";Questions[2] = "q3";Questions[3] = "q4";Questions[4] = "q";Questions[5] = "q";Questions[6] = "q";Questions[7] = "q";Questions[8] = "q";Questions[9] = "q";
	
				String[] Gryphondor = new String[10];
				String[] RavenClaw = new String[10];
				String[] Slytherin = new String[10];
				String[] HonneyBadger = new String[10];
				String[] Variates = new String[10];
				
				Gryphondor[0] = "1.Do you believe in glory above all?";Gryphondor[1] = "A1";Gryphondor[2] = "A1";Gryphondor[3] = "A1";Gryphondor[4] = "A1";Gryphondor[5] = "A1";Gryphondor[6] = "A1";Gryphondor[7] = "A1";Gryphondor[8] = "A1";Gryphondor[9] = "A1";

				RavenClaw[0] = "2.Do you believe in knowladge above all?";RavenClaw[1] = "A2";RavenClaw[2] = "A2";RavenClaw[3] = "A2";RavenClaw[4] = "A2";RavenClaw[5] = "A2";RavenClaw[6] = "A2";RavenClaw[7] = "A2";RavenClaw[8] = "A2";RavenClaw[9] = "A2";

				Slytherin[0] = "3.Do you believe in efficency above all?";Slytherin[1] = "A3";Slytherin[2] = "A3";Slytherin[3] = "A3";Slytherin[4] = "A3";Slytherin[5] = "A3";Slytherin[6] = "A3";Slytherin[7] = "A3";Slytherin[8] = "A3";Slytherin[9] = "A3";
				
				HonneyBadger[0] = "4.Do you believe in comradary above all?";HonneyBadger[1] = "A4";HonneyBadger[2] = "A4";HonneyBadger[3] = "A4";HonneyBadger[4] = "A4";HonneyBadger[5] = "A4";HonneyBadger[6] = "A4";HonneyBadger[7] = "A4";HonneyBadger[8] = "A4";HonneyBadger[9] = "A4";
				
				Variates[0] = "Do you believe in power above all?";Variates[1] = "A5";Variates[2] = "A5";Variates[3] = "A5";Variates[5] = "A5";Variates[6] = "A5";Variates[7] = "A5";Variates[8] = "A5";Variates[9] = "A5";
			
				  //the text for the questions
			    JTextArea G1 = new JTextArea(Gryphondor[section]);
			    G1.setEditable(false);
				JTextArea R1 = new JTextArea(RavenClaw[section]);
				R1.setEditable(false);
				JTextArea S1 = new JTextArea(Slytherin[section]);
				S1.setEditable(false);
				JTextArea H1 = new JTextArea(HonneyBadger[section]);
				H1.setEditable(false);
				JTextArea V1 = new JTextArea(Variates[section]);
				V1.setEditable(false);
				   
				questext.add(G1);
				questext.add(R1);
				questext.add(S1);
				questext.add(H1);
				questext.add(V1);
				
				
				
	//Buttons with text
	  	
	    Box text = Box.createVerticalBox();
	    //the text for the questions
	    JTextArea question = new JTextArea(Questions[section]);
	    question.setEditable(false);
	  
	//set the fonts 
	    Font font = null;
			try {
				font = Font.createFont(Font.TRUETYPE_FONT, new File("Akula.ttf")).deriveFont(28f);
			} catch (FontFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		question.setFont(font);
	    question.setLineWrap(true);
	    question.setWrapStyleWord(true);
	    
	   
	    

	    //buttons with options   
	   JCheckBox Gryp = new JCheckBox("1");
	   JCheckBox Raven = new JCheckBox("2");
	   JCheckBox Snake = new JCheckBox("3");
	   JCheckBox Bagger = new JCheckBox("4");
	   JCheckBox VarAll = new JCheckBox("5");
	    //next screen button
	    JButton NextScreen = new JButton("Next Question");
	    JButton ENDQUIZ = new JButton("END QUIZ");
	    JButton BACKSPACE = new JButton("Previous");
	    
	    
	    //Add the buttons to the space
	    text.add(Gryp);
	    text.add(Raven);
	    text.add(Snake);
	    text.add(Bagger);
	    text.add(VarAll);
	    text.add(NextScreen);
	    text.add(BACKSPACE);
	    text.add(ENDQUIZ);
	    
	    //add the listeners
	    Gryp.addActionListener(new ActionListener(){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.Gryphondor();
	        }
	   });
	    
	    Raven.addActionListener(new ActionListener(){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.RavenClaw();
		   
		   }
	   });
	    
	    Snake.addActionListener(new ActionListener(){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.Slytherin();
	        }
	   });
	    
	    Bagger.addActionListener(new ActionListener(){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.HonneyBagger();
	        }
	   });
	    
	    VarAll.addActionListener(new ActionListener(){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.Variants();
			   
	        }
	   });
	    
	  NextScreen.addActionListener(new ActionListener(){
			  
			  public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() instanceof JButton)
			{
				
				JButton button = (JButton) e.getSource();
				System.out.println("trying to repaint");
				button.getParent().getParent().repaint();
				
		}
			}
			  }	);
	
	  //Get the total through the end quiz method.
	  ENDQUIZ.addActionListener(new ActionListener(){
		   @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
			   endValues.totalUp();
	        }
	   });
	    
	
	//set up the container for everything
	    
	    Container content = new Container();
	    init.add(content);
	    content.setLayout(new BorderLayout());
	    content.add(question, BorderLayout.PAGE_START );
	    content.add(text, BorderLayout.WEST);
	    content.add(questext, BorderLayout.CENTER);
	    content.setBackground(null);
	    
	//set window location  and display it	
		    init.setLocationRelativeTo(null);
		init.setVisible(true);
		
	
			}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}		
}