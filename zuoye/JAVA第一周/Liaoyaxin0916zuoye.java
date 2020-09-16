package liaoyaxin;

import java.util.Random;

import liaoyaxin.A07类案列.AdvCircle;
import liaoyaxin.A07类案列.Point;

public class Liaoyaxin0916zuoye {
 static class Cube{
	 int xm;//长
	 int ym;//宽
	 int zm;//高
	 //设置长宽高
	 void setX(int x) {
		 xm=x;
	 }
	 void setY(int y) {
		 ym=y;
	 }
	 void setZ(int z) {
		 zm=z;
	 }
	 //获取长宽高
	 int getX() {
		 return xm;
	 }
	 int getY() {
		 return ym;
	 }
	 int getZ() {
		return zm;
	 }
	 //求面积
	 int are() {
		 return (2*(xm*ym)+2*(xm*zm)+2*(ym*zm));
	 }
	 //求体积
	 int val() {
		 return (xm*ym*zm);
	 }
	 //判断立方体是否相同
	 boolean isSame(Cube n) {
		 boolean i=true;
		 if(xm==n.xm&&ym==n.ym&&zm==n.zm) {
			 i=true;
		 }else {
			 i=false;
		 }
		 return i;
	 }
 }
 static class Point{//点类
	  int x1;//点的x坐标
	  int y1;//点的y坐标
	  void setX(int x) {//设置点的x坐标
		  x1=x;
	  }
	  void setY(int y) {//设置点的y坐标
		  y1=y;
	  }
	 
	  int getX() {//获取点的x坐标
		  return x1;
	  }
	  int getY() {//获取点的y坐标
		  return y1;
	  }
	  
	  
 }
static class AdvCircle{//圆形类
	  int r;//半径
	  int x0;//圆的x坐标
	  int y0;//圆的y坐标
	  void setR(int bj) {//设置圆的半径
		  r=bj;
	  }
	  void setX(int x) {//设置圆心的x坐标
		  x0=x;
	  }
	  void setY(int y) {//设置圆心的y坐标
		  y0=y;
	  }
	  int getR() {//获取圆的半径
		  return r;
	  }
	  int getX() {//获取圆心的x坐标
		  return x0;
	  }
	  int getY() {//获取圆心的y坐标
		  return y0;
	  }
	  int isInreg(Point d) {
		  int i=0;//0表示在圆上 1表示在圆内  2表示在圆外
		  if((d.x1-x0)*(d.x1-x0) + (d.y1-y0)*(d.y1-y0) == r*r){
			  i=0;
		  }else if((d.x1-x0)*(d.x1-x0) + (d.y1-y0)*(d.y1-y0) < r*r) {
			  i=1;
		  }else {
			  i=2;
		  }
		  return i;
	  }	  
 }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
////     1.今天的代码好好细细的琢磨一下,但是,如果头痛,请停止!
//		案例:打印一个5行5列的*图案
		char[][] str=new char[5][5];
		for(int i =0;i<str.length;i++) {//外循环控制行 控制总共有多少行
			for(int j=0;j<str[i].length;j++) {//内循环控制列 每一行有几列
				str[i][j]='*';//给二维数组的每行每列赋值
				System.out.print(str[i][j]);//打印
			}
			System.out.println();//每行执行完换行
		}
		
