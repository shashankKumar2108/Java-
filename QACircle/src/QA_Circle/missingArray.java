package QA_Circle;

public class missingArray {
public static void main(String[] args) {
	int n = 6;
	int arr[] = {1,2,4,5,6};
	int sumNum = (n*(n+1))/2;
	int sum = 0;
	int missValue; 
	
	for (int i = 0; i < arr.length; i++) {
		sum = sum + arr[i];
	}
	missValue = sumNum - sum;
	System.out.println(missValue);
}
}
