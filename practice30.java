import java.util.Scanner;

public class practice30 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("今、何月？");
	int a = scan.nextInt();
	switch(a) {
	    case 4 :
	    case 5 :
	    case 6 :
	    System.out.println("春！");
	    break;
	    case 7 :
	    case 8 :
	    case 9 :
	    System.out.println("夏！");
	    break;
	    case 10 :
	    case 11 :
	    System.out.println("秋！");
	    break;
	    case 12 :
	    case 1 :
	    case 2 :
	    case 3 :
	    System.out.println("冬！");
	    break;
	    default:
	    System.out.println("そんな月はない。");
	    break;
	}
    }
}
