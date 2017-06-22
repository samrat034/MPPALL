package Lab3;

import java.text.DecimalFormat;

public class USMail extends Carrier  {
	
	public USMail(String description, double weight, String zone) {
		super(description, weight, zone);
		
	}
	
	DecimalFormat df= new DecimalFormat(".00");

	@Override
	public double calculateCost(){
		double cost=0.0;
		if(getWeight()<3){
			cost=Double.valueOf(df.format(1));
		}else
		cost=Double.valueOf(df.format(0.55*getWeight()));
		return cost;
	}

}