package maker;
import java.util.Scanner;
public class A12��ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan=new Scanner(System.in);
		System.out.println("����һ������");
		int a1=scan.nextInt();//�ӿ���̨��ȡ����
		
	       int a2=10;//�趨������
	       if(a1>a2){
	    	   System.out.println("��������ִ���");
	       }else if(a1<a2){
	    	   System.out.println("���������С��");
	       }else  if(a1==a2){
	    	   System.out.println("�����������ȷ");
	       }else {
	    	   System.out.println("��������");
	       }
	}

}
