class Car {
    private String name; //名前
    private int width; //幅
    private int height; //高さ
    private int length; //長さ
    private double x;   //現在位置のx座標
    private double y;   //現在位置のy座標
    private double fuel; //残り燃料

    //---コンストラクタ---//
    Car(String name, int width, int height, int length, double fuel) {
	this.name = name; this.width = width; this.height = height;
	this.length = length; this.fuel = fuel; x = y = 0.0;
    }

    double getX() { //x座標を取得
	return x;
    }
    double getY() { //y座標を取得
	return y;
    }
    double getFuel() { //エネルギー残量を取得
	return fuel;
    }

    //---スペック表示---//
    void putSpec() {
	System.out.println("名前:" + name);
	System.out.println("車幅:" + width);
	System.out.println("車高:" + height);
	System.out.println("車長:" + length);
    }

    //--- X方向にdx,Y方向にdy移動 ---//
    boolean move(double dx, double dy) {
	double dist = Math.sqrt(dx * dx + dy * dy); //移動距離(三平方の定理)
	if (dist > fuel) {
	    return false;
	}
	else {
	    fuel -= dist;
	    x += dx;
	    y += dx;
	    return true;
	}
    }
}