		System.out.println("------------");
//		案例:打印以下图形
//		@@@@@@@@
//		$$$
//		#####
//		@@@@@@
//		!!!!!!!!
		char[][] mystr;//定义二维数组
		mystr=new char[5][];//定义行
		//定义列，每行有几列
		mystr[0]=new char[8];
		mystr[1]=new char[3];
		mystr[2]=new char[5];
		mystr[3]=new char[6];
		mystr[4]=new char[8];
		for(int i=0;i<mystr.length;i++) {
			for(int j=0;j<mystr[i].length;j++) {
				if(i==0 || i==3) {//根据行下标判断第几行应出现的字符
					mystr[i][j]='@';
				}else if(i==1) {
					mystr[i][j]='$';
				}else if(i==2) {
					mystr[i][j]='#';
				}else if(i==4) {
					mystr[i][j]='!';
				}
				System.out.print(mystr[i][j]);//打印
			}
			System.out.println();//每行结束换行
		}
		System.out.println("---------------------");
//		案例:随机生成0-99内的10个数,放入到数组中,并打印出来,然后进行冒泡排序,之后再打印
		Random r=new Random();//引入随机数
		int[] myarr=new int[10];//定义一个长度为10的一维数组
		for(int i=0;i<myarr.length;i++) {//给数组赋值，赋的是0~99的随机数
			myarr[i]=r.nextInt(99);
		}
		//冒泡排序
		for(int i=0;i<myarr.length-1;i++) {
			for(int j=0;j<myarr.length-1-i;j++) {
				if(myarr[j]>myarr[j+1]) {//从小到大
					int temp=myarr[j];
					myarr[j]=myarr[j+1];
					myarr[j+1]=temp;
				}
			}
		}
		//打印排序完成的数组
		for(int i:myarr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======================");
//		案例:写2个函数获取数组中的最大值和最小值
		int[] arr1= {1,2,3,4,5,6};
		System.out.println("最大值为："+getMax(arr1));
		System.out.println("最小值为："+getMin(arr1));
		System.out.println("=======================");
//		案例:写一个能打印数组的函数
		printArr(arr1);
		System.out.println();
		System.out.println("=======================");
//		案列：写2个同名的加法函数,可以传入double类型和int类型的数据
		add(1,2);
		add(2,2.2);
//		创建一个java文件,写一个类,类中有name='maker',age=18;有成set,get设置前面两个属性的方法
//		再另一个文件中调用该类,生成对象,然后通过对象打印出2个属性的值,和调用方法
		Mytest m=new Mytest();
		System.out.println(m.getName()+" "+m.getAge());
		m.setAge(18);
		m.setName("zhangsan");
		System.out.println(m.getName()+" "+m.getAge());
		System.out.println("=======================");
//		案例:设计立方体类(Cube)，求出立方体的面积( 2*a*b + 2*a*c + 2*b*c )和体积( a * b * c)，
//		分别用全局函数和成员函数判断两个立方体是否相等。
		Cube n=new Cube();
		n.setX(10);
		n.setY(20);
		n.setZ(30);
		System.out.println(n.getX()+" "+n.getY()+" "+n.getZ());
		Cube n1=new Cube();
		n1.setX(100);
		n1.setY(200);
		n1.setZ(300);
		System.out.println(n1.getX()+" "+n1.getY()+" "+n1.getZ());
		if(n.isSame(n1)) {
			System.out.println("两个立方体相同");
		}else {
			System.out.println("两个立方体不相同");
		}
		System.out.println("=======================");
//		案例:设计一个圆形类（AdvCircle），和一个点类（Point），计算点和圆的关系。
//		假如圆心坐标为x0, y0, 半径为r，点的坐标为x1, y1：
//		1）点在圆上：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//		2）点在圆内：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//		3）点在圆外：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
		AdvCircle ad=new AdvCircle();
		Point p=new Point();
		ad.setR(3);
		ad.setX(0);
		ad.setY(0);
		p.setX(0);
		p.setY(3);
		if(ad.isInreg(p)==0) {
			System.out.println("点在圆上");
		}else if(ad.isInreg(p)==1) {
			System.out.println("点在圆内");
		}else {
			System.out.println("点在圆外");
		}
		System.out.println("=======================");
//		2.写一个创建数组的函数
		for(int i:createArr(10)) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======================");
//		3.写一个打印数组的函数
		int[] arr2= {2,3,4,5,6,6};
		printA(arr2);
		System.out.println();
		System.out.println("=======================");
//		4.写一个可以排序数组的函数
		int[] arr3=createArr(10);//创建数组
		printA(arr3);//打印创建的数组
		System.out.println();
		sortArr(arr3);//排序
		printA(arr3);//打印排序后的数组
	}
	//排序数组函数
	static int[] sortArr(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {//从小到大
					int temp=arr[j];//要先被覆盖的存储到临时变量
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		return arr;//将交换过的数组返回出去
	}
	//打印数组函数
	static void printA(int[] arr) {
		for(int i :arr) {
			System.out.print(i+" ");
		}
		
	}
	static int[] createArr(int n) {//创建函数并赋值
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		return arr;
	}
	
	//方法重载
	static int add(int a,int b) {
		return a+b;
	}
	static int add(double a,int b) {
		return (int)a+b;
	}
	static int add(double a,double b) {
		return (int)a+(int)b;
	}
	static int add(int a,double b) {
		return a+(int)b;
	}
	static void printArr(int[] arr) {//打印数组函数
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	static int getMax(int[] arr) {//获取最大值
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	static int getMin(int[] arr) {//获取最小值
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}


}
