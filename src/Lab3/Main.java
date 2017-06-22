package Lab3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int no_of_package=0;
		Package pac;
		ArrayList<Package> pack= new ArrayList<Package>();
		String output="";

		
		
		System.out.println("Enter number of packages:");
		Scanner input= new Scanner(System.in);
		no_of_package=input.nextInt();
		
		for(int i=1; i<=no_of_package; i++){
			pac=new Package();
			pack.add(pac);
			output+=pac.getRates()+"\n";
		}
		
		System.out.println(output);
		
		
		
	}
	
	

}