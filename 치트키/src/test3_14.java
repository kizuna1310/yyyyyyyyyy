package test;

import java.util.Scanner;

public class test3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String coures[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		String name;
		int num;
		while(true) {
			System.out.print("과목 이름>>");
			name = sc.next();
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}else {
				for(int i=0; true; i++) {
					if(coures[i].equals(name)) {
						System.out.println(score[i]);
						break;
					}else if(!name.equals(coures[i]) && i == 4) {
						System.out.println("없는 과목입니다.");
						break;
					}
				}
			}
		}
		
	}

}

