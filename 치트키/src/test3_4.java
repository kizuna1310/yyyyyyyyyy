package test;

import java.util.Scanner;

public class test3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = sc.next();
		if( s.length() != 1 ) { 
		      System.out.println("알파벳 하나만 입력해야 합니다!"); 
		      sc.close(); 
		      return; 
		} 
		char c = s.charAt(0);
		if( c < 'a' || c > 'z' ) { 
		     System.out.println("소문자 알파벳이 아닙니다."); 
		     sc.close(); 
		     return; 
		}
		for(char i=c; i>='a'; i--) { //솔직히 for문안에 char가 들어올거라고 생각못함...
			//'a'가 int로 치자면 0같은 개념이며 c에 들어온 알파벳 1개를 char i에 넣고
			//i가 'a'보다 낮아질때까지 반복문을 돌리는 개념
			for(char j='a'; j<=i; j++) {
				//j를 a에 넣어서 i를 낮거나 같은 조건문으로 출력시킨다.
				System.out.print(j);
				//c가 아닌 j를 넣음으로써 출력시킨다. c로 할경우 입력한 그 문자만 줄줄이 나옴
			}
			System.out.println();
		}
	    sc.close();
	}

}
