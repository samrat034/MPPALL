package pattern;

import javax.swing.JOptionPane;

public class MatchLicencePlate {
	

	private static final String VALID="This is Valid ";
	private static final String INVALID="This is not Valid";
	
	private static final String VALID_LICENSE="[A-Z]{3}[0-9]{4}[A-Z]{3}";
	
	
	public static void main(String[] args) {
		String licenseStr, reply;
		while(true){
			licenseStr=JOptionPane.showInputDialog("License Number:");
			
			if(licenseStr.matches(VALID_LICENSE)){
				reply=VALID;
			}else
				reply=INVALID;
			JOptionPane.showMessageDialog(null, "License:"+reply);
		}
		
	}
}
