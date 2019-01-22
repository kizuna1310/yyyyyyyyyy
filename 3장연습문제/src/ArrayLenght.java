import java.util.Scanner;
public class ArrayLenght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5]; //배열의 선언과 생성
		int sum = 0; // 상수 선언
		
		System.out.println(intArray.length + "개의 정수를 입력하세요>>");
		for(int i=0; i<intArray.length;i++)
			intArray[i] = in.nextInt();
		
		for (int i = 0; i < intArray.length;i++)
			sum += intArray[i];
		
		System.out.println("배열 원소의 평균은" + sum/intArray.length + "입니다.");
	}

}
