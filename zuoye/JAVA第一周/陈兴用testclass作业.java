package testbag;
import java.util.Scanner;
public class A09testclass��ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan=new Scanner(System.in);
		/*
		  ��.д��main��������Ҫ��
��.��д�� int,float,double,char,long�ֱ�ռ�ڴ�Ĵ�С
��.ǿ������ת����ôת��
��.�����:
������,���趨һ������,Ȼ��ӿ���̨����һ������,������趨�����ִ�,
��ʾ����������ִ���,������������С��,��ʾ�����������С��,
���������ȷ,��ʾ�����������ȷ
		 */
		System.out.println("������һ�����֣�");
		int n=scan.nextInt();//���ն�����һ������
		int m=20;
		if (n>m) {
			System.out.println("��������ִ���");
		}else if(n<m) {
			System.out.println("���������С��");
		}else {
			System.out.println("�����������ȷ");
		}
		
		
	}

}
