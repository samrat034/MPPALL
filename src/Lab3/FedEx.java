package Lab3;

import java.text.DecimalFormat;

public class FedEx extends Carrier {

	public FedEx(String description, double weight, String zone) {
		super(description, weight, zone);
		
	}
	DecimalFormat df= new DecimalFormat(".00");
	public double calculateCost(){
		double cost=0.0;
		if(getZone()=="IA" || getZone()=="MT" || getZone()=="OR" || getZone()=="CA"){
			cost=Double.valueOf(df.format(0.35*getWeight()));
			
		}else if(getZone()=="TX" || getZone()=="UT"){
			cost=Double.valueOf(df.format(0.30*getWeight()));
		}else if(getZone()=="FL" || getZone()=="MA" || getZone()=="OH"){
			
			cost=Double.valueOf(df.format(0.55*getWeight()));
		}else{
			cost=Double.valueOf(df.format(0.43*getWeight()));
		}
		
		return cost;
	}
	

}