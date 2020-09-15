package testbag01;
import java.util.Scanner;
import java.util.Random;
public class A09test陈兴用作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		1．While（）里可以填数字吗？
//		答：不可以
		
//		2．外循环2次内循环4次，那么一共循环了多少次
//		答：2次
		
//		3．Break可以一次跳出2个循环吗？
//		答：可以
		
//		4．数组是什么，他在作用是什么？
//		答：数组是java语言内置的数据类型，只能存放同种类型数据
		
//		5．请定义出一个可以储存8个整型的数组
//		答：
//		int[] list=new int[8];
//		for (int i = 0; i <= 8; i++) {
//			list[i]=i;
//			System.out.println(i);
//		}
////		
		
//		6．编程题：数组元素查找(查找指定元素第一次在数组中出现的索引)
		 //定义1个数组
		Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的元素:");
        int n=sc.nextInt();
        int[] arr= {5,7,3,2,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
            System.out.println(i);    
            }
        }
      
        
		
		Scanner scan=new Scanner(System.in);
//		案例:输出1-100的单数
		for (int i=1; i<=100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
//		案例:小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
//		她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		int z=0;//天数
		double v=0;//当前钱数
		while (v<=100) {
			v=v+2.5;
			z++;
			if (z%5==0) {
				v=v-6;
			}
			
		}
		System.out.println(z);
		//		案例:输入一个整数,然后打印0到这个整数,最后打印0到这个整数之和
		int sum=0;
		System.out.println("请输入数字：");
		int a=scan.nextInt();
		for (int i = 0; i <=a; i++) {
			sum+=i;
		
		}
		System.out.println(sum);	
//		案例:n的阶乘，从外部键盘输入一个数字n
		int b=scan.nextInt();
		int hs=1;//需从1开始 不然0乘以任何数都是0
		for (int i = 1; i <=b; i++) {
			hs*=i;
			
		}
		System.out.println(hs);
//		案例:九九乘法口诀表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		//打印0-9的数字,不要打印出5来
		for (int i = 0; i <=9; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		//跳出双for循环
		aa:for (int i = 0; i <10; i++) {
			for (int j = 0; j <i; j++) {
				if (j%2==0) {
					break aa;
				}	
			}			
		}
//		案例:定义一个整型数数组,然后赋予数据,然后逆序打印
		//1.用随机数给数组赋值
		//2.遍历数组
		//3.逆序
		int[] set=new int[5];
		for (int i = 0; i <=5; i++) {
			int nn=(int)(Math.random()*100);
			set[i]=nn;
			System.out.print(set[i]+" ");
		}
		System.out.println();
		for (int i =set.length; i >0; i--) {//按照下标从后往前输出
			System.out.print(set[i-1]+" ");
			
		}
	  }

	}


