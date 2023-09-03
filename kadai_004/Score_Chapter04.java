package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
 
		//テストを受けた人とその点数の配列
		String[] studentArray = {"Aさん","Bさん","Cさん","Dさん","Eさん","Fさん","Gさん","Hさん","Iさん","Jさん"};
		int[] scoreArray = {10,20,30,40,50,60,70,80,90,100};
		
		//平均点計算用の変数
		int sumScore = 0;
		
		//配列をループで出力
		for(int cnt = 0 ; cnt < studentArray.length ; cnt++) {
			printScore(studentArray[cnt] ,scoreArray[cnt]);	//メッセージを出力
			sumScore += scoreArray[cnt];						//点数の合計値
		}
		
		System.out.println("テストの平均点は" + sumScore / studentArray.length + "点");
		
	}

	//メッセージを出力
	static void printScore(String student,int score) {
		
		final String msg1 = "の点数は"; 
		
		System.out.println(student + msg1 + score + "点");
	}
	
}
