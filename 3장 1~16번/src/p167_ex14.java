import java.util.Scanner;
public class p167_ex14 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score [] = {95, 88, 76, 62, 55}; 
		
		while (true) 
		{
			System.out.println("���� �̸�>>");
			String name = scanner.next();
			
			
			if(name.equals("�׸�")) 
				break;	 //while�� �����ڴ�.
			
			int i=0;
			for(i=0;i<course.length;i++)
			{
				if(name.equals(course[i]))
				{	
//					name, course[i]//�����
//					socre[i]//����	
					System.out.println(name + "�� ������" + score[i]);
					break;
				}
			}
			if(i==course.length) //i�� 5�� �Ǹ� ��ã�´�.
			{
				System.out.println("���� ���� �Դϴ�.");
			}
		}
	}
}
