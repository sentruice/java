class Pet {
    private String name;
    private String masterName;
    //コンストラクタ
    public Pet(String name, String masterName) {
	this.name = name;
	this.masterName = masterName;
    }
    //メソッド
    public String getName() {
	return name;
    }
    public String getMasterName() {
	return masterName;
    }
    public void introduce() {
	System.out.println("ペットの名前は" + name + "です。");
	System.out.println("飼い主の名前は" + masterName + "です。");
    }
}

//継承
class RobotPet extends Pet {
    //コンストラクタ
    public RobotPet(String name, String masterName) {
	super(name, masterName);
    }
    //オーバーライド
    public void introduce() {
	System.out.println("私はロボット。名前は" + getName() + "。");
	System.out.println("ご主人様は" + getMasterName() + "。");
    }
    public void work(int sw) {
	switch(sw) {
	    case 0: System.out.println("掃除します"); break;
	    case 1: System.out.println("洗濯します。"); break;
	    case 2: System.out.println("炊事します。"); break;
	}
    }
}
