package test;

import java.util.Scanner;

public class test3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
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
		System.out.println("50000�� ¥�� :"+aa+"��");
		System.out.println("10000�� ¥�� :"+bb+"��");
		System.out.println("1000�� ¥�� :"+cc+"��");
		System.out.println("500�� ¥�� :"+dd+"��");
		System.out.println("100�� ¥�� :"+ee+"��");
		System.out.println("50�� ¥�� :"+ff+"��");
		System.out.println("10�� ¥�� :"+gg+"��");
		System.out.println("1�� ¥�� :"+hh+"��");
		sc.close();
	}

}
