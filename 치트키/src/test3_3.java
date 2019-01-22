package test;

import java.util.Scanner;

public class test3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
