package maker;
import java.util.Scanner;
public class A07��Ŀ����� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		int a=10;
//		int b=20;
//		int c=a>b?a:b;
//		System.out.println(c);
		
//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		Scanner scan=new Scanner(System.in);
		
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		int i3=scan.nextInt();
		int i=i1>i2?i1:i2;
		int i4=i>i3?i:i3;
		System.out.println(i4);
		
	}

}
