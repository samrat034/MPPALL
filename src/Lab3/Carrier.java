package Lab3;
public abstract class Carrier implements IMailSystem{
	private String description;
	private double weight;
	private String zone;
	
	

	public Carrier(String description, double weight, String zone) {
		super();
		this.description = description;
		this.weight = weight;
		this.zone = zone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public String toString() {
		return String.format("%10s %6.2f %20s ",description,calculateCost(), this.getClass().getSimpleName());
	}
	
	
	

}