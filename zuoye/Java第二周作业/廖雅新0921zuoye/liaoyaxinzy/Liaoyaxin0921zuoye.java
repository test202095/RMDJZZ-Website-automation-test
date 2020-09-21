package liaoyaxinzy;

import java.util.Scanner;

import liaoyaxinzyb.Adefault01;
import liaoyaxinzyb.Adefault01Son;
import liaoyaxinzyb.Aprivate1;
import liaoyaxinzyb.Aprotected01;
import liaoyaxinzyb.AprotectedSon;
import liaoyaxinzyb.Apublic01;

public class Liaoyaxin0921zuoye {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		案例:设计一个圆形类（Circle），和一个点类（Point），计算点和圆的关系。
//		假如圆心坐标为x0, y0, 半径为r，点的坐标为x1, y1：
//		1）点在圆上：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//		2）点在圆内：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//		3）点在圆外：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
		Point m=new Point();//点的坐标对象
		m.setX(10);
		m.setY(20);
		
		Point n=new Point();//圆心的坐标对象
		n.setX(15);
		n.setY(20);
		
		Circle y=new Circle();//圆的对象
		y.setR(10);
		y.setYx(n);//设置圆心
		
		y.ydgx(n);//判断点与圆的关系
		
		System.out.println("==========分割线============");
		//调用同类中的成员函数和成员方法 public
		mytest01();
		System.out.println(pb);
		//调用同包中的成员函数和成员方法 public
		Apublic ap=new Apublic();
		ap.mytest01();
		System.out.println(ap.pb);
		//调用不同包中的成员函数和成员方法public
		Apublic01 ap1=new Apublic01();
		ap1.mytest01();
		System.out.println(ap1.pb);
//		案例:在本文件内写一个函数,函数的权限是公有的,然后在main中使用这个函数,这个函数的功能是加法功能
		int sum=test(1,2);
		System.out.println(sum);
//		案例:在别的文件写一个类,类里有一个方法,可以排序的,然后在本文件调用使用
		int[] arr={1,4,3,5,2,7,8};
		Apublic01 ap2=new Apublic01();
		ap2.mySort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("==========分割线============");
		//保护成员在本类中
		mytest02();
		System.out.println(pt);
		//保护成员在同包下
		Aprotected apt=new Aprotected();
		apt.mytest02();
		System.out.println(apt.pt);
		//保护成员在不同包下
		Aprotected01 apt1=new Aprotected01();
		apt1.mytest002();//用外包下同类中公有函数调用该保护的成员
		AprotectedSon apt2=new AprotectedSon();//继承该被保护成员的类，并调用该被保护的成员
		apt2.mytest0002();
		//继承不同包中的类
		AprotectedSon1 apt3=new AprotectedSon1();
		apt3.mytest0002();
		System.out.println("==========分割线============");
		//默认权限在同一个类
		mytest03();
		System.out.println(df);
		//默认权限在同包下
		Adefault dft=new Adefault();
		dft.mytest03();
		System.out.println(dft.df);
		//默认权限在不同包下
		Adefault01 dft1=new Adefault01();
//		dft1.mytest03();
		dft1.mytest003();
		//同包继承
		Adefault01Son dft2=new Adefault01Son();
		dft2.mytest0003();
		System.out.println("==========分割线============");
		//私有成员同类
		mytest04();
		System.out.println(pv);
		//私有成员同包
		Aprivate apv=new Aprivate();
//		apv.mytest04();//不同类不可以用
		//私有成员不同包
		Aprivate1 apv1=new Aprivate1();
//		apv1.mytest04();//不同包不可用
		System.out.println("==========分割线============");
		//setter和getter
		//案例:设计一个用户类,类里有私有成员姓名和密码,电话号码.设计这三个私有属性的setter和getter函数
		//其中修改密码需要验证电话号码	
		用户类 user=new 用户类();
		System.out.println("更改前");
		System.out.println("成员姓名："+user.getName());
		System.out.println("密码："+user.getPwd());
		System.out.println("电话号码："+user.getTel());
		user.setName("zhangsan");
		user.setTel("15211598111");
		user.setPasswd("123456");
		System.out.println("更改后");
		System.out.println("成员姓名："+user.getName());
		System.out.println("密码："+user.getPwd());
		System.out.println("电话号码："+user.getTel());
		System.out.println("==========分割线============");
//		1.类的成员权限全有什么
		//公有权限 public
		//保护权限 protected
		//默认权限
		//私有权限 private
//		2.保护权限和默认权限的区别是什么
		//保护权限可以跨包继承保护权限的成员
		//默认权限不可以跨包继承默认权限的成员
//		3.类内可以访问私有权限的成员吗？
		//本类中可以访问私有权限的成员
//		4.当我们要访问类中的私有成员时，我们一般会怎么做？
		//可以使用setter和getter来设置私有权限的成员变量和获取私有权限的成员变量
		//可以使用public的成员调用私有成员函数
//		5.一般把什么成员定义为私有的
		//不想要被外部类访问的成员，不能让外部类随意修改的成员
//		6.编写一个游戏人物类,单独文件编写,游戏人物的属性有姓名,年龄,门派,性别,
//		写出这些属性的getter和setter方法,年龄和性别要检验才能赋值
		GamePerson gp=new GamePerson();
		gp.setName("杨过");
		gp.setAge(100);
		gp.setSect("逍遥派");
		gp.setSex("nan");
		System.out.println("姓名："+gp.getName());
		System.out.println("年龄："+gp.getAge());
		System.out.println("门派："+gp.getSect());
		System.out.println("性别："+gp.getSex());
		System.out.println("==========更改后============");
		gp.setSex("男");//更改合法的性别
		System.out.println("姓名："+gp.getName());
		System.out.println("年龄："+gp.getAge());
		System.out.println("门派："+gp.getSect());
		System.out.println("性别："+gp.getSex());
		
	}
	public static void mytest01() {
		System.out.println("我是public的同类中的函数");
	}
	public static int pb=100;//成员变量
	public static int test(int a,int b) {//定义加法
		return a+b;
	}
	protected static void mytest02() {
		System.out.println("我是protected的同类中的函数");
	}
	protected static int pt=10;
	static void mytest03() {
		System.out.println("我是默认的同类中的函数");
	}
	static int df=1;
	private static void mytest04() {
		System.out.println("我是私有成员的同类中的函数");
	}
	private static int pv=11;//成员变量
static  class 用户类{
	private String memberName;
	private String passwd;
	private String tel; 
	void setName(String name) {
		memberName=name;
	}
	void setPasswd(String pswd) {
		System.out.println("请输入电话号码：");
		Scanner scan=new Scanner(System.in);
		String mytel=scan.next();
		if(mytel.equals(tel)) {//判断输入的是否与电话号码的值相等，相等则进行修改密码
			passwd=pswd;		
		}else {
			System.out.println("您输入的电话号码不正确，不能修改密码！");
		}
	}
	void setTel(String telp) {
		tel=telp;
	}
	String getName() {
		return memberName;
	}
	String getPwd() {
		return passwd;
	}
	String getTel(){
		return tel;
	}
}

}
