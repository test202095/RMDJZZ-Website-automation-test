package maker;
//引入控制台输入的包
import java.util.Scanner;

public class A06从控制台获取数据 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//生成一个对象
		Scanner scan=new Scanner(System.in);
		
		int i=scan.nextInt();
		System.out.println(i);
		
		float f=scan.nextFloat();
		System.out.println(f);
		
		String string=scan.next();
		System.out.println(string);
		
		System.out.println("函数结束");
	}

}
