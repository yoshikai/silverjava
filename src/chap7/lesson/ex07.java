package chap7.lesson;

public class ex07 {
	public static void main(String[] args) {
		String s = "123.45";
		change(s);
	}
	public static void change(String s) {
//		int i = 0;
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("caught exception : " + i);	//NG　iが宣言のスコープ外
		}
	}
}
