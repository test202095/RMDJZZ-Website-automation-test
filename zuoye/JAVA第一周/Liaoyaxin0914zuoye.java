package day01lx;

import java.util.Scanner;

public class Liaoyaxin0914zuoye{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		案例:控制台打印出你自己的名字
//		System.out.println("廖雅新");
		Scanner scan=new Scanner(System.in);
//		案例:从控制台输入三次整数,然后打印出最大的数值
		/*
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int max=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(max);
		*/
		
//		案例:从控制台输入一个数据,用变量a接收,如这个变量大于10,就打印"输入的数据大于10"
		/*
		int a=scan.nextInt();
		if(a>10) {
			System.out.println("输入的数据大于10");
		}*/
//		案例:从控制台输入三次整数,然后打印出最大的数值
		/*
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("最大值为："+a);
			}
			else {//a<c
				System.out.println("最大值为："+c);
			}
		}
		else {//a<b
			if(b>c) {
				System.out.println("最大值为："+b);
			}
			else {//b<c
				System.out.println("最大值为："+c);
			}
		}*/
		
		/*案例:输入月份，输出对应的季节：
		1~3--春季
		4~6--夏季
		7~9--秋季
		10~12--冬季
		
		*/
		/*
		System.out.println("请输入月份:");
		int a=scan.nextInt();
		if(a>0 && a<4) {
			System.out.println("春季");
		}else if(a>=4 && a<=6) {
			System.out.println("夏季");
		}else if(a>=7 && a<=9) {
			System.out.println("秋季");
		}else if(a>=10 && a<=12) {
			System.out.println("冬季");
		}else {
			System.out.println("您输入的月份不正确");
		}*/
		/*
		  案例:定义两个整型变量,然后从控制台获取一个字符,如果是+那么这两个变量就相加,输入什么符号就对应运算什么
		从控制台获取一个字符
		char d=scan.next().charAt(0);
		 */
		/*
		int a=10;
		int b=5;
		System.out.println("请输入：");
		char str=scan.next().charAt(0);//获取第一个字符
		switch(str) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("您输入的运算符不合法！");
			break;
		}*/
		/*
		 //变量
		int a;//定义变量
		a=10;//赋值
		int b=20;//初始化
		//同时定义多个变量
		int a1,a2,a3;
		a1=10;
		a2=20;
		a3=30;
		//定义多个变量并初始化
		int b1=10,b2=20,b3=30;
		//println printf 与print
		System.out.printf("a1=%d "+"a2=%d "+"a3=%d\n", a1,a2,a3);//不换行，换行要加\n
		System.out.println("b1="+b1+" b2="+b2+" b3="+b3);//换行
		*/
		/*
		//数据类型
		//数值型
		//byte 占1个字节
		byte a=20;
//		byte a1=129;//报错，超出大小空间
		//short 占2个字节
		short b=5000;
//		short b1=40000;//报错，超出大小空间
		//int 占4个字节（常用）
		int c=10000;
		//long 占8个字节
		long d=1000000000;
		//浮点型  单精度 占4个字节
		float f=22.2222f;
		//浮点型 双精度 占8个字节（常用）
		double d1=22.22222222;
		//字符型
		//char  占两个字节(常用)
		char str='a';
		//布尔型(常用)
		boolean b11=true;
		boolean b22=false;
//		boolean b33=1;//不能赋值数字给boolean类型
		//字符串 字符串是类(常用)
		String str1="hello";
		*/
		/*
//		类型转换
		//隐式转换 从小空间到大空间
		byte a=10;
		short b=a;
		int c=b;
		float f=c;
		double d=f;
		//显示转换，从大到小  强制转换
		double d1=20.222222;
		float f1=(float)d1;
		int c1=(int)f1;
		short b1=(short)d1;
		byte a1=(byte)b1;
		*/
		//考试得分等级判断
		/*
		System.out.println("请输入考试成绩");
		int score=scan.nextInt();
		if(score<0||score>100) {
			System.out.println("输入的成绩不合法");
		}
		else if(score==100) {
			System.out.println("满分");
		}else if(score>80 && score<=99) {
			System.out.println("优秀");
		}
		else if(score>=60 && score<=80) {
			System.out.println("及格");
		}else  {
			System.out.println("不及格");
		}*/
//		三.写出main函数的四要素
//		public 公有权限
//		static 静态修饰，没有对象也可以调用
//		void 默认没有返回值
//		String[]  arg 形参
//		四.请写出int,float,double,char,long分别占内存的大小
//		int  占用4个字节
//		float 占用4个字节
//		double 占用8个字节
//		char 占用2个字节
//		long 占用8个字节
//		五.强制类型转换怎么转换
//		大转小
//		long a1=1000;
//		int a=(int)a1;
		/*
		 * 六.编程题:
                 猜数字,先设定一个数字,然后从控制台输入一个数字,如果比设定的数字大,
                  提示你输入的数字大了,如果输入的数字小了,显示你输入的数字小了,如果输入正确,显示输入的数字正确
		 */
		int num=(int)(Math.random()*90);//产生0到100的随机数,设置为需要猜的数字
//		System.out.println(num);//产生的随机数
		int ina=scan.nextInt();//用户输入猜的数字
		if(ina>num) {
			System.out.println("您输入的数字大了");
		}else if(ina<num) {
			System.out.println("您输入的数字小了");
		}else if(ina==num){
			System.out.println("输入的数字正确");
		}else {
			System.out.println("您输入有误！");
		}
	
		
	}

}
