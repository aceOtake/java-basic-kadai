package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		//boolean�^�̔z����쐬������������
		boolean[] bl = new boolean[100];
		
		int[] number = new int[100];
		
		for (int cnt = 0;cnt < bl.length; cnt++) {
			bl[cnt] = true;
			number[cnt] = cnt + 1;
		}
		
		boolean judgePrime = false;	//�f������p�@true�F�f���@false:�f���ł͂Ȃ�
		
		for (int num:number) {
			
			// �Ώۂ������Ȃ玟�̒l��
			if ( num == 2 ) { 
				//2�͑f���Ȃ̂ŕʔ���
				System.out.println(num);	
				continue;
			} else if ( num % 2 == 0 ) {
				continue;
			}
			
			//�������g�ȊO�̖񐔂̗L�����`�F�b�N
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
