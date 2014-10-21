import java.util.Scanner;

class practice7_7 {

    static void putChars(char c,int m) {
	while(m-->0)
	    System.out.print(c);
    }

    static void putStars(int m) {
	putChars('*',m);
    }

    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.println("左下が直角の直角三角形を表示します。");
	System.out.print("段数は：");
	int x = stdIn.nextInt();

	for(int i=1;i<=x;i++){
	    putStars(i);
	    System.out.println();
	}

    }
}
