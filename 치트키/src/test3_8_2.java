package test;

import java.util.Scanner;

public class test3_8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength;
		System.out.print("정수 몇개?");
		do {
			arrLength = sc.nextInt();
		}while(arrLength <=0 || arrLength > 100 );
		int arr[] = new int[arrLength];
		for(int i=1; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j] && i != j) {
					i--;
				}
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			System.out.printf("%-3d",arr[i]);
			//arr[0]칸을 비워야 가능하다.
			if(i%10==0 && i > 9) {
				System.out.println();
			}
		}
	}

}
