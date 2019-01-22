package test;

import java.util.Scanner;

public class test3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		int aa=0,bb=0,cc=0,dd=0,ee=0,ff=0,gg=0,hh=0;
		for(int a=money; a>=50000; a-=50000) {
			aa++;
			money-=50000;
		}
		for(int b=money; b>=10000; b-=10000) {
			bb++;
			money-=10000;
		}
		for(int c=money; c>=1000; c-=1000) {
			cc++;
			money-=1000;
		}
		for(int d=money; d>=500; d-=500) {
			dd++;
			money-=500;
		}
		for(int e=money; e>=100; e-=100) {
			ee++;
			money-=100;
		}
		for(int f=money; f>=50; f-=50) {
			ff++;
			money-=50;
		}
		for(int g=money; g>=10; g-=10) {
			gg++;
			money-=10;
		}
		for(int h=money; h>=1; h-=1) {
			hh++;
			money-=1;
		}
		System.out.println("50000원 짜리 :"+aa+"개");
		System.out.println("10000원 짜리 :"+bb+"개");
		System.out.println("1000원 짜리 :"+cc+"개");
		System.out.println("500원 짜리 :"+dd+"개");
		System.out.println("100원 짜리 :"+ee+"개");
		System.out.println("50원 짜리 :"+ff+"개");
		System.out.println("10원 짜리 :"+gg+"개");
		System.out.println("1원 짜리 :"+hh+"개");
		sc.close();
	}

}
