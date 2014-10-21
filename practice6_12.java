import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.util.Arrays;

public class practice6_12 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

	System.out.print("要素数:");
	int n = scan.nextInt();
	int[] a = new int[n];

	System.out.print("配列aの要素\n{");
	for (int i = 0; i < n; i++) {
	    a[i] = rand.nextInt(10);
	    System.out.print(a[i] + " ");
	}
	System.out.println("}");

	List<int> list = Arrays.asList(a);
	Collections.shuffle(list);

	int[] a2 = (int[])list.toArray(new int[list.size()]);
	System.out.println("配列aの要素{");
	for (int i = 0; i < n; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println("}");
    }
}
