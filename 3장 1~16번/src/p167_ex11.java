public class p167_ex11 {
	public static void main(String[] args) 
	{
		if(args.length == 0)
			System.out.println("������ڰ� �����ϴ�.");
		
		int sum = 0;
		
		for (int i=0; i<args.length; i++)
			sum += Integer.parseInt(args[i]);
		System.out.println("��� :" + sum/args.length);
	}
}