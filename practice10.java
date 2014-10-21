import java.util.Random;

public class practice10 {

    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("1桁の正の整数の乱数");
        int x = rand.nextInt(8) + 1;
        System.out.println(x);
        System.out.println("1桁の負の整数の乱数");
        int y = rand.nextInt(8) - 9;
        System.out.println(y);
        System.out.println("10以上99以下の乱数");
	int z = rand.nextInt(89) + 10;
	System.out.println(z);
    }

}
