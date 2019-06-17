
public class First2Chars {
	public String Check2Chars(String word) {
		int len = word.length();
		if(len < 1) 
			return word;
		else if(len == 1) 
			if(word.charAt(0) == 'A') 
				return "";
			else
				return word;
		else {
			if(word.charAt(0) == 'A' && word.charAt(1) == 'A')
				return word.substring(2);
			else if(word.charAt(0) == 'A')
				return word.substring(1);
			else if(word.charAt(1) == 'A')
				return word.substring(0, 1)+word.substring(2);
		}
		return word;
	}
}
