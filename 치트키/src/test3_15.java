package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϰ��� �ϴ� �� �� �Է�(0�Է½� ���α׷� ����)>>");
		int n,m;
		while(true) {
			try {
				n = sc.nextInt();
				m = sc.nextInt();
				if(n==0 || m==0) {
					System.out.println("�����մϴ�.");
					break;
				}
				System.out.println(n+"x"+m+"="+n*m);
				System.out.print("���ϰ��� �ϴ� �� �� �Է�(0�Է½� ���α׷� ����)>>");
			}catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.print("Error! ������ �Է��ϼ���. ���� �Է�(0�Է½� ���α׷� ����)>>");
				continue;
			}
		}
	}

}
