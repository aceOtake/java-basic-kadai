package kadai.kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {

		int userAge = 0;		//ユーザーの年代
		int serviceCost = 0;	//サービスの利用料金
		
		int[] ageArray = {10,20,30,40,50,60,70,80,999};
		int[] priceArray = {1000,2000,3000,3000,4000,4000,4000,5000,500};
		
		userAge = 39;
		
		//年代を計算
		int judgeAge = (userAge / 10 ) * 10;	
		
		for (int cnt = 0 ; cnt < ageArray.length ; cnt++ ) {
			
			if (ageArray[cnt] == judgeAge) {				
				//10代～80代まで
				switch (cnt) {
					case 0 -> serviceCost = priceArray[cnt];
					case 1 -> serviceCost = priceArray[cnt];
					case 2 -> serviceCost = priceArray[cnt];
					case 3 -> serviceCost = priceArray[cnt];
					case 4 -> serviceCost = priceArray[cnt];
					case 5 -> serviceCost = priceArray[cnt];
					case 6 -> serviceCost = priceArray[cnt];
					case 7 -> serviceCost = priceArray[cnt];
					case 8 -> serviceCost = priceArray[cnt];
				}			
				System.out.println(ageArray[cnt] + "代の料金は" + serviceCost + "円");
				break;
			} else if(judgeAge < ageArray[0] || judgeAge > ageArray[7]) {
				//10代以下 or 90代以降
				serviceCost = priceArray[8];
				System.out.println(judgeAge + "代の料金は" + serviceCost + "円");
				break;
			}
			
		}
		
		
		
	}

}
