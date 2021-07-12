public class Cricket 
{

	public static void main(String[] args) 
	{
		Match m = new Match();
		m.Runs_Scored();
		m.ShowStatistics();
	    m.StrikeRate(30);
	}

}
class Match{
	
 float strikerate;
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
 
void Runs_Scored() {

	int[] runs = new int[29];
	for (int i = 0 ; i <runs.length; i++) {
		runs[i]= (int) (Math.random() * 6 +1);	}
	  
for (int i = 0 ; i <runs.length; i++) {
	Total_runs = Total_runs + runs[i];
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

void ShowStatistics() 
{
System.out.println("Total Runs  : "      +Total_runs);
System.out.println("Number of 0s: "      +zeros);
System.out.println("Number of 1s: "      +ones );
System.out.println("Number of 2s: "      +twos );
System.out.println("Number of 3s: "      +threes);
System.out.println("Number of 4s: "      +fours);
//System.out.println("Number of 5s: "    +fives);

System.out.println("Number of 6s: "      +sixes);

}

void StrikeRate(int balls) 
	{
		strikerate= (Total_runs*100)/30 ;
	    System.out.println("Average Strike Rate(runs per ball) : "+strikerate);
}
}
