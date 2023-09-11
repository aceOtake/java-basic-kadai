package kadai_017;

//加藤一郎を表すクラス
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	//名前フィールドの値をセットする
	public void setGivenName(String GivenName) {
		this.givenName = GivenName;
	}
	
//	@Override：個別紹介
	void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
