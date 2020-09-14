package maker;
import java.awt.Window.Type;
import java.util.Scanner;
public class A10ifleseif {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		案例:输入月份，输出对应的季节：
//		1~3--春季
//		4~6--夏季
//		7~9--秋季
//		10~12--冬季
		Scanner scan=new Scanner(System.in);
		System.out.println("输入数据：");
		int a=scan.nextInt();
		
		if (a>=1 && a<=3) {
			System.out.println("春季");
		}else if(a>=4 && a<=6){
			System.out.println("夏季");
		}
		else if (a>=7 &&a<=9) {
			System.out.println("秋季");
		}
		else if(a>=10 &&a<=12) {
			System.out.println("冬季");
		}
		else {
			System.out.println("输入有误");
		}
	}

}
