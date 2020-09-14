package 第一天;

import java.util.Scanner;

public class 沈浩作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//一.今天的代码重写一遍
		/*变量
		 //int a=121;
		 //int a1=12,a2=13,a3=14;
		 */
		   /*//数据类型
		     //整型  byte
		       byte a=12;
		     //短整型 short
		       short a1=12131;
		     //整型   int
		       int a2=12131;
		     //长整型 long
		       long a3=11324;
		     // 浮点型 单精度 float
		       float a4=20.232f;
		    // 浮点型 双精度 double
		       double a5=20.324;
		     // 字符型 char 
		       char a6='h';
		       //布尔型  boolean
		       boolean a7=true;
		       boolean a8=false;
		       //字符串 String
		       String a9="sbkcksbk";
		       System.out.println(a1);
		       System.out.println(a2);
		       System.out.println(a3);
		       System.out.println(a4);
		       System.out.println(a5);
		       System.out.println(a6);
		       System.out.println(a7);
		       System.out.println(a8);
		       System.out.println(a9);
		      
		      //数据转换
              //1.自动类型转换(隐式转换)
              //从存储范围小的类型到存储范围大的类型.
              //byte ->short(char)->int->long->float->double
         	byte a1=10;
		     a4=a3;
		    SystemSystem.out.println(a1);
		    short a2=a1;
		    System.out.println(a2);
		    int a3=a2;
		    System.out.println(a3);
		    float .out.println(a4);
		    double a5=a4;
            System.out.println("--------------");
            //2.强制类型转换(显示转换)
             //是从存储范围大的类型到存储范围小的类型.
           //double→float→long→int→short(char)→byte
	          double b=10.222;
	         System.out.println(b);
	         float b1=(float)b;
	          System.out.println(b1);
	           int b2=(int)b1;
	            System.out.println(b2);
	           short b3=(short)b2;
	          System.out.println(b3);
	          byte b4=(byte)b3;
	           System.out.println(b4);
	           
		    //运算符
		     int a=10,b=20;
		     int a1=a+b;
		     int a2=a-b;
		     int a3=a*b;
		     int a4=a/b;
		     int a5=a%b;
		     System.out.println(a1);
		     System.out.println(a2);
		     System.out.println(a3);
		     System.out.println(a4);
		     System.out.println(a5);
		     //赋值运算符
		     a1+=2;
		     a2-=2;
		     a3*=2;
		     a4/=2;
		     a5%=2;
		     b++;//自增
		     a--;//自减
		     System.out.println(a1);
		     System.out.println(a2);
		     System.out.println(a3);
		     System.out.println(a4);
		     System.out.println(a5);
		     System.out.println(a);
		     System.out.println(b);
		     //比较运算符
		     System.out.println(a<b);
		     System.out.println(a<=b);
		     System.out.println(a>b);
		     System.out.println(a>=b);
		     System.out.println(a&b);
		     System.out.println(a|b);
		     System.out.println(a^b);
		      
		    //从控制台获取数据
		 Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		System.out.println(b);	
		float b1=a.nextFloat();
		System.out.println(b1);
		 String b2=a.next();
		 System.out.println(b2);
		 String b3=a.nextLine();
		 System.out.println(b3);
		 
		//三目运算符
		Scanner a=new Scanner(System.in);
		int a1=a.nextInt();
		int a2=a.nextInt();
		int a3=a.nextInt();
		int b=a1>a2?(a1>a3?a1:a3):(a2>a3?a2:a3);
		System.out.println(b);
	
		//
		 if(a1>a2){System.out.println(a1);}else{System.out.println(a2);} 
		
		
		
	    // 案例:输入月份，输出对应的季节：1~3--春季,4~6--夏季,7~9--秋季,10~12--冬季
		Scanner a=new Scanner(System.in);
		System.out.println("请输入月份");
		int b=a.nextInt();
		if(b<=3 && b>=1 ){System.out.println("春天");}else if(b<=6 && b>=4 ){System.out.println("夏天");}else if(b<=9 && b>=7 ){System.out.println("秋天");}else if(b<=12 && b>=10 ){System.out.println("冬天");}else{System.out.println("输入月份错误");}
		
		//定义两个整型变量,然后从控制台获取一个字符,如果是+那么这两个变量就相加,输入什么符号就对应运算什么，从控制台获取一个字符，char d=scan.next().charAt(0);
		int a=10,b=20;
		Scanner a2=new Scanner(System.in);
		char a1=a2.next().charAt(0);
		switch (a1) {
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
		case '%':
			System.out.println(a%b);
			break;	
		default:
			System.out.println("输入错误");
			break;
		}
		 */
		//二.独立安装eclipse
		//三.写出main函数的四要素
		   /*public  表示公有权限
		     static  表示静态修饰，没有创建对象也能调用类中的静态方法
		     main    main函数是程序的入口
		     String  数据类型是字符串
		    * */
 		//四.请写出int,float,double,char,long分别占内存的大小
		   /*int   四个字节
		     float  四个字节
		     double  八个字节
		     char    两个字节
		     long   八个字节
		    */
		//五.强制类型转换怎么转换
		   // 数据类型   变量=(数据类型)数据
		//六.编程题:
		//猜数字,先设定一个数字,然后从控制台输入一个数字,如果比设定的数字大,提示你输入的数字大了,如果输入的数字小了,显示你输入的数字小了,如果输入正确,显示输入的数字正确
       Scanner a=new Scanner(System.in);
       int b=a.nextInt();
       int c=8;
       if(b>c){System.out.println("输入的数字大了");}else if(b<c){System.out.println("输入的数字小了");}else{System.out.println("输入的数字正确");}
	}

}
