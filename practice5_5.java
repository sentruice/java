import java.util.Scanner;

public class practice5_5 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("整数値x,y,zの合計と平均を求めます。");
	System.out.print("整数値x:");
	int x = scan.nextInt();
	System.out.print("整数値y:");
	int y = scan.nextInt();
	System.out.print("整数値z:");
	int z = scan.nextInt();

	int sum = (x + y + z);
	double ave = (double)sum / 3;
	System.out.println("合計値:" + sum);
	System.out.println("平均値:" + ave);
    }
}
