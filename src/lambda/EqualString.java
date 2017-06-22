package lambda;

public class EqualString {
	public static void main(String[] args) {
		System.out.println(my_Equals("helleo", "hello"));
		
	}
	public static boolean my_Equals(String s1, String s2){
		boolean valid=true;
		for(int i=0; i<s1.length();i++){
			
			if(s1.length()!=s2.length()||s1.charAt(i)!=s2.charAt(i)){
				valid=false;
			}
		}
		
		if(valid){
			return true;
		}else
			return false;
	}

}
