package test;

import java.util.Scanner;

public class test3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String coures[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		String name;
		int num;
		while(true) {
			System.out.print("���� �̸�>>");
			name = sc.next();
			if(name.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}else {
				for(int i=0; true; i++) {
					if(coures[i].equals(name)) {
						System.out.println(score[i]);
						break;
					}else if(!name.equals(coures[i]) && i == 4) {
						System.out.println("���� �����Դϴ�.");
						break;
					}
				}
			}
		}
		
	}

}

