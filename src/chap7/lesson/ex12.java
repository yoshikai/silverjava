package chap7.lesson;

public class ex12 {
	public static void main(String[] args) {
		char c = 'a';
		int i = c;
		System.out.println(i);
		//		Main obj = new Main(5);
//		obj.print();
	}
}
class Main{
	private short s;
	private Integer i;
	public Main(int i) {
		this.i = this.i + i + s;
		this.s = 0;
	}
	public void print() { System.out.println(" s = " + s + " : i = " + i);}
}