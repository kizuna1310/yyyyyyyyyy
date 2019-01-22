package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("곱하고자 하는 두 수 입력(0입력시 프로그램 종료)>>");
		int n,m;
		while(true) {
			try {
				n = sc.nextInt();
				m = sc.nextInt();
				if(n==0 || m==0) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println(n+"x"+m+"="+n*m);
				System.out.print("곱하고자 하는 두 수 입력(0입력시 프로그램 종료)>>");
			}catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.print("Error! 정수만 입력하세요. 정수 입력(0입력시 프로그램 종료)>>");
				continue;
			}
		}
	}

}
