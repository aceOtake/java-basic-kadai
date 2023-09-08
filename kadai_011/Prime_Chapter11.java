package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		//boolean型の配列を作成し初期化する
		boolean[] bl = new boolean[100];
		
		int[] number = new int[100];
		
		for (int cnt = 0;cnt < bl.length; cnt++) {
			bl[cnt] = true;
			number[cnt] = cnt + 1;
		}
		
		boolean judgePrime = false;	//素数判定用　true：素数　false:素数ではない
		
		for (int num:number) {
			
			// 対象が偶数なら次の値へ
			if ( num == 2 ) { 
				//2は素数なので別判定
				System.out.println(num);	
				continue;
			} else if ( num % 2 == 0 ) {
				continue;
			}
			
			//自分自身以外の約数の有無をチェック
			for  (int judgeNumber = 2 ; judgeNumber < num ; judgeNumber++) { 
				
				if ( num % judgeNumber == 0 ) {
					judgePrime = false;
					break;
				}
				
				judgePrime = true;
				
			}
			
			if ( judgePrime == true ) {
				System.out.println(num);	
			}
			
		}	
	}

}
