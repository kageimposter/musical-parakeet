package quizProject;

import javax.swing.JOptionPane;

public class endValues {
	
	//ints to keep track of the score
	private static int GryScore =0;
	private static int RavenScore =0;
	private static int SnakeScore =0;
	private static int BaggerScore =0;
	private static int MagusScore = 0;
	
	//end discroption for the houses
	private static String gryphwon= "Your house is the house of the Brave. You are a champion of the weak... Or a glory hound. Fame awaits you.";
	private static String ravenwon= "";
	private static String snakewon= "Your house is the house";
	private static String baggerwon= "";
	private static String maguswon= "";
	private static String splitwon= "";

	
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
	
	
	//total everything
	public static void totalUp() {
		if(GryScore > RavenScore && GryScore > SnakeScore && GryScore > BaggerScore && GryScore > MagusScore) GryphWins();
		if(RavenScore > GryScore && RavenScore > SnakeScore && RavenScore > BaggerScore && RavenScore > MagusScore) RavenWins();
		if(SnakeScore > GryScore && SnakeScore > RavenScore && SnakeScore > BaggerScore && SnakeScore > MagusScore) SnakeWins();
		if(BaggerScore > GryScore && BaggerScore > SnakeScore && BaggerScore > RavenScore && BaggerScore > MagusScore) BaggerWins();
		if( MagusScore > GryScore && MagusScore > SnakeScore && MagusScore > BaggerScore && MagusScore > RavenScore) MagusWins();
		 SplitWins();
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
