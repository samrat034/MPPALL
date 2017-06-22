package Lab3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Package {
	private String description;
	private double weight;
	private String zone;
	
	ArrayList<Carrier> carrier= new ArrayList<Carrier>();
	
	public String getRates() throws IOException{
		System.out.println("Enter the package description:");
		Scanner in= new Scanner(System.in);
		description=in.nextLine();
		
		System.out.println("Enter the weight:");
		weight=in.nextDouble();
		
		System.out.println("Enter zone:");
		Scanner inn= new Scanner(System.in);
		zone=inn.nextLine();
		
		carrier.add(new UPS(description, weight, zone));
		carrier.add(new USMail(description, weight, zone));
		carrier.add(new FedEx(description, weight, zone));
		
		return getMinimumRate();
		
	}
	
	public String getMinimumRate(){
		Carrier minimum= carrier.get(0);
		for(Carrier c: carrier){
			if(c.calculateCost()<minimum.calculateCost()){
				minimum=c;
			}
		}
		return String.format("%s %10.2f %10s ",minimum.getDescription(),minimum.calculateCost(), minimum.getClass().getSimpleName());
		
		
	}
}
