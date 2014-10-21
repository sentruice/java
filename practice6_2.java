public class practice6_2 {
    public static void main(String[] args) {
	int x[] = new int[5];
	for (int i = 0; i < x.length; i++) {
	    x[i] = x.length - i;
	}
	for (int i = 0; i < x.length; i++) {
	    System.out.println("x[" + i +  "] = " + x[i]);
	}
    }
}
