package test;

import java.util.Scanner;

public class test3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = sc.next();
		if( s.length() != 1 ) { 
		      System.out.println("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!"); 
		      sc.close(); 
		      return; 
		} 
		char c = s.charAt(0);
		if( c < 'a' || c > 'z' ) { 
		     System.out.println("�ҹ��� ���ĺ��� �ƴմϴ�."); 
		     sc.close(); 
		     return; 
		}
		for(char i=c; i>='a'; i--) { //������ for���ȿ� char�� ���ðŶ�� ��������...
			//'a'�� int�� ġ�ڸ� 0���� �����̸� c�� ���� ���ĺ� 1���� char i�� �ְ�
			//i�� 'a'���� ������������ �ݺ����� ������ ����
			for(char j='a'; j<=i; j++) {
				//j�� a�� �־ i�� ���ų� ���� ���ǹ����� ��½�Ų��.
				System.out.print(j);
				//c�� �ƴ� j�� �������ν� ��½�Ų��. c�� �Ұ�� �Է��� �� ���ڸ� ������ ����
			}
			System.out.println();
		}
	    sc.close();
	}

}
