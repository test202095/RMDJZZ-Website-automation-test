package test;
//���������
import java.util.function.IntConsumer;
//����̨����Ҫ�����
import java.util.Scanner;
//����������
import java.util.Random;

public class ZY0915��С�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		����Ĵ�����һ��
//����:С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
//�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
			int day=1;
			double s=2.5; //��Ǯ������
			while (s<=100) {
				if (day%5==0) {
					s-=6;
				}
				day++;
				s+=2.5;	
			}
			System.out.println(day);
		
//����:���1-100�ĵ���
			int a=1;
			do {
				if (a%2==1) { 
					System.out.println(a);
				}
				a++;
			} while (a<=100);
			
//����:ʹ��whileǶ��ѭ����ӡ����ͼ��
//*
//* *
//* * *
//* * * *
//* * * * *

				int i=0;
				while (i<5) {
					int j=0;
					while (j<=i) {
						System.out.print("* ");
						j++;
					}
					i++;
					System.out.println("");
				}
					
//����:����һ������,Ȼ���ӡ0���������,����ӡ0���������֮��

					/*System.out.println("������һ������");	
					int ii=a.nextInt();
					int s=0;
					for (int i=0; i<=ii; i++) {
						System.out.println(i);
						s+=i;
					}
					System.out.println(s);*/

//����:n�Ľ׳ˣ����ⲿ��������һ������n
//5
//5*4*3*2*1

				/*System.out.println("������һ������");
				int a1=a.nextInt(); //5
				int s1=1;
				for (int i=1;i<=a1;i++) {//i<=5
					s1*=i; //s1=s1*i
				}
				System.out.println(s1);*/
//����:�žų˷��ھ���
				/*for(int i=0;i<=9;i++) {
					for(int j=1;j<=i;j++) {
						int s=i*j;
						System.out.print(j+"*"+i+"="+s+"\t");
					}
					System.out.println();//����
				}*/					
//
				����:����һ������������,Ȼ��������,Ȼ����������,����ӡ
				int[] myarr=new int[5];
				for (int i=0; i<5;i++) {
					myarr[i]=(int)(Math.random()*100);
				}
				for (int i:myarr) {
					System.out.println(i);;	
				}
				for (int i=0; i < myarr.length/2; i++) {
					int j =myarr[i];
					myarr[i]=myarr[myarr.length-1-i];
					myarr[myarr.length-1-i]=j;
				}
				System.out.println();
				for(int i:myarr) {
					System.out.print(i+" ");
				}

		����:��һά�������ֵ
				int[] arr=new int[5]; //����һ������Ϊ5��arr����
				for (int i=0; i<5;i++) {
					arr[i]=(int)(Math.random()*100); //iΪarr���±�
				}
				for (int j:arr) {
					System.out.println(j+" ");
				}
				System.out.println();
				int max=0;
				max=arr[0];//��������ĵ�һ���������ֵ
				for(int i=1;i<arr.length;i++) {
					if(max<arr[i]) {//�������if,��ʾ�������б�max�������
						max=arr[i];
					}
				}
				System.out.println("max="+max);

				����:�ӿ���̨�����ַ���,Ȼ����ַ����е��ַ��洢���ַ�������,Ȼ���ӡ����
//				1.str.charAt(i);���Է����ַ����е��ַ�,str���ַ���
//				2.str.length();���Է����ַ����ĳ���,str���ַ���
				
				Scanner a=new Scanner(System.in);
				System.out.println("�������ַ���");
				String s=a.next();
				
				char[] c=new char[s.length()];
				for(int i=0;i<s.length();i++) {  
					c[i]=s.charAt(i);
				}
				System.out.println(c);

			
//		1��	While����������������� ���� Ҫ�������
		
//		2��	��ѭ��2����ѭ��4�Σ���ôһ��ѭ���˶��ٴ� ?  8��
		
//		3��	Break����һ������2��ѭ����  ����,break��������ѭ������ǩλ��
		
//		4��	������ʲô������������ʲô�� 
		//������Java�������õ��������ͣ������Ե����У����ȹ̶����������䣬���б߽��顣
		//����һ���Դ��ݶ������,���������ڴ�������ͬ�������ݵļ���.
		
//		5��	�붨���һ�����Դ���8�����͵�����/��������ĸ�ʽ:��������[] ������=new ��������[����];int[] s=new int[8];
	
//		6��	����⣺����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		

		
		System.out.println("-------");
	}
}
