package pattern;

final class Test{
	private final String fName="Samrat";
	private final String lName="Bhusal";
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	
	
}

public class ImmutableClass {
	public static void main(String[] args) {
		Test test= new Test();
		System.out.println(test.getfName());
		System.out.println(test.getlName());
	}

}
