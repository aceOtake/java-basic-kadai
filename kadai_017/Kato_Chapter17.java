package kadai_017;

abstract public class Kato_Chapter17 {
	
	//フィールド：姓（加藤家なので定数）
	final String familyName = "加藤";
	
	//フィールド：名前
	String givenName;
	
	//フィールド：住所（加藤家なので定数）
	final String address = "東京都中野区〇×";
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	//個別の紹介を出力する
	abstract void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
