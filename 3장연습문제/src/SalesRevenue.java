
public class SalesRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int intArray[][] = {{90, 90, 110, 110}, //1줄의 4칸
							{120, 110, 100, 110}, //2줄의 4칸
							{120,140, 130, 150}}; //3줄의 4칸
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++) // ; 안찍게 조심 intArray.length=3 , 3줄 4칸
			for (int j = 0; j < intArray[i].length; j++) // intArray[i].length=4
				sum += intArray[i][j];
		
				System.out.println("지난 3년간 매출 총액은" + sum + "이며 연평균 매출은" 
									+ sum/intArray.length + "입니다.");

	}

}
