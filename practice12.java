import java.util.Random;

public class practice12 {
    public static void main(String[] args) {
	Random rand = new Random();
	System.out.println("0.0以上1.0以下の実数値の乱数を生成します。");
	double x = rand.nextDouble();
	System.out.println(x);
	System.out.println("0.0以上10.0以下の実数値の乱数を生成します。");
	double y = rand.nextDouble() * 10;
	System.out.println(y);
	System.out.println("-1.0以上1.0以下の実数値の乱数の生成します。");
	double z = rand.nextDouble() * 2 - 1;
	System.out.println(z);
	}

}
