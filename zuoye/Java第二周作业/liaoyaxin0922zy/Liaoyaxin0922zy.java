package liaoyaxin0922zy;

public class Liaoyaxin0922zy {
	public static class myStudent{
		myStudent(){
			System.out.println("我是构造函数");
		}
	}
//	设计一个教室类,属性有房间号,座位数,房间名,类有三个属性的setter和getter属性,
//	要求形参名和属性名一样
	public static class ClassRoom{//教师类
		private int houseNum;//房间号
		private int sitCount;//座位数
		private String houseName;//房间名
		//三个属性的setter和getter方法
		public int getHouseNum() {//获得房间号
			return houseNum;
		}
		public void setHouseNum(int houseNum) {//设置房间号
			this.houseNum = houseNum;
		}
		public int getSitCount() {//获得座位数
			return sitCount;
		}
		public void setSitCount(int sitCount) {//设置座位数
			this.sitCount = sitCount;
		}
		public String getHouseName() {//获得房间名
			return houseName;
		}
		public void setHouseName(String houseName) {//设置房间名
			this.houseName = houseName;
		}	
		
	}
	//案例:封装一个狗类,属性有名字,年龄,品种,提供对外接口,通过接口才能访问属性和修改属性,
//	修改年龄属性时需要验证合法性.有构造函数先给这些属性赋值
	public static class Dog{//狗类
		private String name;//名字
		private int age;//年龄
		private String type;//品种
		Dog(String name,int age,String type){//构造函数初始化
			this.name=name;
			this.age=age;
			this.type=type;
		}
		String getName() {//获取名字
			return name;
		}
		void setName(String name) {//设置名字
			this.name = name;
		}
		int getAge() {//获得年龄
			return age;
		}
		void setAge(int age) {//设置年龄
			if(age>0&&age<140) {//验证是否合法
			this.age = age;
			}else {
				System.out.println("年龄不合法");
			}
		}
		String getType() {//获得品种
			return type;
		}
		void setType(String type) {//设置品种
			this.type = type;
		}
		
	}
	public static class Father{//父类
//		Father(){//无参构造函数
//			System.out.println("我是父类的构造函数");
//		}
		Father(int a){//有参构造函数
			this.a=a;//不写这个就不会赋值
		}
		private int a=10;//私有成员
		public int b=20;
		void mytest() {
			System.out.println("我是父类的mytest函数");
		}
	}
	public static class Son extends Father{//子类
		Son(){//若父类构建了有参构造函数且没有无参构造函数此处会报错
			super(100);//必须在第一行
			System.out.println("我是子类的构造函数");
//			System.out.println(a);//不可以继承私有成员
			System.out.println("通过sper继承私有成员:"+super.a);//可以通过关键字super继承私有成员变量,注意super(100)已经先把子复制的一份a更改为100了
			System.out.println(b);//可以继承
			b++;
			System.out.println(b);//可以修改子类中但是没有修改父类中的
			
		}
		Son(int a){
			super(a);
		}
		void mytest() {
			System.out.println("我是子类的mytest函数");
		}
		void mytest01() {
			super.mytest();//调用父类的方法
		}
	}
//	案例:定义一个动物类为父类,里面有动物的名字,年龄,品种.定义三个子类,狗,猫,老虎,然后打印
//	出信息,如:2岁的拉布拉多旺财汪汪汪的叫 
	public static class Animals{//动物类
		private String name;//名字
		private int age;//年龄
		private String type;//品种
		Animals(String name,int age,String type){//初始化构造函数
			this.name=name;
			this.age=age;
			this.type=type;
		}
		void speak() {
			
		}
	}
	public static class Dog1 extends Animals{//狗类

		Dog1(String name, int age, String type) {
			super(name, age, type);//给父类不含无参构造函数的子类赋值
		}
		void speak() {
			System.out.println(super.age+"岁的"+super.type+super.name+"在旺旺旺的叫");
		}
		}
	public static class Cat extends Animals{//猫类

