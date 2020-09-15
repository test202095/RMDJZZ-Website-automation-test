package 第二天;
import java.util.Scanner;
import java.util.Random;
public class 沈浩0915作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//今天的代码敲一遍
		 //wkile循环
	/*while(true) {
		System.out.println("请输入数字");
		Scanner r=new Scanner(System.in);
        int a=r.nextInt();
		if(a>8){System.out.println("输入的数字大了");
		continue;} else if(a<8){System.out.println("输入的数字小了");continue;
		}else if(a==8){System.out.println("输入的数字正确");
		break;}
	}	
	//案例:小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
	//她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
	int a1=0;//天数
	double  a2=0.0;//钱数
	while(a2<100){
		a1=a1+1;
		a2+=2.5;
		if(a1%5==0){a2-=6;}
		}System.out.println("天数是"+a1);
	}*/
		//do与while结合
		//案例:输出1-100的单数
//		int a=0;
//		do {if(a%2==1){
//		System.out.println(a);
//		a++;}}while(a<100);
		/*案例:使用while嵌套循环打印如下图形
		*
		* *
		* * *
		* * * *
		* * * * *
//		int a1=1;
//		do {
//			int a2=0;
//			while(a2<a1) {
//				
//			System.out.print("*");
//			a2++;
//			}System.out.println("");a1++;
//			
//		}while(a1<=5);
		//for循环
		for(int i=0;i<100;i++) {if(i%2==1) { System.out.println(i);}}
		
		//案例:输入一个整数,然后打印0到这个整数,最后打印0到这个整数之和
		Scanner a=new Scanner(System.in);
		System.out.println("请输入数字:");
		int m=0;
		int b=a.nextInt();
		for(int i=0;i<=b;i++) {
			System.out.println(i+"");
			m+=i;
		}System.out.println("整数和是"+m);
		System.out.println("-----");

		//案例:n的阶乘，从外部键盘输入一个数字n
		System.out.println("请输入数字");
		Scanner b1=new Scanner(System.in);
		int b2=b1.nextInt();
		int m1=1;
		for(int j=1;j<=b2;j++) {System.out.println(j);
		m1*=j;}System.out.println("整数的积是"+m1);
		//案例:九九乘法口诀表
		for(int i=1;i<10;i++)
		{for(int j=1;j<=i;j++) {
			int n=i*j;
			System.out.print(j+"*"+i+"="+n+"\t");
		}System.out.println();
			
		}
		//跳出循环
		while(true) {
			System.out.println("请输入数字");
			Scanner r=new Scanner(System.in);
	        int a=r.nextInt();
			if(a>8){System.out.println("输入的数字大了");
			continue;} else if(a<8){System.out.println("输入的数字小了");continue;
			}else if(a==8){System.out.println("输入的数字正确");
			break;}}
			//随机数
		    //第一种方式
		     for(int i=0;i<20;i++){
		    	 int b=(int)(Math.random()*100);
		    	 System.out.println(b);}
		     Random a=new Random();
		     for(int a1=0;a1<10;a1++) {
		    	 int a2=a.nextInt(20);
		    	 System.out.println(a2);
		     }
		     //math数学类
		     System.out.println(Math.pow(2,3));//平方
		     System.out.println(Math.sqrt(100));//开根号
		     System.out.println(Math.abs(-199));//绝对值
		//案例:定义一个整型数数组,然后赋予数据,然后逆序数组,并打印
		
		int [] arr=new int[6];
		for(int i=0;i<5;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		for(int i:arr) {
			System.out.println(i+"");
		}
		for(int i=0;i<arr.lenght/2;i++) {
			int tmy=arr[i]；
			arr[i]=arr[arr.lenght-1-i];
			arr[arr.lenght-1-i]=tmp;
		}
		System.out.println();
		for(int i:arr) {
			System.out.println(i"=");
		}
		//案例:求一维数组的最值
		int[] arr=new int[5];
		for (int i=0;i<5;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		for(int i:arr) {
			System.out.println(i+"");
		}
		System.out.println();
		int max=0;
		max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {max=arr[i];}
//			}System.out.println("max="+max);*/
		//字符数组
		/*案例:从控制台输入字符串,然后把字符串中的字符存储到字符数组中,然后打印出来
		1.str.charAt(i);可以返回字符串中的字符,str是字符串
		2.str.length();可以返回字符串的长度,str是字符串
		Scanner a=new Scanner(System.in);
		System.out.println("请输入字符串");
		String str=a.next();
		char[] arr=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}System.out.println(arr);*/
		/*1．While（）里可以填数字吗？
		  不能
		2．外循环2次内循环4次，那么一共循环了多少次
		循环八次
		3．Break可以一次跳出2个循环吗？
		可以
		4．数组是什么，他在作用是什么？
		数组是用于储存多个相同类型数据的集合
		数组作用是可以一次性传递多个数据
		5．请定义出一个可以储存8个整型的数组
		int[] a=new int[8];
		6．编程题：数组元素查找(查找指定元素第一次在数组中出现的索引)*/
		int[] a1=new int[10];
		int a=3;
		int index=0;
		for(int i=0;i<a1.length;i++) {
			a1[i]=i+1;
			if(a1[i]==3) {
				index=i;
			}
			
		}System.out.println("a元素第一次在数组中出现的索引是"+index);
		
				
	}
	}


