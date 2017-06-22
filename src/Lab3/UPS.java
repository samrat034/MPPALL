package Lab3;

import java.text.DecimalFormat;

public class UPS extends Carrier  {
	
	public UPS(String description, double weight, String zone) {
		super(description, weight, zone);
		
		
	}
	DecimalFormat df= new DecimalFormat(".00");

	public double calculateCost(){
		double cost=0.0;
		cost= Double.valueOf(df.format(0.45*getWeight()));
		return cost;
		
	}

}