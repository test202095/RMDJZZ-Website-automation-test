package test;
//数组引入包
import java.util.function.IntConsumer;
//控制台输入要引入包
import java.util.Scanner;
//随机数引入包
import java.util.Random;

public class ZY0915曾小琴 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		今天的代码敲一遍
//案例:小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
//她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
			int day=1;
			double s=2.5; //存钱的数量
			while (s<=100) {
				if (day%5==0) {
					s-=6;
				}
				day++;
				s+=2.5;	
			}
			System.out.println(day);
		
//案例:输出1-100的单数
			int a=1;
			do {
				if (a%2==1) { 
					System.out.println(a);
				}
				a++;
			} while (a<=100);
			
//案例:使用while嵌套循环打印如下图形
//*
//* *
//* * *
//* * * *
//* * * * *

				int i=0;
				while (i<5) {
					int j=0;
					while (j<=i) {
						System.out.print("* ");
						j++;
					}
					i++;
					System.out.println("");
				}
					
//案例:输入一个整数,然后打印0到这个整数,最后打印0到这个整数之和

					/*System.out.println("请输入一个整数");	
					int ii=a.nextInt();
					int s=0;
					for (int i=0; i<=ii; i++) {
						System.out.println(i);
						s+=i;
					}
					System.out.println(s);*/

//案例:n的阶乘，从外部键盘输入一个数字n
//5
//5*4*3*2*1

				/*System.out.println("请输入一个整数");
				int a1=a.nextInt(); //5
				int s1=1;
				for (int i=1;i<=a1;i++) {//i<=5
					s1*=i; //s1=s1*i
				}
				System.out.println(s1);*/
//案例:九九乘法口诀表
				/*for(int i=0;i<=9;i++) {
					for(int j=1;j<=i;j++) {
						int s=i*j;
						System.out.print(j+"*"+i+"="+s+"\t");
					}
					System.out.println();//换行
				}*/					
//
				案例:定义一个整型数数组,然后赋予数据,然后逆序数组,并打印
				int[] myarr=new int[5];
				for (int i=0; i<5;i++) {
					myarr[i]=(int)(Math.random()*100);
				}
				for (int i:myarr) {
					System.out.println(i);;	
				}
				for (int i=0; i < myarr.length/2; i++) {
					int j =myarr[i];
					myarr[i]=myarr[myarr.length-1-i];
					myarr[myarr.length-1-i]=j;
				}
				System.out.println();
				for(int i:myarr) {
					System.out.print(i+" ");
				}

		案例:求一维数组的最值
				int[] arr=new int[5]; //定义一个长度为5的arr数组
				for (int i=0; i<5;i++) {
					arr[i]=(int)(Math.random()*100); //i为arr的下标
				}
				for (int j:arr) {
					System.out.println(j+" ");
				}
				System.out.println();
				int max=0;
				max=arr[0];//假设数组的第一个数是最大值
				for(int i=1;i<arr.length;i++) {
					if(max<arr[i]) {//如果进入if,表示数组里有比max更大的数
						max=arr[i];
					}
				}
				System.out.println("max="+max);

				案例:从控制台输入字符串,然后把字符串中的字符存储到字符数组中,然后打印出来
//				1.str.charAt(i);可以返回字符串中的字符,str是字符串
//				2.str.length();可以返回字符串的长度,str是字符串
				
				Scanner a=new Scanner(System.in);
				System.out.println("请输入字符串");
				String s=a.next();
				
				char[] c=new char[s.length()];
				for(int i=0;i<s.length();i++) {  
					c[i]=s.charAt(i);
				}
				System.out.println(c);

			
//		1．	While（）里可以填数字吗？ 不能 要填布尔类型
		
//		2．	外循环2次内循环4次，那么一共循环了多少次 ?  8次
		
//		3．	Break可以一次跳出2个循环吗？  可以,break可以跳出循环到标签位置
		
//		4．	数组是什么，他在作用是什么？ 
		//数组是Java语言内置的数据类型，是线性的序列，长度固定，容量不变，会有边界检查。
		//可以一次性传递多个数据,数组是用于储存多个相同类型数据的集合.
		
//		5．	请定义出一个可以储存8个整型的数组/定义数组的格式:数据类型[] 数组名=new 数据类型[长度];int[] s=new int[8];
	
//		6．	编程题：数组元素查找(查找指定元素第一次在数组中出现的索引)
		

		
		System.out.println("-------");
	}
}
