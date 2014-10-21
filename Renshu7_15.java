import java.util.Scanner;

class Renshu7_15{

    static int sumOf(int[] a){
	int sum = 0;
	for(int i=0;i<a.length;i++)
	    sum += a[i];
	return sum;
    }

    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.print("要素数：");
	int n = stdIn.nextInt();

	int[] a = new int[n];
	for(int i=0;i<n;i++) {
	    System.out.print("a["+i+"]=");
	    a[i] = stdIn.nextInt();
	}

	System.out.println("配列 aの全要素の和は"+sumOf(a)+"です。");

    }
}
