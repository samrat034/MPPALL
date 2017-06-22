package School_Lab;

public interface IPerson {
	default void myDefault(){
		System.out.println("From Default Method");
	}
	
	static void myStatic(){
		System.out.println("From Static Method");
	}
	
	public void myAbstract();

}
