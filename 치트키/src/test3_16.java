package test;

import java.util.Scanner;

public class test3_16 {

	public static void main(String[] args) {
		String str[] = {"����","����","��"};
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� ���� ��!>>");
			String me = sc.next();
			int random = (int)(Math.random()*3);
			if(random==0 && str[random].equals("����") == me.equals("����")) {
				System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
				System.out.println("����ڰ� �� ���� : "+me);
				System.out.println("�����ϴ�.");
			}else {
				if(random==0 && me.equals("����")) {
					System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
					System.out.println("����ڰ� �� ���� : "+me);
					System.out.println("������� �й�.");
					
				}else if(random==0 && me.equals("��")) {
					System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
					System.out.println("����ڰ� �� ���� : "+me);
					System.out.println("����ڰ� �̰���ϴ�!");
					
				}else if(random==0 && me.equals("�׸�")) {
					System.out.println("������ �����մϴ�...");
					break;
				}else if(random==0){
					System.out.println("�׷� ���� �����ϴ�.");
				}
			}
			if(random==1 && str[random].equals("����") == me.equals("����")) {
				System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
				System.out.println("����ڰ� �� ���� : "+me);
				System.out.println("�����ϴ�.");
			}else {
				if(random==1 && me.equals("����")) {
					System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
					System.out.println("����ڰ� �� ���� : "+me);
					System.out.println("������� �й�.");
					
				}else if(random==1 && me.equals("��")) {
					System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
					System.out.println("����ڰ� �� ���� : "+me);
					System.out.println("����ڰ� �̰���ϴ�!");
					
				}else if(random==1 && me.equals("�׸�")) {
					System.out.println("������ �����մϴ�...");
					break;
				}else if(random==1){
					System.out.println("�׷� ���� �����ϴ�.");
				}
			}
			if(random==2 && str[random].equals("��") == me.equals("��")) {
				System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
				System.out.println("����ڰ� �� ���� : "+me);
				System.out.println("�����ϴ�.");
			}else {
				if(random==2 && me.equals("����")) {
					System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
					System.out.println("����ڰ� �� ���� : "+me);
					System.out.println("������� �й�.");
					
				}else if(random==2 && me.equals("����")) {
					System.out.println("��ǻ�Ͱ� �� ���� : "+str[random]);
					System.out.println("����ڰ� �� ���� : "+me);
					System.out.println("����ڰ� �̰���ϴ�!");
					
				}else if(random==2 && me.equals("�׸�")) {
					System.out.println("������ �����մϴ�...");
					break;
				}else if(random==2) {
					System.out.println("�׷� ���� �����ϴ�.");
				}
			}
			
		}
	}

}
