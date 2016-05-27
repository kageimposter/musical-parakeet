package quizProject;

import javax.swing.JOptionPane;

public class endValues {
	
	//ints to keep track of the score
	private static int GryScore =0;
	private static int RavenScore =0;
	private static int SnakeScore =0;
	private static int BaggerScore =0;
	private static int MagusScore = 0;
	private static int buttonPresses =0;
	
	//end discroption for the houses
	private static String gryphwon= "Your house is the house of the Brave." + "\n You are a champion of the weak... Or a glory hound. \n Fame awaits you.";
	private static String ravenwon= "Your house is the house of Knowladge." + "\n You are a seeker of knowladge for its own sake or a teacher to all others.\n Enlightenment is within reach.";
	private static String snakewon= "Your house is the house of Ambition." + "\n You covet power and have the ambition to strive for it. \n Power awaits, let it not be corrupted.";
	private static String baggerwon= "Your house is the house of Commradery." + "\n You prize the bonds shared between your allies above all else. \n Your future will never lonely.";
	private static String maguswon= "You do not belong to a house. You are not a wizard." + "\n Your philosophy is that of a Magus. \n You are ruthless put little value on the boundries, moral or judical, of the mundane. \n In the pursuit of a great goal, you find small sacrifices easy.";
	private static String splitwon= "You were warned, but did not heed." + "\n You are now exiled from the world of magi. You may not speak of this realm or return on pain of death.\n Leave.";

	
	//the button trackers
	public static void Gryphondor() {
		GryScore = GryScore +1;
	}
	public static void RavenClaw(){
		RavenScore = RavenScore +1;
	}
	public static void Slytherin(){
		SnakeScore = SnakeScore +1;
	}
	public static void HonneyBagger(){
		BaggerScore = BaggerScore +1;
	}
	public static void Variants(){
		MagusScore = MagusScore +1;		
	}
	public static void counter(){ buttonPresses = buttonPresses +1;}
	
	
	//total everything
	public static void totalUp() {

		
		if(buttonPresses%2 == 0){SplitWins();}
		if(GryScore > RavenScore && GryScore > SnakeScore && GryScore > BaggerScore && GryScore > MagusScore) GryphWins();
		if(RavenScore > GryScore && RavenScore > SnakeScore && RavenScore > BaggerScore && RavenScore > MagusScore) RavenWins();
		if(SnakeScore > GryScore && SnakeScore > RavenScore && SnakeScore > BaggerScore && SnakeScore > MagusScore) SnakeWins();
		if(BaggerScore > GryScore && BaggerScore > SnakeScore && BaggerScore > RavenScore && BaggerScore > MagusScore) BaggerWins();
		if( MagusScore > GryScore && MagusScore > SnakeScore && MagusScore > BaggerScore && MagusScore > RavenScore) MagusWins();
		 
	}

	//end message
	static void GryphWins() {
		
		JOptionPane.showMessageDialog(null, gryphwon, "GRYPHONDOR",1);
	}
	static void RavenWins(){
		
		JOptionPane.showMessageDialog(null, ravenwon, "RAVENCLAW",1);
		
	}
	static void SnakeWins(){
		JOptionPane.showMessageDialog(null, snakewon, "SLYTHERIN",1);
		
	}
	static void BaggerWins(){
		JOptionPane.showMessageDialog(null, baggerwon, "HUFFLEPUFF",1);
		
	}
	static void MagusWins(){
		JOptionPane.showMessageDialog(null, maguswon, "MAGUS",1);
		
	}
	static void SplitWins(){
		JOptionPane.showMessageDialog(null, splitwon, "OUTCAST",0);
		
	}
	
	
	
}
