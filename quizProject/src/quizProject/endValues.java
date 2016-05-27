package quizProject;

import javax.swing.JOptionPane;

public class endValues {
	
	private static int GryScore =0;
	private static int RavenScore =0;
	private static int SnakeScore =0;
	private static int BaggerScore =0;
	private static int MagusScore = 0;
	private String gryphwon= "Your house is the house of the Brave. You are a champion of the weak... Or a glory houd. Fame awaits you.";
	private String ravenwon= "";
	private String snakewon= "Your house is the house";
	private String baggerwon= "";
	private String maguswon= "";
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
	public static void totalUp() {
		if(GryScore > RavenScore && GryScore > SnakeScore && GryScore > BaggerScore && GryScore > MagusScore) GryphWins();
		if(RavenScore > GryScore && RavenScore > SnakeScore && RavenScore > BaggerScore && RavenScore > MagusScore) RavenWins();
		if(SnakeScore > GryScore && SnakeScore > RavenScore && SnakeScore > BaggerScore && SnakeScore > MagusScore) SnakeWins();
		if(BaggerScore > GryScore && BaggerScore > SnakeScore && BaggerScore > RavenScore && BaggerScore > MagusScore) BaggerWins();
		if( MagusScore > GryScore && MagusScore > SnakeScore && MagusScore > BaggerScore && MagusScore > RavenScore) MagusWins();
		else SplitWins();
	}
	static void GryphWins() {
		System.out.println("gryp");
		JOptionPane.showMessageDialog(parentComponent, message, "Your House");
	}
	static void RavenWins(){
		System.out.println("raven");
	}
	static void SnakeWins(){
		
	}
	static void BaggerWins(){
		
	}
	static void MagusWins(){
		
	}
	static void SplitWins(){
		
	}
	
	
	
}
