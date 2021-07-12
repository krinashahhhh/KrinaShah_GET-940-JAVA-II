public class Ebill {

	public  static void main (String[] args) 
	{
		System.out.println("Here is your Bill.....");
		
	    
	    ElecBill eb = new ElecBill();
		
		eb.Noofunits(75);
		eb.showBill();
		
		eb.Noofunits(250);
		eb.showBill();
		
		eb.Noofunits(375);
		eb.showBill();
	}
}
class ElecBill
	{
	int units;
	double TotalBill;
void Noofunits ( int un)
	{
		units =un;
		System.out.println("Number of Units:" +un);
	}
void showBill()
	{
	
if(units<100)
{
     TotalBill = (units*1.20);
}
else if(units<=300)
{
  TotalBill = (100*1.20) + ((units-100)*2);
}
else if(units>300)
{
   TotalBill = (100*1.20) + (200*2) + ((units-300)*3);
}
System.out.println("TotalBill : "+TotalBill);
	}
}

	

	

		
	
	
 	



