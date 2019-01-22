import java.util.Scanner;
public class p165_ex06 {

	public static void main(String[] args) {
	
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10,1};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");		
		int money = scanner.nextInt();
		
		int cnt =0;		
		for(int i=0; i<unit.length; ++i)
		{
		cnt = money/unit[i];
		money = money%unit[i];
		
		System.out.println(unit[i] +"원 짜리 : " + cnt +"개");
		}
	}
}
