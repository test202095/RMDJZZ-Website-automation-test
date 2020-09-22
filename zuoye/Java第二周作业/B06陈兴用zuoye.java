package testbag04;

import java.awt.print.Printable;

public class B06陈兴用zuoye {
//	2.构造方法是谁调用的
	//答：构造方法是在对象创建之后，new操作完成前被调用的
	
//	3.子类的构造函数默认调用父类的什么构造函数
	//答：无参构造函数
	
//	4.如果子类的构造函数要调用父类的有参构造,要用什么调用
	//答：super
	
//	5.This的作用是什么
	//答：当形参和成员变量重名时用this区分
	
//	6.继承的关键字是什么
	//答：extends
	
//	7.继承可以继承父类的私有变量吗?
	//答：不可以
	
//	8.写一个汽车的多态案例,如汽车类是父类,宝马的子类,操作打印各自子类的品牌
	public static class Car{
		String brand;//品牌
		String color;//颜色
		String type;//类型
		void carprint() {//父类的carprint函数
			System.out.println("品牌："+brand+" 颜色："+color+" 类型："+type);
		}
	}
	public static class BMW extends Car{
		BMW(String brand,String color,String type){
			this.brand=brand;
			this.color=color;
			this.type=type;
		}
		void Print(){//重写父类的carprint函数
			System.out.println("品牌："+brand+" 颜色："+color+" 类型："+type);
		}
		
	}
	public static class Benz extends Car{
		Benz(String brand,String color,String type){
			this.brand=brand;
			this.color=color;
			this.type=type;
		}
		void Print(){//重写父类的carprint函数
			System.out.println("品牌："+brand+" 颜色："+color+" 类型："+type);
		}
		
	}
	public static class Ferrari extends Car{
		Ferrari(String brand,String color,String type){
			this.brand=brand;
			this.color=color;
			this.type=type;
		}
		void Print(){//重写父类的carprint函数
			System.out.println("品牌："+brand+" 颜色："+color+" 类型："+type);
		}
		
	}
	//操作
	public static void test(Car ca) {//不同变量同一操作产生不同的结果
		ca.carprint();
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BMW b=new BMW("宝马","银色","家用");//调用
		Benz be=new Benz("奔驰","黑色","家用"); 
		Ferrari f=new Ferrari("法拉利","红色","跑车");
		test(b);
		test(f);
		test(be);
	}

}
