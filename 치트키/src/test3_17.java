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
			System.out.print("숫자가 정해졌습니다. 맞추어 보세요!>>");
			while(a) {
				num = sc.nextInt();
				if(num>random) {
					max = num;
					System.out.println("더 낮게");
					System.out.println(min+"-"+max);
				}else if(num<random){
					min = num;
					System.out.println("더 높게");
					System.out.println(min+"-"+max);
				}else if(num==random) {
					System.out.println("맞았습니다.");
					a = false;
					break;
				}
			}
			System.out.print("다시 하겠습니까?(y/n)");
			me = sc.next();
			if(me.equals("y")) {
				a = true;
			}else {
				System.out.println("게임을 종료하겠습니다.");
				break;
			}
		}
	}

}


