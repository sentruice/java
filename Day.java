class Day {
    private int year;
    private int month;
    private int date;

    //--- コンストラクタ ---//
    Day(int year, int month, int date) {
	this.year = year;
	this.month = month;
	this.date = date;
    }
    //--- アクセッサ ---//
    //--- ゲッタ ---//
    int getYear() {
	return year;
    }
    int getMonth() {
	return month;
    }
    int getDate() {
	return date;
    }
    //--- セッタ ---//
    void setYear(int year) {
	this.year = year;
    }
    void setMonth(int month) {
	this.month = month;
    }
    void setDate(int date) {
	this.date = date;
    }

    void set(int year, int month, int date) {
	this.year = year;
	this.month = month;
	this.date = date;
    }

    //--- 曜日を求める ---//
    int dayOfWeek() {
	int y = year;
	int m = month;
	if (m == 1 || m == 2) {
	    y--;
	    m += 12;
	}
	return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }
}
