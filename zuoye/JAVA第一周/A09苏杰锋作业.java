package day02;
import java.util.Scanner;
import java.util.Random;
public class A09��ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
/*
		
		//		#����:С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
		double m=0;
		int d=0;
		while(m<=100) {
			m+=2.5;
			d+=1;
			if (d%5==0) {
				m-=6;
			}
			
		}System.out.println(d);
		
//		����:���1-100�ĵ���
		int a=0;
		do {
			if (a%2==1) {
				System.out.println(a);
			}
			a++;
		}while(a<=100);
		
//		����:ʹ��whileǶ��ѭ����ӡ����ͼ��
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		int i=0;
		while (i<5) {
			int j=0;
			while(j<=i){
				
				System.out.print("* ");
				j++;
		}
		i++;
		System.out.println();
		}
		
//����:����һ������,Ȼ���ӡ0���������,����ӡ0���������֮��
		Scanner scan=new Scanner(System.in);
		System.out.print("����һ�����֣�");
		int a=scan.nextInt();
		int s=0;
		for (int i=0;i<=a;i++) {
			System.out.println(i);
			s=s+i;
		}
		System.out.println(s);
		
		
//����:n�Ľ׳ˣ����ⲿ��������һ������n
		int a1=scanner.nextInt();
		int s1=1;
		for(int i=1;i<=a1;i++) {
			s1*=i;
		}
		System.out.println(s1);
		
//		����:�žų˷��ھ���
		for(int i=1;i<10;i++) {//i==3
			for(int j=1;j<=i;j++) {//j==3
				int n=i*j;//n==4
				System.out.print(j+"*"+i+"="+n+"\t");
			}
			System.out.println();
		}
		
	
//���ñ�ǩ������������ѭ��
		aa:for (int i=1;i<3;i++) {
			for(int j=1;j<3;j++) {
				if(j%2==0) {
					break aa;
				}
				System.out.println("i="+i);
				System.out.println("j="+j);
			}
			
		}
	
		
		
//�����
		for (int i=0;i<10;i++) {
			int a=(int)(Math.random()*100);
			System.out.println(a);
		}
		
		Random r=new Random();
		for(int i=0;i<10;i++){
		    int a=r.nextInt(100);
		    System.out.print(a+" ");
		    
		}
		//math��ѧ��
		System.out.println(Math.pow(3, 2));//ƽ��
		System.out.println(Math.sqrt(9));//������
		System.out.println(Math.abs(-3));//����ֵ
		
		
//����		
//		����:����һ������������,Ȼ��������,Ȼ�������ӡ
		//1.������������鸳ֵ
		//2.��������
		//3.����
		//	1.{1,2,3,4}
			//arr[0]=1;
		//	arr[3]=4;
		//4.��������	
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
		    arr[i]=(int)(Math.random()*100);
		    }
		    for(int i:arr){//��ӡ����
		        System.out.print(i+" ");
		    }
		    for(int i=0;i<arr.length/2;i++) {
		       int tmp=arr[i];
		       arr[i]=arr[arr.length-1-i];
					arr[arr.length-1-i]=tmp;
				}
				System.out.println();
				for(int i:arr) {
					System.out.print(i+" ");
		    }
		
//����:��һά�������ֵ
				int[] arr2=new int[5];
						for(int i=0;i<5;i++) {
							arr2[i]=(int)(Math.random()*100);
						}
						for(int i:arr2) {
							System.out.print(i+" ");
						}
						System.out.println();
						int max=0;
						max=arr2[0];//��������ĵ�һ���������ֵ
						for(int i=1;i<arr2.length;i++) {
							if(max<arr2[i]) {//�������if,��ʾ�������б�max�������
								max=arr2[i];
							}
						}
						
						System.out.println("max="+max);
		
		
						System.out.println(arr);
						
						
						
//����:�ӿ���̨�����ַ���,Ȼ����ַ����е��ַ��洢���ַ�������,Ȼ���ӡ����
//1.str.charAt(i);���Է����ַ����е��ַ�,str���ַ���
//2.str.length();���Է����ַ����ĳ���,str���ַ���
                    Scanner scanner=new Scanner(System.in);
					//�ӿ���̨��ȡ�ַ���
                    System.out.println("�����ַ�����");
					String str=scanner.next();
					//�����ַ�����
					char[] arr=new char[str.length()];
					//�����鸳ֵ
					for(int i=0;i<arr.length;i++) {//abcd
       				arr[i]=str.charAt(i);
					}
					//ע��:�����ڵȺŵ���߱�ʾ�ȴ�������ֵ
					arr[0]='a';
					//�����ڵȺŵ��ұ߱�ʾ������ȡֵ
					char c=arr[0];
								
								
					System.out.println(arr);	
*/	
		
		
//6������⣺����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
		    arr[i]=(int)(Math.random()*10);
		    }
		    //��ӡ����
		    for(int i:arr){
		        System.out.print(i+" ");
		    }
		
		
		
		
		
		
	}

}
