package testbag01;
import java.util.Scanner;
import java.util.Random;
public class A09test��������ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		1��While�����������������
//		�𣺲�����
		
//		2����ѭ��2����ѭ��4�Σ���ôһ��ѭ���˶��ٴ�
//		��2��
		
//		3��Break����һ������2��ѭ����
//		�𣺿���
		
//		4��������ʲô������������ʲô��
//		��������java�������õ��������ͣ�ֻ�ܴ��ͬ����������
		
//		5���붨���һ�����Դ���8�����͵�����
//		��
//		int[] list=new int[8];
//		for (int i = 0; i <= 8; i++) {
//			list[i]=i;
//			System.out.println(i);
//		}
////		
		
//		6������⣺����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		 //����1������
		Scanner sc=new Scanner(System.in);
        System.out.println("������Ҫ���ҵ�Ԫ��:");
        int n=sc.nextInt();
        int[] arr= {5,7,3,2,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
            System.out.println(i);    
            }
        }
      
        
		
		Scanner scan=new Scanner(System.in);
//		����:���1-100�ĵ���
		for (int i=1; i<=100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
//		����:С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
//		�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
		int z=0;//����
		double v=0;//��ǰǮ��
		while (v<=100) {
			v=v+2.5;
			z++;
			if (z%5==0) {
				v=v-6;
			}
			
		}
		System.out.println(z);
		//		����:����һ������,Ȼ���ӡ0���������,����ӡ0���������֮��
		int sum=0;
		System.out.println("���������֣�");
		int a=scan.nextInt();
		for (int i = 0; i <=a; i++) {
			sum+=i;
		
		}
		System.out.println(sum);	
//		����:n�Ľ׳ˣ����ⲿ��������һ������n
		int b=scan.nextInt();
		int hs=1;//���1��ʼ ��Ȼ0�����κ�������0
		for (int i = 1; i <=b; i++) {
			hs*=i;
			
		}
		System.out.println(hs);
//		����:�žų˷��ھ���
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		//��ӡ0-9������,��Ҫ��ӡ��5��
		for (int i = 0; i <=9; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		//����˫forѭ��
		aa:for (int i = 0; i <10; i++) {
			for (int j = 0; j <i; j++) {
				if (j%2==0) {
					break aa;
				}	
			}			
		}
//		����:����һ������������,Ȼ��������,Ȼ�������ӡ
		//1.������������鸳ֵ
		//2.��������
		//3.����
		int[] set=new int[5];
		for (int i = 0; i <=5; i++) {
			int nn=(int)(Math.random()*100);
			set[i]=nn;
			System.out.print(set[i]+" ");
		}
		System.out.println();
		for (int i =set.length; i >0; i--) {//�����±�Ӻ���ǰ���
			System.out.print(set[i-1]+" ");
			
		}
	  }

	}