		Cat(String name, int age, String type) {
			super(name, age, type);//给父类不含无参构造函数的子类赋值
		}
		void speak() {
			System.out.println(super.age+"岁的"+super.type+super.name+"在喵喵喵的叫");
		}
		}
	public static class Tigger extends Animals{//老虎类
		Tigger(String name, int age, String type) {
			super(name, age, type);//给父类不含无参构造函数的子类赋值
		}
		void speak() {
			System.out.println(super.age+"岁的"+super.type+super.name+"在嗷呜嗷呜的叫");
		}
		}
	 static void mytest(Animals an) {//叫声操作
		an.speak();
	}
	 public static class Car{//汽车父类
		 private String  brandName;//品牌名字
		 private String model;//型号
		 private double price;//价格
		 Car(String  brandName,String model,double price){
			 this.brandName=brandName;
			 this.model=model;
			 this.price=price;
		 }
		 void myBrand() {
			 
		 }
	 }
	 public static class Bmw extends Car{//宝马子类
		 Bmw(String  brandName,String model,double price){
			 super(brandName,model,price);//初始化
		 }
		 void myBrand() {
			 System.out.println("我的汽车品牌是："+super.brandName);
		 }
	 }
	 //操作
	 static void mytest01(Car mycar) {
		 mycar.myBrand();
	 }
	 public static void main(String[] args) {
		// TODO 自动生成的方法存根
		myStudent m=new myStudent();
//		案例:在别的文件定义一个类,类中有属性name,age,score,其中age赋值时要判断合法性
//		可以通过构造函数赋值,可以调用打印这些属性的方法
		B01 n=new B01("张三",18,99.5);
		System.out.println("姓名："+n.getName()+" 年龄："+n.getAge()+" 分数："+n.getScore());
		
		ClassRoom c=new ClassRoom();
		c.setHouseNum(1001);//设置房间号
		c.setSitCount(50);//设置座位数
		c.setHouseName("软件测试");//设置房间名
		//打印获得已设置成员比那里
		System.out.println("房间号："+c.getHouseNum()+" 座位数："+c.getSitCount()+" 房间名："+c.getHouseName());
		
		Dog dog=new Dog("小花",2,"柴犬");//实例化对象
		System.out.println("名字："+dog.getName()+" 年龄："+dog.getAge()+" 品种："+dog.getType());
		dog.setAge(144);//设置不合法年龄
		dog.setName("小黄");//设置名字
		dog.setAge(3);//设置合法年龄
		dog.setType("柯基");//设置品种
		System.out.println("名字："+dog.getName()+" 年龄："+dog.getAge()+" 品种："+dog.getType());
		
	
		Son mys=new Son();//先调用父类中的构造函数，再调用子类中的构造函数
		Father f=new Father(10);
		System.out.println("我是父类中的："+f.b);//修改子类中的父类中的未被修改，是因为子类继承是复制了一份过来
		mys.mytest();
		mys.mytest01();
		
		
		Dog1 mydog=new Dog1("小花",2,"泰迪");
		Cat mycat=new Cat("缪缪",3,"布偶");
		Tigger myti=new Tigger("小猪",4,"东北虎");
		mytest(mydog);//狗对象操作
		mytest(mycat);//猫对象操作
		mytest(myti);//老虎对象操作
		
		
//		2.构造方法是谁调用的
//		实例化对象
//		3.子类的构造函数默认调用父类的什么构造函数
//		无参构造函数
//		4.如果子类的构造函数要调用父类的有参构造,要用什么调用
//		super();//调用
//		5.This的作用是什么
//		区别同名的成员变量和局部变量
//		6.继承的关键字是什么
//		extends
//		7.继承可以继承父类的私有变量吗?
//		可以继承，用super.私有变量名
//		8.写一个汽车的多态案例,如汽车类是父类,宝马的子类,操作打印各自子类的品牌
//		回答:
		Bmw bm=new Bmw("宝马","x3",800000);
		mytest01(bm);
	}

}
