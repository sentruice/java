import java.util.Scanner;
public class practice6_5 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("要素数:");
	int x[] = new int[scan.nextInt()];
	for (int i = 0; i < x.length; i++) {
	    System.out.print("x[" + i + "] = ");
	    x[i] = scan.nextInt();
	}
	System.out.print("x = {");
	for (int i = 0; i < x.length; i++) {
	    System.out.print(x[i]);
	    if (i != x.length - 1) {
		System.out.print(""
