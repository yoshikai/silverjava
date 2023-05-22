package chap7.lesson;

import java.io.IOException;

/**
 * 7章練習問題2のサンプルプログラム
 */
public class ex02 {


}
class ExceptionParent{
	void method(int num) throws IOException {}
}
class ExceptionChild extends ExceptionParent{

//	void method(int num) throws IOException{}	//A:OK
//	void method(int num) throws Exception{}		//B:NG コンパイルエラー
//	void method(int num) throws SQLException {}	//C:NG コンパイルエラー
//	void method(int num) throws FileNotFoundException {}	//D:OK
//	void method(int num) {}	//E:OK
}
