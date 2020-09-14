package maker;
import java.util.Scanner;
public class A12作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		System.out.println("输入一个数：");
		int a1=scan.nextInt();//从控制台获取数字
		
	       int a2=10;//设定的数字
	       if(a1>a2){
	    	   System.out.println("输入的数字大了");
	       }else if(a1<a2){
	    	   System.out.println("输入的数字小了");
	       }else  if(a1==a2){
	    	   System.out.println("输入的数字正确");
	       }else {
	    	   System.out.println("输入有误");
	       }
	}

}
