package pattern;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Occurence {
	public static void main(String[] args) {
		Matcher matcher;
		
		String regexp;
		
		regexp=JOptionPane.showInputDialog("Sentence:");
		
		Pattern pattern= Pattern.compile("[8]");
		
		matcher= pattern.matcher(regexp);
		
		String output= matcher.replaceAll("eight");
		
		System.out.println(output);
	}
	
	
	
	
	

}
