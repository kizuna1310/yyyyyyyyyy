
public class foreacEx {
	enum Week {��, ȭ, ��, ��, ��, ��, ��}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5};
		String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		int sum = 0;
		
		//�Ʒ� for-each���� k�� num[0], num[1], num[2], num[3], num[4]�� �ݺ���.
		for (int k : num)
			sum += k;
		System.out.println("����" + sum);
		
		// �Ʒ� for-each���� s�� num[0], num[1], num[2], num[3], num[4], num[5]�� �ݺ���
		for (String s : names)
	    	System.out.println(s + "");
		System.out.println();
		
		// �Ʒ� for-each���� day�� ��, ȭ, ��, ��, ��, ��, �� ������ �ݺ���.
		for (Week day : Week.values())
	    	System.out.println(day + "����");
		System.out.println();
	}
}
