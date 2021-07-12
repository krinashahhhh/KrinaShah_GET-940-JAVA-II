
public class Cricket2 {

	public static void main(String[] args) {
		
		Match1 m = new Match1();
		
		m.Runs_Scored();
		m.allInnings();
		m.StrikeRate(150);
		
		
		m.ShowStatistics();
	}

}
class Match1{
	
	 double avg_strikerate;
	 int runs;
	 int balls;
	 int zeros=0;
	 int ones=0;
	 int twos=0;
	 int threes=0;
	 int fours=0;
	 int fives=0;
	 int sixes=0;
	 int Total_runs=0;
	 int Innings1=0;
	 int Innings2=0;
	 int Innings3=0;
	 int Innings4=0;
	 int Innings5=0;
	 double Average_Score;
	 double StrikeRate1;
	 double StrikeRate2;
	 double StrikeRate3;
	 double  StrikeRate4;
   	 double StrikeRate5;
	 
	void Runs_Scored() {

		int[] runs = new int[150];
		for (int i = 0 ; i <runs.length; i++) {
			runs[i]= (int) (Math.random() * 6 +1);	}
		  
	for (int i = 0 ; i <runs.length; i++) {
		//Total_runs = Total_runs + runs[i];

		if (i<30) {
			Innings1+=runs[i];
		}
		else if (i<60){
			Innings2+=runs[i];
		}
		else if(i<90){
			Innings3+=runs[i];
		}
		else if (i <120) {
			Innings4+=runs[i];
		}
		else if (i <150) {
			Innings5+=runs[i];
		}
		    switch(runs[i]){
				case 0:
				    zeros++;
					break;
				case 1:
				   ones++;
					break;
				case 2:
				    twos++;
					break;
				case 3:
				    threes++;
					break;
				case 4:
				    fours++;
					break;
				case 5:
				    fives+=1;
					break;
				case 6:
				    sixes++;
					break;
	    		}
	}
	}
	void allInnings() 
	{
		
		Total_runs= Innings1 + Innings2 + Innings3+ Innings4 + Innings5;
		Average_Score= (Total_runs)/5;
		System.out.println("Average Score of last 5 Matches : " +Average_Score);
	}

	void ShowStatistics() 
	{
	System.out.println("-----------------");
	System.out.println("Total Runs  : "      +Total_runs);
	System.out.println("=================");
	System.out.println("Number of 0s: "      +zeros);
	System.out.println("Number of 1s: "      +ones );
	System.out.println("Number of 2s: "      +twos );
	System.out.println("Number of 3s: "      +threes);
	System.out.println("Number of 4s: "      +fours);
	System.out.println("Number of 5s: "    +fives);
    System.out.println("Number of 6s: "      +sixes);

	}

	void StrikeRate(int balls) 
		{
		    StrikeRate1= (Innings1*100)/30;
		    StrikeRate2= (Innings2*100)/30;
		    StrikeRate3= (Innings3*100)/30;
		    StrikeRate4= (Innings4*100)/30;
		    StrikeRate5= (Innings5*100)/30;
			avg_strikerate= (Total_runs*100)/150 ;
			System.out.println("---------------");
		    System.out.println("Average Strike Rate(runs per ball) : "+avg_strikerate);
	}
	}
