import java.util.Scanner;
public class p164_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);

	        int num = scanner.nextInt();
	        
	        for(int i=0;i<num;i++) //5�� -> 5�� �ݺ�
	        {
	            for(int j=num-i;j>0;j--)// i�� ó������ 0 �̿��ٰ� 1���� �����Ѵ�.
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
