package test;

import java.util.Scanner;

public class test3_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String me;
		boolean a = true;
		while(true) {
			int num,min=0,max=99;
			int random = (int)(Math.random()*99+1);
			System.out.print("���ڰ� ���������ϴ�. ���߾� ������!>>");
			while(a) {
				num = sc.nextInt();
				if(num>random) {
					max = num;
					System.out.println("�� ����");
					System.out.println(min+"-"+max);
				}else if(num<random){
					min = num;
					System.out.println("�� ����");
					System.out.println(min+"-"+max);
				}else if(num==random) {
					System.out.println("�¾ҽ��ϴ�.");
					a = false;
					break;
				}
			}
			System.out.print("�ٽ� �ϰڽ��ϱ�?(y/n)");
			me = sc.next();
			if(me.equals("y")) {
				a = true;
			}else {
				System.out.println("������ �����ϰڽ��ϴ�.");
				break;
			}
		}
	}

}


