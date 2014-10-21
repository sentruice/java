import java.util.Scanner;

public class damage {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("何体の攻撃力を計算するか:");
	int chara = scan.nextInt();
	if (1 < chara) {
	    double sum = 0;
	    for (int j = 0; j < chara; j++) {

		System.out.print("攻撃力:");
		double at = scan.nextDouble();

		System.out.print("コンボ数:");
		double combo = scan.nextDouble();

		System.out.print("LS倍率:");
		double ls = scan.nextDouble();

		System.out.print("エンハンス倍率(無しの場合は1を入力):");
		double enha = scan.nextDouble();

		System.out.print("列強化個数:");
		double line = scan.nextDouble();

		System.out.print("何列消したか:");
		double retsu = scan.nextDouble();

		System.out.print("対象ドロップのセット数:");
		double set = scan.nextDouble();

		System.out.print("1セット目のドロップ個数:");
		double drop = scan.nextDouble();

		System.out.print("1セット目の強化ドロップ数:");
		double kyouka = scan.nextDouble();

		double damage = at * (1 + ((drop - 3) * 0.25)) *(1 + ((kyouka / 2) * 0.12));
		double damage2 = (1 + ((combo - 1) * 0.25)) * ls * enha * (1 + ((0.1 * line) * retsu));
		double single = damage * damage2;
		sum += single;

		if (1 < set) {
		    double damage3 = 0;
		    for (int i = 1; i < set; i++) {
			System.out.print(i + 1 + "セット目のドロップ個数:");
			double d2 = scan.nextDouble();
			System.out.print(i + 1 +"セット目の強化ドロップ数:");
			double kyouka2 = scan.nextDouble();
			damage3 += at * (1 + ((d2 - 3) * 0.25)) * (1 + ((kyouka2 / 2) * 0.12));
		    }
		    double damage4 = (damage + damage3) * damage2;
		    sum += damage4;
		    System.out.println("与えダメージは" + damage4 + "です。");
		}
		else {
		    System.out.println("与えダメージは" + single + "です。");
		}
	    }
	    System.out.println("与えダメージの合計は" + sum + "です。");
	}
    }
}
