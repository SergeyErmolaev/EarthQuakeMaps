package module6;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 2, 3, 1, 4 };
		for (int i = 0; i < arr.length - 2; i++) {
			System.out.println("i: " + i);
			for (int j = 0; j < arr.length - 1; j++) {
				System.out.println("j: " + j);
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					System.out.println("temp: " + temp);
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					System.out.println("arr[j]: " + arr[j]);
					System.out.println("arr[j + 1]: " + arr[j + 1]);
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = { 5, 2, 3, 1, 4 };
		selectionSort(arr2);
//		System.out.println(Arrays.toString(arr2));
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

}
