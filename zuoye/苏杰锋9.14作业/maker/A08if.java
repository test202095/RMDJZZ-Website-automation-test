package maker;
import java.util.Scanner;
public class A08if {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		
//		案例:从控制台输入一个数据,用变量a接收,如这个变量大于10,就打印"输入的数据大于10"
		int a=scan.nextInt();
		if (a>10){
			System.out.println("输入的数据大于10");
		}
	}

}
