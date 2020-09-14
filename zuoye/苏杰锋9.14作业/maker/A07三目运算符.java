package maker;
import java.util.Scanner;
public class A07三目运算符 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int a=10;
//		int b=20;
//		int c=a>b?a:b;
//		System.out.println(c);
		
//		案例:从控制台输入三次整数,然后打印出最大的数值
		Scanner scan=new Scanner(System.in);
		
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		int i3=scan.nextInt();
		int i=i1>i2?i1:i2;
		int i4=i>i3?i:i3;
		System.out.println(i4);
		
	}

}
