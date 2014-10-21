import java.util.Scanner;

public class practice7_12 {

    static void printBits(int x) {
	for(int i = 31; i >= 0; i--)
	    System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }


    static int rRotate(int x,int n) {
	int a = 0;
	a = x >>> n;
	x = x << 32 - n;
	x = a | x;
	return x;    

    }

    static int lRotate(int x,int n) {
	int a = 0;
	a = x << n;
	x = x >>> 32 - n;
	x = a | x;
	return x;

    }

    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.print("x：");
	int x = stdIn.nextInt();
	printBits(x);

	System.out.print("\nnビット右へ回転します。n：");
	int n = stdIn.nextInt();
	System.out.println(rRotate(x,n));
	printBits(rRotate(x,n));

	System.out.print("\nnビット左へ回転します。n：");
	n = stdIn.nextInt();
	System.out.println(lRotate(x,n));
	printBits(lRotate(x,n));

    }
}
