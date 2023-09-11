package kadai_017;

//加藤太郎を表すクラス
public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
	//名前フィールドの値をセットする
	public void setGivenName(String GivenName) {
		this.givenName = GivenName;
	}
	
//	@Override：個別紹介
	void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}
