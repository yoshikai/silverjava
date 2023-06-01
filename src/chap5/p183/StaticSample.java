package chap5.p183;

public class StaticSample{
	public static void main(String[] args){
		for(int i=0; i < 5; i++){
			Sample s = new Sample(100);
			s.incrementVal();
			s.show();
		}
	}
}
/**
 * テキストに載っていないサンプルプログラム
 */
class Sample {

	private static int staticVal = 100;
	private int memberVal;

	/**
	 * コンストラクタ
	 * @param member_val　メンバー変数への初期値
	 */
	public Sample(int member_val){
		this.memberVal = member_val;
	}

	/**
	 * static_
	 */
	public void incrementVal(){
		Sample.staticVal++;
		this.memberVal++;
	}

	public void show(){
		System.out.println("[static]:" + Sample.staticVal + " [member]:" + this.memberVal);
	}
}
