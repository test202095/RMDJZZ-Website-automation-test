package ��һ��;

import java.util.Scanner;

public class �����ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//һ.����Ĵ�����дһ��
		/*����
		 //int a=121;
		 //int a1=12,a2=13,a3=14;
		 */
		   /*//��������
		     //����  byte
		       byte a=12;
		     //������ short
		       short a1=12131;
		     //����   int
		       int a2=12131;
		     //������ long
		       long a3=11324;
		     // ������ ������ float
		       float a4=20.232f;
		    // ������ ˫���� double
		       double a5=20.324;
		     // �ַ��� char 
		       char a6='h';
		       //������  boolean
		       boolean a7=true;
		       boolean a8=false;
		       //�ַ��� String
		       String a9="sbkcksbk";
		       System.out.println(a1);
		       System.out.println(a2);
		       System.out.println(a3);
		       System.out.println(a4);
		       System.out.println(a5);
		       System.out.println(a6);
		       System.out.println(a7);
		       System.out.println(a8);
		       System.out.println(a9);
		      
		      //����ת��
              //1.�Զ�����ת��(��ʽת��)
              //�Ӵ洢��ΧС�����͵��洢��Χ�������.
              //byte ->short(char)->int->long->float->double
         	byte a1=10;
		     a4=a3;
		    SystemSystem.out.println(a1);
		    short a2=a1;
		    System.out.println(a2);
		    int a3=a2;
		    System.out.println(a3);
		    float .out.println(a4);
		    double a5=a4;
            System.out.println("--------------");
            //2.ǿ������ת��(��ʾת��)
             //�ǴӴ洢��Χ������͵��洢��ΧС������.
           //double��float��long��int��short(char)��byte
	          double b=10.222;
	         System.out.println(b);
	         float b1=(float)b;
	          System.out.println(b1);
	           int b2=(int)b1;
	            System.out.println(b2);
	           short b3=(short)b2;
	          System.out.println(b3);
	          byte b4=(byte)b3;
	           System.out.println(b4);
	           
		    //�����
		     int a=10,b=20;
		     int a1=a+b;
		     int a2=a-b;
		     int a3=a*b;
		     int a4=a/b;
		     int a5=a%b;
		     System.out.println(a1);
		     System.out.println(a2);
		     System.out.println(a3);
		     System.out.println(a4);
		     System.out.println(a5);
		     //��ֵ�����
		     a1+=2;
		     a2-=2;
		     a3*=2;
		     a4/=2;
		     a5%=2;
		     b++;//����
		     a--;//�Լ�
		     System.out.println(a1);
		     System.out.println(a2);
		     System.out.println(a3);
		     System.out.println(a4);
		     System.out.println(a5);
		     System.out.println(a);
		     System.out.println(b);
		     //�Ƚ������
		     System.out.println(a<b);
		     System.out.println(a<=b);
		     System.out.println(a>b);
		     System.out.println(a>=b);
		     System.out.println(a&b);
		     System.out.println(a|b);
		     System.out.println(a^b);
		      
		    //�ӿ���̨��ȡ����
		 Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		System.out.println(b);	
		float b1=a.nextFloat();
		System.out.println(b1);
		 String b2=a.next();
		 System.out.println(b2);
		 String b3=a.nextLine();
		 System.out.println(b3);
		 
		//��Ŀ�����
		Scanner a=new Scanner(System.in);
		int a1=a.nextInt();
		int a2=a.nextInt();
		int a3=a.nextInt();
		int b=a1>a2?(a1>a3?a1:a3):(a2>a3?a2:a3);
		System.out.println(b);
	
		//
		 if(a1>a2){System.out.println(a1);}else{System.out.println(a2);} 
		
		
		
	    // ����:�����·ݣ������Ӧ�ļ��ڣ�1~3--����,4~6--�ļ�,7~9--�＾,10~12--����
		Scanner a=new Scanner(System.in);
		System.out.println("�������·�");
		int b=a.nextInt();
		if(b<=3 && b>=1 ){System.out.println("����");}else if(b<=6 && b>=4 ){System.out.println("����");}else if(b<=9 && b>=7 ){System.out.println("����");}else if(b<=12 && b>=10 ){System.out.println("����");}else{System.out.println("�����·ݴ���");}
		
		//�����������ͱ���,Ȼ��ӿ���̨��ȡһ���ַ�,�����+��ô���������������,����ʲô���žͶ�Ӧ����ʲô���ӿ���̨��ȡһ���ַ���char d=scan.next().charAt(0);
		int a=10,b=20;
		Scanner a2=new Scanner(System.in);
		char a1=a2.next().charAt(0);
		switch (a1) {
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
		case '%':
			System.out.println(a%b);
			break;	
		default:
			System.out.println("�������");
			break;
		}
		 */
		//��.������װeclipse
		//��.д��main��������Ҫ��
		   /*public  ��ʾ����Ȩ��
		     static  ��ʾ��̬���Σ�û�д�������Ҳ�ܵ������еľ�̬����
		     main    main�����ǳ�������
		     String  �����������ַ���
		    * */
 		//��.��д��int,float,double,char,long�ֱ�ռ�ڴ�Ĵ�С
		   /*int   �ĸ��ֽ�
		     float  �ĸ��ֽ�
		     double  �˸��ֽ�
		     char    �����ֽ�
		     long   �˸��ֽ�
		    */
		//��.ǿ������ת����ôת��
		   // ��������   ����=(��������)����
		//��.�����:
		//������,���趨һ������,Ȼ��ӿ���̨����һ������,������趨�����ִ�,��ʾ����������ִ���,������������С��,��ʾ�����������С��,���������ȷ,��ʾ�����������ȷ
       Scanner a=new Scanner(System.in);
       int b=a.nextInt();
       int c=8;
       if(b>c){System.out.println("��������ִ���");}else if(b<c){System.out.println("���������С��");}else{System.out.println("�����������ȷ");}
	}

}
