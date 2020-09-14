package maker;
import java.util.Scanner;
public class A11switch {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		System.out.println("输入一个字符：");
		
		
//		案例:定义两个整型变量,然后从控制台获取一个字符,如果是+那么这两个变量就相加,输入什么符号就对应运算什么
//		//从控制台获取一个字符
//		char d=scan.next().charAt(0);
		char d=scan.next().charAt(0);
		switch (d) {
		case '+':
			System.out.println(10+20);
			break;
		case '-':
			System.out.println(10-20);
			break;
		case '*':
			System.out.println(10*20);
			break;
		case '/':
			System.out.println(10/20);
			break;

		default:
			System.out.println("输入有误");
			break;
		}
		
	}

}
