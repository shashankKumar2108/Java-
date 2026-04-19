package QA_Circle;

public class Palidrome {
public static void main(String[] args) {
	String s1 = "abcdcba";
	int i = 0;
	int j = s1.length()-1;
	
	while (i<j) {
		if (s1.charAt(i) != s1.charAt(j)) {
			System.out.println("Not a Palindrome");
			System.exit(0);
		}
		i++;
		j--;
	}
	System.out.println("Palindrome");
}
}
