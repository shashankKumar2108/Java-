package QA_Circle;

import java.util.Iterator;

public class reverseArray {
public static void reverse(int[] array) {
	int i = 0;
	int j = array.length-1;
	int temp = 0;
	
	while (i<j) {
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		i++;
		j--;
	}
 }
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	reverse(arr);
	
	System.out.println();
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
}
}
