
public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(j=0,i=1; i <= 10;i++); { // 1~10���� �ݺ�
		j += i;
		
		System.out.print(i); //���ϴ� �� ���
		if(i<=9) {
			System.out.print("+");
			
		}
		else
			System.out.print("=");
			System.out.print(j);
		}
	}
}
