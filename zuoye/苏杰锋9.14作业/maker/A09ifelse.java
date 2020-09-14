package maker;
import java.util.Scanner;
public class A09ifelse {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		案例:从控制台输入三次整数,然后打印出最大的数值
		Scanner scan=new Scanner(System.in);
		System.out.println("输入第一个数据：");
		int a=scan.nextInt();
		System.out.println("输入第二个数据：");
		int a2=scan.nextInt();
		System.out.println("输入第三个数据：");
		int a3=scan.nextInt();
		if (a>a2) {
			if (a>a2) {
				System.out.println("最大值为："+a);
			}else {
				System.out.println("最大值为："+a2);}
		}else {
			if (a2>a3) {
				System.out.println("最大值为："+a2);
			}
			else {
				System.out.println("最大值为："+a3);
			}
		}
			
		}
		
	}


