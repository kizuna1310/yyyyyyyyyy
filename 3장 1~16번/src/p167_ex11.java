public class p167_ex11 {
	public static void main(String[] args) 
	{
		if(args.length == 0)
			System.out.println("명령인자가 없습니다.");
		
		int sum = 0;
		
		for (int i=0; i<args.length; i++)
			sum += Integer.parseInt(args[i]);
		System.out.println("평균 :" + sum/args.length);
	}
}