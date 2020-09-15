package liaoyaxin;

import java.util.Random;
import java.util.Scanner;

public class Liaoyaxin0915zuoye {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		案例:小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
//		她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		double m=0;//存款数
		int day=0;//天数
		while(m<100) {//不够100元继续存钱
			m+=2.5;//每天都存2.5元
			day+=1;//天数累增
			if(day%5==0) {//是存钱的第五天或者5的倍数就花6元钱
				m-=6;
			}
		}
		System.out.println(day);//打印存款到100元的总天数
		System.out.println("---------");
//		案例:输出1-100的单数
		int i=0;
		do {
			i++;
			if(i%2!=0) {//判断是否为奇数，为奇数则输出
				System.out.print(i+" ");
			}
		}while(i<100);
		System.out.println();
		System.out.println("---------");
//		案例:使用while嵌套循环打印如下图形
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		int a=1;
		while(a<=5) {//控制行数
			a++;
			int b=1;
			while(b<a) {//控制每行几列
				System.out.print("* ");
				b++;
			}
			System.out.println();
		}
		System.out.println("---------");
//		案例:输入一个整数,然后打印0到这个整数,最后打印0到这个整数之和
		System.out.println("请输入一个整数：");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;//整数总和
		for(int j=0;j<=n;j++) {
			sum+=j;//循环统计总和
			System.out.print(j+" ");//循环打每个整数
		}
		System.out.println();//换行
		System.out.println(sum);
		System.out.println("-----------");
//		案例:n的阶乘，从外部键盘输入一个数字n
//		5
//		5*4*3*2*1
		System.out.println("请输入一个数字：");
		int mm=scan.nextInt();
		int s=1;//统计n的阶乘
		for(int x=1;x<=mm;x++) {
			s*=x;//实现在范围内的每个数都相乘
		}
		System.out.println(s);
		System.out.println("-----------");
//		案例:九九乘法口诀表
		for(int y=1;y<=9;y++) {
			for(int z=1;z<=y;z++) {
				System.out.print(z+"*"+y+"="+z*y+"\t");//z*y=z*y
			}
			System.out.println();//换行 每行完成后换起另一行
		}
		System.out.println("-----------");
		cc:for(int i1=1;i1<3;i1++) {
			for(int j1=1;j1<3;j1++) {
				if(j1%2==0) {
//					break;//只会跳出内循环
					break cc;//跳出到指定标签cc
				}
				System.out.println("i1="+i1);
				System.out.println("j1="+j1);
			}
		}
		System.out.println("-----------");
		aa:for(int x1=1;x1<4;x1++) {
			for(int y1=1;y1<4;y1++) {
				if(y1%2==0) {
//					continue;//只跳出内循环，且只跳出本次循环，还会继续执行循环
					continue aa;//跳出到指定标签aa，注意只能跳到同意循环
				}
				System.out.println("x1="+x1);
				System.out.println("y1="+y1);
			}
			
		}
		System.out.println("-----------");
		//1.定义数组
		int[] arr=new int[4];
		//给数组赋值
//		arr[0]=1;
//		arr[1]=3;
//		arr[2]=5;
//		arr[3]=7;
		for(int ar=0;ar<4;ar++) {//给数组赋值
			arr[ar]=(ar+1)*10;
		}
		for(int b:arr) {//遍历打印数组中的值
			System.out.print(b+" ");
		}
		System.out.println();//换行
		//2.分步定义数组   
		int[] arr2=null;
		arr2=new int[3];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		for(int v=0;v<arr2.length;v++) {//用数组的长度来遍历打印
			System.out.print(arr2[v]+" ");
		}
		//3.初始化数组
		int[] arr3= {1,2,3,4,5,6,6};
		for(int v=0;v<arr3.length;v++) {//用数组的长度来遍历打印
			System.out.print(arr3[v]+" ");
		}
		System.out.println();//换行
		System.out.println("-----------");
		
//		案例:定义一个整型数数组,然后赋予数据,然后逆序数组,并打印
		int[] myarr=new int[5];
		for(int d=0;d<myarr.length;d++) {//给数组赋值
			myarr[d]=(int)(Math.random()*100);
			System.out.print(myarr[d]+" ");//循环打印存到数组中的值
		}
		for(int k=0;k<myarr.length/2;k++) {//交换，例把第一个和最后一个交换形成倒序  交换的次数是长度/2
			int temp=myarr[k];//临时变量存储要先被替换的值
			myarr[k]=myarr[myarr.length-1-k];
			myarr[myarr.length-1-k]=temp;
		}
		System.out.println();//换行
		for(int t:myarr) {
			System.out.print(t+" ");
		}
		System.out.println();//换行
		System.out.println("-----------");
//		案例:求一维数组的最值
		//定义数组
		int[] myarr1=null;
		myarr1=new int[5];
		Random r=new Random();
		int max=0;//定义最大值变量并初始化
		for(int p=0;p<myarr1.length;p++) {
			myarr1[p]=r.nextInt(100);//生成1~100以内的随机数并存储到myarr1数组中
			//遍历打印数组中的值
			System.out.print(myarr1[p]+" ");
			//判断数组中的值是否是最大值
			if(max<myarr1[p]) {
				max=myarr1[p];
			}
		}
		System.out.println();//换行
		System.out.println("最大值为："+max);
		System.out.println();//换行
		System.out.println("-----------");
//		案例:从控制台输入字符串,然后把字符串中的字符存储到字符数组中,然后打印出来
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str=scanner.next();//从控制台输入
		//定义字符数组
		char[] mystr=new char[str.length()];//数组长度为输入字符串长度
		for(int w=0;w<str.length();w++) {
			mystr[w]=str.charAt(w);//获取输入字符串的每个字符遍历赋值给字符数组
		}
		System.out.println(mystr);//打印字符数组
//		1．While（）里可以填数字吗？
		//不可以，while中只能是布尔表达式
//		2．外循环2次内循环4次，那么一共循环了多少次
		//8次
//		3．Break可以一次跳出2个循环吗？
		//break配合标签使用时可以跳出两个循环
//		4．数组是什么，他在作用是什么？
		//数组是java的一种内置数据类型，是线性序列，长度固定且容量不变，存储的是同一种数据类型的数据；
		//可以一次性传递多个值
//		5．请定义出一个可以储存8个整型的数组
		int[] myar=new int[8];
//		6．编程题：数组元素查找(查找指定元素第一次在数组中出现的索引)
		int[] ar=new int[10];
		int md=30;//目标元素
		int index=0;//第一次出现的索引
		for(int o=0;o<ar.length;o++) {
			ar[o]=(o+1)*10;
			if(ar[o]==md) {
				index=o;
			}
		}
		System.out.println(md+"第一次出现的索引为："+index);
		}

}
