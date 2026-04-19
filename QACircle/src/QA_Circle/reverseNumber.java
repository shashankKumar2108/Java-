package QA_Circle;

public class reverseNumber {
public static void main(String[] args) {
	int n =  2121;
	int reverse = 0 ;
	int lastDigit;
	
	while (n>0) {
		lastDigit = n % 10;
		reverse = reverse * 10 + lastDigit;
		n = n / 10;
	}
	System.out.println(reverse);
}
}




