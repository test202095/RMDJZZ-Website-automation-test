package liaoyaxinzyb;

public class Aprotected01 {
	protected void mytest02() {
		System.out.println("我是protected的不同包下的成员函数");
	}
	protected int pt=30;//成员变量
	public void mytest002() {
		mytest02();
	}
}
