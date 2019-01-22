package test;

import java.util.Scanner;

public class test3_16 {

	public static void main(String[] args) {
		String str[] = {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("가위 바위 보!>>");
			String me = sc.next();
			int random = (int)(Math.random()*3);
			if(random==0 && str[random].equals("가위") == me.equals("가위")) {
				System.out.println("컴퓨터가 낸 수는 : "+str[random]);
				System.out.println("사용자가 낸 수는 : "+me);
				System.out.println("비겼습니다.");
			}else {
				if(random==0 && me.equals("바위")) {
					System.out.println("컴퓨터가 낸 수는 : "+str[random]);
					System.out.println("사용자가 낸 수는 : "+me);
					System.out.println("사용자의 패배.");
					
				}else if(random==0 && me.equals("보")) {
					System.out.println("컴퓨터가 낸 수는 : "+str[random]);
					System.out.println("사용자가 낸 수는 : "+me);
					System.out.println("사용자가 이겼습니다!");
					
				}else if(random==0 && me.equals("그만")) {
					System.out.println("게임을 종료합니다...");
					break;
				}else if(random==0){
					System.out.println("그런 수는 없습니다.");
				}
			}
			if(random==1 && str[random].equals("바위") == me.equals("바위")) {
				System.out.println("컴퓨터가 낸 수는 : "+str[random]);
				System.out.println("사용자가 낸 수는 : "+me);
				System.out.println("비겼습니다.");
			}else {
				if(random==1 && me.equals("가위")) {
					System.out.println("컴퓨터가 낸 수는 : "+str[random]);
					System.out.println("사용자가 낸 수는 : "+me);
					System.out.println("사용자의 패배.");
					
				}else if(random==1 && me.equals("보")) {
					System.out.println("컴퓨터가 낸 수는 : "+str[random]);
					System.out.println("사용자가 낸 수는 : "+me);
					System.out.println("사용자가 이겼습니다!");
					
				}else if(random==1 && me.equals("그만")) {
					System.out.println("게임을 종료합니다...");
					break;
				}else if(random==1){
					System.out.println("그런 수는 없습니다.");
				}
			}
			if(random==2 && str[random].equals("보") == me.equals("보")) {
				System.out.println("컴퓨터가 낸 수는 : "+str[random]);
				System.out.println("사용자가 낸 수는 : "+me);
				System.out.println("비겼습니다.");
			}else {
				if(random==2 && me.equals("바위")) {
					System.out.println("컴퓨터가 낸 수는 : "+str[random]);
					System.out.println("사용자가 낸 수는 : "+me);
					System.out.println("사용자의 패배.");
					
				}else if(random==2 && me.equals("가위")) {
					System.out.println("컴퓨터가 낸 수는 : "+str[random]);
					System.out.println("사용자가 낸 수는 : "+me);
					System.out.println("사용자가 이겼습니다!");
					
				}else if(random==2 && me.equals("그만")) {
					System.out.println("게임을 종료합니다...");
					break;
				}else if(random==2) {
					System.out.println("그런 수는 없습니다.");
				}
			}
			
		}
	}

}
