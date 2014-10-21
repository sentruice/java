class Account {
    private String name;
    private String email;
    private String password;
    //---コンストラクタ---//
    Account(String n, String add, String num) {
	name = n;
	email = add;
	password = num;
    }

    String getName() {
	return name;
    }

    String getEmail() {
	return email;
    }

    String getPassword() {
	return password;
    }
}

class AccountTester {
    public static void main(String[] args) {
	Account adachi = new Account("足立幸一", "uhouho@i.jp", "uhouho");
	Account okita = new Account("沖田総司", "muramura@vodaphone", "muramura");

	System.out.println("足立の垢");
	System.out.println("名前:" + adachi.getName());
	System.out.println("メール:" + adachi.getEmail());
	System.out.println("パスワード:" + adachi.getPassword());

	System.out.println("沖田の垢");
	System.out.println("名前:" + okita.getName());
	System.out.println("メール:" + okita.getEmail());
	System.out.println("パスワード:" + okita.getPassword());
    }
}
