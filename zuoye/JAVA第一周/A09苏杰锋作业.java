package day02;
import java.util.Scanner;
import java.util.Random;
public class A09作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
/*
		
		//		#案例:小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		double m=0;
		int d=0;
		while(m<=100) {
			m+=2.5;
			d+=1;
			if (d%5==0) {
				m-=6;
			}
			
		}System.out.println(d);
		
//		案例:输出1-100的单数
		int a=0;
		do {
			if (a%2==1) {
				System.out.println(a);
			}
			a++;
		}while(a<=100);
		
//		案例:使用while嵌套循环打印如下图形
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		int i=0;
		while (i<5) {
			int j=0;
			while(j<=i){
				
				System.out.print("* ");
				j++;
		}
		i++;
		System.out.println();
		}
		
//案例:输入一个整数,然后打印0到这个整数,最后打印0到这个整数之和
		Scanner scan=new Scanner(System.in);
		System.out.print("输入一个数字：");
		int a=scan.nextInt();
		int s=0;
		for (int i=0;i<=a;i++) {
			System.out.println(i);
			s=s+i;
		}
		System.out.println(s);
		
		
//案例:n的阶乘，从外部键盘输入一个数字n
		int a1=scanner.nextInt();
		int s1=1;
		for(int i=1;i<=a1;i++) {
			s1*=i;
		}
		System.out.println(s1);
		
//		案例:九九乘法口诀表
		for(int i=1;i<10;i++) {//i==3
			for(int j=1;j<=i;j++) {//j==3
				int n=i*j;//n==4
				System.out.print(j+"*"+i+"="+n+"\t");
			}
			System.out.println();
		}
		
	
//利用标签可以跳出两个循环
		aa:for (int i=1;i<3;i++) {
			for(int j=1;j<3;j++) {
				if(j%2==0) {
					break aa;
				}
				System.out.println("i="+i);
				System.out.println("j="+j);
			}
			
		}
	
		
		
//随机数
		for (int i=0;i<10;i++) {
			int a=(int)(Math.random()*100);
			System.out.println(a);
		}
		
		Random r=new Random();
		for(int i=0;i<10;i++){
		    int a=r.nextInt(100);
		    System.out.print(a+" ");
		    
		}
		//math数学类
		System.out.println(Math.pow(3, 2));//平方
		System.out.println(Math.sqrt(9));//开根号
		System.out.println(Math.abs(-3));//绝对值
		
		
//数组		
//		案例:定义一个整型数数组,然后赋予数据,然后逆序打印
		//1.用随机数给数组赋值
		//2.遍历数组
		//3.逆序
		//	1.{1,2,3,4}
			//arr[0]=1;
		//	arr[3]=4;
		//4.遍历数组	
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
		    arr[i]=(int)(Math.random()*100);
		    }
		    for(int i:arr){//打印数组
		        System.out.print(i+" ");
		    }
		    for(int i=0;i<arr.length/2;i++) {
		       int tmp=arr[i];
		       arr[i]=arr[arr.length-1-i];
					arr[arr.length-1-i]=tmp;
				}
				System.out.println();
				for(int i:arr) {
					System.out.print(i+" ");
		    }
		
//案例:求一维数组的最值
				int[] arr2=new int[5];
						for(int i=0;i<5;i++) {
							arr2[i]=(int)(Math.random()*100);
						}
						for(int i:arr2) {
							System.out.print(i+" ");
						}
						System.out.println();
						int max=0;
						max=arr2[0];//假设数组的第一个数是最大值
						for(int i=1;i<arr2.length;i++) {
							if(max<arr2[i]) {//如果进入if,表示数组里有比max更大的数
								max=arr2[i];
							}
						}
						
						System.out.println("max="+max);
		
		
						System.out.println(arr);
						
						
						
//案例:从控制台输入字符串,然后把字符串中的字符存储到字符数组中,然后打印出来
//1.str.charAt(i);可以返回字符串中的字符,str是字符串
//2.str.length();可以返回字符串的长度,str是字符串
                    Scanner scanner=new Scanner(System.in);
					//从控制台获取字符串
                    System.out.println("输入字符串：");
					String str=scanner.next();
					//定义字符数组
					char[] arr=new char[str.length()];
					//给数组赋值
					for(int i=0;i<arr.length;i++) {//abcd
       				arr[i]=str.charAt(i);
					}
					//注意:数组在等号的左边表示等待接收数值
					arr[0]='a';
					//数组在等号的右边表示从数组取值
					char c=arr[0];
								
								
					System.out.println(arr);	
*/	
		
		
//6．编程题：数组元素查找(查找指定元素第一次在数组中出现的索引)
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
		    arr[i]=(int)(Math.random()*10);
		    }
		    //打印数组
		    for(int i:arr){
		        System.out.print(i+" ");
		    }
		
		
		
		
		
		
	}

}
