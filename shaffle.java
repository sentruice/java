//シャッフルテストプログラム
class ShuffleTest{
    public static void main(String[] args){      
	int[] a = {1, 2, 3, 4, 5, 6, 7};

	shuffle(a);

	//ちゃんとシャッフルされたかの結果を表示
	for(int i=0; i<a.length; i++){
	    System.out.print(a[i] + " ");
	}
    }

    //引数で指定した配列をシャッフルする**********
    public static void shuffle(int[] arr){
	for(int i=arr.length-1; i>0; i--){
	    int t = (int)(Math.random() * i);  //0～i-1の中から適当に選ぶ

	    //選ばれた値と交換する
	    int tmp = arr[i];
	    arr[i]  = arr[t];
	    arr[t]  = tmp;
	}
    }
}
