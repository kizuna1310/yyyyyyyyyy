
public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(j=0,i=1; i <= 10;i++); { // 1~10까지 반복
		j += i;
		
		System.out.print(i); //더하는 수 출력
		if(i<=9) {
			System.out.print("+");
			
		}
		else
			System.out.print("=");
			System.out.print(j);
		}
	}
}
