package QA_Circle;

public class duplicateString {
public static void main(String[] args) {
	String str = "shashank";
	char[] ch = str.toCharArray();
	System.out.println("Duplicat String");
	
	for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[i] + "");
				}
			}
		}
	}
}

