package test;

public class test3_12 {
	public static void main(String[] args) {
			int sum = 0;
			for(int i=0; i<args.length; i++) {
				try {
					sum+=Integer.parseInt(args[i]);
				}catch (NumberFormatException e) {
					//int타입에 string을 담을려고 할때 생기는 오류를 방지할때 쓴다.
					//double도 분류가 가능한것으로 보임
				}catch (Exception e) {
					
				}
			}
			System.out.println(sum);
	}
}
