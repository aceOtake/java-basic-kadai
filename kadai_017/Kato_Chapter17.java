package kadai_017;

abstract public class Kato_Chapter17 {
	
	//�t�B�[���h�F���i�����ƂȂ̂Œ萔�j
	final String familyName = "����";
	
	//�t�B�[���h�F���O
	String givenName;
	
	//�t�B�[���h�F�Z���i�����ƂȂ̂Œ萔�j
	final String address = "�����s�����Z�~";
	
	//���ʂ̏Љ���o�͂���
	public void commonIntroduce() {
		System.out.println("���O��" + this.familyName + this.givenName + "�ł�");
		System.out.println("�Z����" + this.address + "�ł�");
	}
	
	//�ʂ̏Љ���o�͂���
	abstract void eachIntroduce();
	
	//�Љ�����s����
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
