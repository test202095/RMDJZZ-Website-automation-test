package day01lx;

import java.util.Scanner;

public class Liaoyaxin0914zuoye{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		����:����̨��ӡ�����Լ�������
//		System.out.println("������");
		Scanner scan=new Scanner(System.in);
//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		/*
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int max=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(max);
		*/
		
//		����:�ӿ���̨����һ������,�ñ���a����,�������������10,�ʹ�ӡ"��������ݴ���10"
		/*
		int a=scan.nextInt();
		if(a>10) {
			System.out.println("��������ݴ���10");
		}*/
//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		/*
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("���ֵΪ��"+a);
			}
			else {//a<c
				System.out.println("���ֵΪ��"+c);
			}
		}
		else {//a<b
			if(b>c) {
				System.out.println("���ֵΪ��"+b);
			}
			else {//b<c
				System.out.println("���ֵΪ��"+c);
			}
		}*/
		
		/*����:�����·ݣ������Ӧ�ļ��ڣ�
		1~3--����
		4~6--�ļ�
		7~9--�＾
		10~12--����
		
		*/
		/*
		System.out.println("�������·�:");
		int a=scan.nextInt();
		if(a>0 && a<4) {
			System.out.println("����");
		}else if(a>=4 && a<=6) {
			System.out.println("�ļ�");
		}else if(a>=7 && a<=9) {
			System.out.println("�＾");
		}else if(a>=10 && a<=12) {
			System.out.println("����");
		}else {
			System.out.println("��������·ݲ���ȷ");
		}*/
		/*
		  ����:�����������ͱ���,Ȼ��ӿ���̨��ȡһ���ַ�,�����+��ô���������������,����ʲô���žͶ�Ӧ����ʲô
		�ӿ���̨��ȡһ���ַ�
		char d=scan.next().charAt(0);
		 */
		/*
		int a=10;
		int b=5;
		System.out.println("�����룺");
		char str=scan.next().charAt(0);//��ȡ��һ���ַ�
		switch(str) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("���������������Ϸ���");
			break;
		}*/
		/*
		 //����
		int a;//�������
		a=10;//��ֵ
		int b=20;//��ʼ��
		//ͬʱ����������
		int a1,a2,a3;
		a1=10;
		a2=20;
		a3=30;
		//��������������ʼ��
		int b1=10,b2=20,b3=30;
		//println printf ��print
		System.out.printf("a1=%d "+"a2=%d "+"a3=%d\n", a1,a2,a3);//�����У�����Ҫ��\n
		System.out.println("b1="+b1+" b2="+b2+" b3="+b3);//����
		*/
		/*
		//��������
		//��ֵ��
		//byte ռ1���ֽ�
		byte a=20;
//		byte a1=129;//����������С�ռ�
		//short ռ2���ֽ�
		short b=5000;
//		short b1=40000;//����������С�ռ�
		//int ռ4���ֽڣ����ã�
		int c=10000;
		//long ռ8���ֽ�
		long d=1000000000;
		//������  ������ ռ4���ֽ�
		float f=22.2222f;
		//������ ˫���� ռ8���ֽڣ����ã�
		double d1=22.22222222;
		//�ַ���
		//char  ռ�����ֽ�(����)
		char str='a';
		//������(����)
		boolean b11=true;
		boolean b22=false;
//		boolean b33=1;//���ܸ�ֵ���ָ�boolean����
		//�ַ��� �ַ�������(����)
		String str1="hello";
		*/
		/*
//		����ת��
		//��ʽת�� ��С�ռ䵽��ռ�
		byte a=10;
		short b=a;
		int c=b;
		float f=c;
		double d=f;
		//��ʾת�����Ӵ�С  ǿ��ת��
		double d1=20.222222;
		float f1=(float)d1;
		int c1=(int)f1;
		short b1=(short)d1;
		byte a1=(byte)b1;
		*/
		//���Ե÷ֵȼ��ж�
		/*
		System.out.println("�����뿼�Գɼ�");
		int score=scan.nextInt();
		if(score<0||score>100) {
			System.out.println("����ĳɼ����Ϸ�");
		}
		else if(score==100) {
			System.out.println("����");
		}else if(score>80 && score<=99) {
			System.out.println("����");
		}
		else if(score>=60 && score<=80) {
			System.out.println("����");
		}else  {
			System.out.println("������");
		}*/
//		��.д��main��������Ҫ��
//		public ����Ȩ��
//		static ��̬���Σ�û�ж���Ҳ���Ե���
//		void Ĭ��û�з���ֵ
//		String[]  arg �β�
//		��.��д��int,float,double,char,long�ֱ�ռ�ڴ�Ĵ�С
//		int  ռ��4���ֽ�
//		float ռ��4���ֽ�
//		double ռ��8���ֽ�
//		char ռ��2���ֽ�
//		long ռ��8���ֽ�
//		��.ǿ������ת����ôת��
//		��תС
//		long a1=1000;
//		int a=(int)a1;
		/*
		 * ��.�����:
                 ������,���趨һ������,Ȼ��ӿ���̨����һ������,������趨�����ִ�,
                  ��ʾ����������ִ���,������������С��,��ʾ�����������С��,���������ȷ,��ʾ�����������ȷ
		 */
		int num=(int)(Math.random()*90);//����0��100�������,����Ϊ��Ҫ�µ�����
//		System.out.println(num);//�����������
		int ina=scan.nextInt();//�û�����µ�����
		if(ina>num) {
			System.out.println("����������ִ���");
		}else if(ina<num) {
			System.out.println("�����������С��");
		}else if(ina==num){
			System.out.println("�����������ȷ");
		}else {
			System.out.println("����������");
		}
	
		
	}

}
