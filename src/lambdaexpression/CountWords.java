package lambdaexpression;


import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CountWords {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>() ;
		list.add("abco");
		list.add("abed");
		list.add("bacd");
		
		System.out.println(countWords(list,'c','d', 4));
		
		
	
	}

	
	public static int countWords(ArrayList<String> words, char c, char d, int len){
		int wordCount=(int) (words.stream()
				.filter(s-> s.contains(""+c))
				.filter(s-> !s.contains(""+d))
				.filter(s->s.length() == len))
				.count();
		return wordCount;
	}
}
