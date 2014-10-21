class Human {
    private String name;
    private double height;
    private double weight;
    //--- コンストラクタ ---//
    Human(String name, double height, double weight) {
	this.name = name;
	this.height = height;
	this.weight = weight;
    }
    void getSpec() {
	System.out.println("名前:" + name);
	System.out.println("身長:" + height + "cm");
	System.out.println("体重:" + weight + "kg");
    }
}
