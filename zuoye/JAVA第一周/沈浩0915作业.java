package �ڶ���;
import java.util.Scanner;
import java.util.Random;
public class ���0915��ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����Ĵ�����һ��
		 //wkileѭ��
	/*while(true) {
		System.out.println("����������");
		Scanner r=new Scanner(System.in);
        int a=r.nextInt();
		if(a>8){System.out.println("��������ִ���");
		continue;} else if(a<8){System.out.println("���������С��");continue;
		}else if(a==8){System.out.println("�����������ȷ");
		break;}
	}	
	//����:С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
	//�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
	int a1=0;//����
	double  a2=0.0;//Ǯ��
	while(a2<100){
		a1=a1+1;
		a2+=2.5;
		if(a1%5==0){a2-=6;}
		}System.out.println("������"+a1);
	}*/
		//do��while���
		//����:���1-100�ĵ���
//		int a=0;
//		do {if(a%2==1){
//		System.out.println(a);
//		a++;}}while(a<100);
		/*����:ʹ��whileǶ��ѭ����ӡ����ͼ��
		*
		* *
		* * *
		* * * *
		* * * * *
//		int a1=1;
//		do {
//			int a2=0;
//			while(a2<a1) {
//				
//			System.out.print("*");
//			a2++;
//			}System.out.println("");a1++;
//			
//		}while(a1<=5);
		//forѭ��
		for(int i=0;i<100;i++) {if(i%2==1) { System.out.println(i);}}
		
		//����:����һ������,Ȼ���ӡ0���������,����ӡ0���������֮��
		Scanner a=new Scanner(System.in);
		System.out.println("����������:");
		int m=0;
		int b=a.nextInt();
		for(int i=0;i<=b;i++) {
			System.out.println(i+"");
			m+=i;
		}System.out.println("��������"+m);
		System.out.println("-----");

		//����:n�Ľ׳ˣ����ⲿ��������һ������n
		System.out.println("����������");
		Scanner b1=new Scanner(System.in);
		int b2=b1.nextInt();
		int m1=1;
		for(int j=1;j<=b2;j++) {System.out.println(j);
		m1*=j;}System.out.println("�����Ļ���"+m1);
		//����:�žų˷��ھ���
		for(int i=1;i<10;i++)
		{for(int j=1;j<=i;j++) {
			int n=i*j;
			System.out.print(j+"*"+i+"="+n+"\t");
		}System.out.println();
			
		}
		//����ѭ��
		while(true) {
			System.out.println("����������");
			Scanner r=new Scanner(System.in);
	        int a=r.nextInt();
			if(a>8){System.out.println("��������ִ���");
			continue;} else if(a<8){System.out.println("���������С��");continue;
			}else if(a==8){System.out.println("�����������ȷ");
			break;}}
			//�����
		    //��һ�ַ�ʽ
		     for(int i=0;i<20;i++){
		    	 int b=(int)(Math.random()*100);
		    	 System.out.println(b);}
		     Random a=new Random();
		     for(int a1=0;a1<10;a1++) {
		    	 int a2=a.nextInt(20);
		    	 System.out.println(a2);
		     }
		     //math��ѧ��
		     System.out.println(Math.pow(2,3));//ƽ��
		     System.out.println(Math.sqrt(100));//������
		     System.out.println(Math.abs(-199));//����ֵ
		//����:����һ������������,Ȼ��������,Ȼ����������,����ӡ
		
		int [] arr=new int[6];
		for(int i=0;i<5;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		for(int i:arr) {
			System.out.println(i+"");
		}
		for(int i=0;i<arr.lenght/2;i++) {
			int tmy=arr[i]��
			arr[i]=arr[arr.lenght-1-i];
			arr[arr.lenght-1-i]=tmp;
		}
		System.out.println();
		for(int i:arr) {
			System.out.println(i"=");
		}
		//����:��һά�������ֵ
		int[] arr=new int[5];
		for (int i=0;i<5;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		for(int i:arr) {
			System.out.println(i+"");
		}
		System.out.println();
		int max=0;
		max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {max=arr[i];}
//			}System.out.println("max="+max);*/
		//�ַ�����
		/*����:�ӿ���̨�����ַ���,Ȼ����ַ����е��ַ��洢���ַ�������,Ȼ���ӡ����
		1.str.charAt(i);���Է����ַ����е��ַ�,str���ַ���
		2.str.length();���Է����ַ����ĳ���,str���ַ���
		Scanner a=new Scanner(System.in);
		System.out.println("�������ַ���");
		String str=a.next();
		char[] arr=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}System.out.println(arr);*/
		/*1��While�����������������
		  ����
		2����ѭ��2����ѭ��4�Σ���ôһ��ѭ���˶��ٴ�
		ѭ���˴�
		3��Break����һ������2��ѭ����
		����
		4��������ʲô������������ʲô��
		���������ڴ�������ͬ�������ݵļ���
		���������ǿ���һ���Դ��ݶ������
		5���붨���һ�����Դ���8�����͵�����
		int[] a=new int[8];
		6������⣺����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)*/
		int[] a1=new int[10];
		int a=3;
		int index=0;
		for(int i=0;i<a1.length;i++) {
			a1[i]=i+1;
			if(a1[i]==3) {
				index=i;
			}
			
		}System.out.println("aԪ�ص�һ���������г��ֵ�������"+index);
		
				
	}
	}


