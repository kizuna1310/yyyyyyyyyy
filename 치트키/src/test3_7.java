package test;

public class test3_7 {

	public static void main(String[] args) {
		int[] a = new int[10];
		double sum = 0;
		for(int j=0; j<10; j++) {
			a[j] = (int)(Math.random()*10+1);
			sum += a[j];
			System.out.print(a[j]+" ");
		}
		System.out.println();
		double sum2 = sum/a.length;
		System.out.println("ЦђБе :"+sum2);
	}

}
