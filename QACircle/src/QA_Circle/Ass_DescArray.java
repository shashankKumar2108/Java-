package QA_Circle;

import java.util.Iterator;

public class Ass_DescArray {
public static void main(String[] args) {
	int arr[] = {5,2,9,1,7};
	int temp = 0;
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + ", ");
	}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[i]<arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println();
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + ", ");
	}
}
}