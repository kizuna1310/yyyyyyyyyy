package test;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Spliterator;

class test3__11{
	public int avg(String[] args) {
		int avg=0;
		for(int i=0; i<args.length; i++) {
			avg += Integer.parseInt(args[i]);
		}
		avg = avg/args.length;
		return avg;
	}
	public int avg2(String[] args) {
		int avg2=0;
		for(int i=0; i<args.length; i++) {
			avg2 += Integer.parseInt(args[i]);
		}
		avg2 = avg2%args.length;
		return avg2;
	}
}
public class test3_11{
	public static void main(String[] args) {
		//args�� ���������Ʈ���� �Է��� ���� �迭���·� �����Ѵ�.
		//cmd������ ���� class�� ��ο� �ͼ� java test.test3_11 2 3 4
		test3__11 t = new test3__11();
		int sum = t.avg(args);
		int sum2 = t.avg2(args);
		System.out.println("��� :"+sum + " ������ ��: "+sum2);
	}
}
