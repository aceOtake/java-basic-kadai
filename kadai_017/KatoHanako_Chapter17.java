package kadai_017;

//加藤花子を表すクラス
public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	
	//名前フィールドの値をセットする
	public void setGivenName(String GivenName) {
		this.givenName = GivenName;
	}
	
//	@Override：個別紹介
	void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
