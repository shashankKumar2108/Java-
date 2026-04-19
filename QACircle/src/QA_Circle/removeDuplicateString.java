package QA_Circle;

public class removeDuplicateString {
public static void main(String[] args) {
	String str = "shashank";
	String result = "";
	
	for (int i = 0; i < str.length(); i++) {
		if (result.indexOf(str.charAt(i)) == -1) {
			result = result + str.charAt(i);
		}
	}
	
	System.out.println("After removing duplicats : " + result);
}
}




