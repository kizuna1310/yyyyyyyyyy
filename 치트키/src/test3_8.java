package test;

import java.util.Scanner;

public class test3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개(1~100까지만)?");
		int num = sc.nextInt();
		int[] a = new int[num];
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*100+1);
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		}
		for(int z=0; z<a.length; z++) {
			System.out.print(a[z]+" ");
		}
		sc.close();
	}

}
