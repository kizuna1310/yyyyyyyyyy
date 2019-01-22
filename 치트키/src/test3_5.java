package test;

import java.util.Scanner;

public class test3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		int array[] = new int[10];
		int i=0;
		do {
			int num = sc.nextInt();
			array[i] = num;
			i++;
		}while(i<array.length);
		for(int j=0; j<array.length; j++) {
			if(array[j]%3==0) {
				System.out.print(array[j]+" ");
			}
		}
		sc.close();
	}

}
