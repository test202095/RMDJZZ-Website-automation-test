package testbag;
import java.util.Scanner;
public class A09testclass作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		/*
		  三.写出main函数的四要素
四.请写出 int,float,double,char,long分别占内存的大小
五.强制类型转换怎么转换
六.编程题:
猜数字,先设定一个数字,然后从控制台输入一个数字,如果比设定的数字大,
提示你输入的数字大了,如果输入的数字小了,显示你输入的数字小了,
如果输入正确,显示输入的数字正确
		 */
		System.out.println("请输入一个数字：");
		int n=scan.nextInt();//从终端输入一个数字
		int m=20;
		if (n>m) {
			System.out.println("输入的数字大了");
		}else if(n<m) {
			System.out.println("输入的数字小了");
		}else {
			System.out.println("输入的数字正确");
		}
		
		
	}

}
