package maker;

public class A02变量 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义变量
		int a;
		a=10;
		int a1=10;//初始化
		//打印变量中的值
		System.out.println("a="+a);
		System.out.println("a1="+a1);
		
		//同时定义多个变量
		int b1,b2,b3;
		b1=10;
		b2=20;
		b3=30;
		System.out.printf("b1=%d"+" b2=%d"+" b3=%d\n", b1,b2,b3);
		System.out.printf("b1=%d"+" b2=%d"+" b3=%d\n", b1,b2,b3);
		
		//注意:不能使用未赋值的变量
		int c;
//		int cc=c;
//		System.out.println(c);//报错
		
		int d1=20,d2=30,d3=40;//定义多个变量并初始化
		System.out.println("d1="+d1+" d2="+d2+" d3="+d3);
		
	}

}
