package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
 
		//�e�X�g���󂯂��l�Ƃ��̓_���̔z��
		String[] studentArray = {"A����","B����","C����","D����","E����","F����","G����","H����","I����","J����"};
		int[] scoreArray = {10,20,30,40,50,60,70,80,90,100};
		
		//���ϓ_�v�Z�p�̕ϐ�
		int sumScore = 0;
		
		//�z������[�v�ŏo��
		for(int cnt = 0 ; cnt < studentArray.length ; cnt++) {
			printScore(studentArray[cnt] ,scoreArray[cnt]);	//���b�Z�[�W���o��
			sumScore += scoreArray[cnt];						//�_���̍��v�l
		}
		
		System.out.println("�e�X�g�̕��ϓ_��" + sumScore / studentArray.length + "�_");
		
	}

	//���b�Z�[�W���o��
	static void printScore(String student,int score) {
		
		final String msg1 = "�̓_����"; 
		
		System.out.println(student + msg1 + score + "�_");
	}
	
}
