import java.util.Scanner;

public class practice49 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int retry;
	do {
	    
	    int mon;
	    do {
		System.out.println("季節を求めます。\n何月ですか？");
		mon = scan.nextInt();
	    } while (mon <= 0 || mon >= 13);
		
		if (mon >= 3 && mon <= 5) {
		    System.out.println("春！");
		}
		else if (mon >= 6 && mon <= 8) {
		    System.out.println("夏！");
		}
		else if (mon >= 9 && mon <= 11) {
		    System.out.println("秋！");
		}
		else if (mon == 12 || mon == 1 || mon == 2) {
		    System.out.println("冬！");
		}
	    
	    System.out.println("もう一度？ 1・・・Yes/0・・・No");
	    retry = scan.nextInt();
	} while (retry == 1);
    }
}
