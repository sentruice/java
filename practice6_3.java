public class practice6_3 {
    public static void main(String[] args) {
	double x[] = new double[5];
	for (int i = 0; i < x.length; i ++) {
	    x[i] = (i + 1) * 1.1;
	}
	for (int i = 0; i < x.length; i++) {
	    System.out.printf("x[%d] = %.1f\n", i, x[i]);
	}
    }
}
