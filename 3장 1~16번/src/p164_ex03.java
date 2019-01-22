import java.util.Scanner;
public class p164_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);

	        int num = scanner.nextInt();
	        
	        for(int i=0;i<num;i++) //5줄 -> 5번 반복
	        {
	            for(int j=num-i;j>0;j--)// i는 처음에는 0 이였다가 1개씩 증가한다.
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
