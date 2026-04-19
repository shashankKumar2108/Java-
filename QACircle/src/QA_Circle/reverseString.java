package QA_Circle;

public class reverseString {
public static void main(String[] args) {
	String str = "shashank";
	String reverseStr = "";
	char ch;
	
	for (int i = 0; i < str.length(); i++) {
		ch = str.charAt(i);
		reverseStr = ch + reverseStr;
	}
	System.out.println("Reversed String : " + reverseStr);
}
}
