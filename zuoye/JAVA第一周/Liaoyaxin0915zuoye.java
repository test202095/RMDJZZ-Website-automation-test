package liaoyaxin;

import java.util.Random;
import java.util.Scanner;

public class Liaoyaxin0915zuoye {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		����:С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
//		�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
		double m=0;//�����
		int day=0;//����
		while(m<100) {//����100Ԫ������Ǯ
			m+=2.5;//ÿ�춼��2.5Ԫ
			day+=1;//��������
			if(day%5==0) {//�Ǵ�Ǯ�ĵ��������5�ı����ͻ�6ԪǮ
				m-=6;
			}
		}
		System.out.println(day);//��ӡ��100Ԫ��������
		System.out.println("---------");
//		����:���1-100�ĵ���
		int i=0;
		do {
			i++;
			if(i%2!=0) {//�ж��Ƿ�Ϊ������Ϊ���������
				System.out.print(i+" ");
			}
		}while(i<100);
		System.out.println();
		System.out.println("---------");
//		����:ʹ��whileǶ��ѭ����ӡ����ͼ��
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		int a=1;
		while(a<=5) {//��������
			a++;
			int b=1;
			while(b<a) {//����ÿ�м���
				System.out.print("* ");
				b++;
			}
			System.out.println();
		}
		System.out.println("---------");
//		����:����һ������,Ȼ���ӡ0���������,����ӡ0���������֮��
		System.out.println("������һ��������");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;//�����ܺ�
		for(int j=0;j<=n;j++) {
			sum+=j;//ѭ��ͳ���ܺ�
			System.out.print(j+" ");//ѭ����ÿ������
		}
		System.out.println();//����
		System.out.println(sum);
		System.out.println("-----------");
//		����:n�Ľ׳ˣ����ⲿ��������һ������n
//		5
//		5*4*3*2*1
		System.out.println("������һ�����֣�");
		int mm=scan.nextInt();
		int s=1;//ͳ��n�Ľ׳�
		for(int x=1;x<=mm;x++) {
			s*=x;//ʵ���ڷ�Χ�ڵ�ÿ���������
		}
		System.out.println(s);
		System.out.println("-----------");
//		����:�žų˷��ھ���
		for(int y=1;y<=9;y++) {
			for(int z=1;z<=y;z++) {
				System.out.print(z+"*"+y+"="+z*y+"\t");//z*y=z*y
			}
			System.out.println();//���� ÿ����ɺ�����һ��
		}
		System.out.println("-----------");
		cc:for(int i1=1;i1<3;i1++) {
			for(int j1=1;j1<3;j1++) {
				if(j1%2==0) {
//					break;//ֻ��������ѭ��
					break cc;//������ָ����ǩcc
				}
				System.out.println("i1="+i1);
				System.out.println("j1="+j1);
			}
		}
		System.out.println("-----------");
		aa:for(int x1=1;x1<4;x1++) {
			for(int y1=1;y1<4;y1++) {
				if(y1%2==0) {
//					continue;//ֻ������ѭ������ֻ��������ѭ�����������ִ��ѭ��
					continue aa;//������ָ����ǩaa��ע��ֻ������ͬ��ѭ��
				}
				System.out.println("x1="+x1);
				System.out.println("y1="+y1);
			}
			
		}
		System.out.println("-----------");
		//1.��������
		int[] arr=new int[4];
		//�����鸳ֵ
//		arr[0]=1;
//		arr[1]=3;
//		arr[2]=5;
//		arr[3]=7;
		for(int ar=0;ar<4;ar++) {//�����鸳ֵ
			arr[ar]=(ar+1)*10;
		}
		for(int b:arr) {//������ӡ�����е�ֵ
			System.out.print(b+" ");
		}
		System.out.println();//����
		//2.�ֲ���������   
		int[] arr2=null;
		arr2=new int[3];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		for(int v=0;v<arr2.length;v++) {//������ĳ�����������ӡ
			System.out.print(arr2[v]+" ");
		}
		//3.��ʼ������
		int[] arr3= {1,2,3,4,5,6,6};
		for(int v=0;v<arr3.length;v++) {//������ĳ�����������ӡ
			System.out.print(arr3[v]+" ");
		}
		System.out.println();//����
		System.out.println("-----------");
		
//		����:����һ������������,Ȼ��������,Ȼ����������,����ӡ
		int[] myarr=new int[5];
		for(int d=0;d<myarr.length;d++) {//�����鸳ֵ
			myarr[d]=(int)(Math.random()*100);
			System.out.print(myarr[d]+" ");//ѭ����ӡ�浽�����е�ֵ
		}
		for(int k=0;k<myarr.length/2;k++) {//���������ѵ�һ�������һ�������γɵ���  �����Ĵ����ǳ���/2
			int temp=myarr[k];//��ʱ�����洢Ҫ�ȱ��滻��ֵ
			myarr[k]=myarr[myarr.length-1-k];
			myarr[myarr.length-1-k]=temp;
		}
		System.out.println();//����
		for(int t:myarr) {
			System.out.print(t+" ");
		}
		System.out.println();//����
		System.out.println("-----------");
//		����:��һά�������ֵ
		//��������
		int[] myarr1=null;
		myarr1=new int[5];
		Random r=new Random();
		int max=0;//�������ֵ��������ʼ��
		for(int p=0;p<myarr1.length;p++) {
			myarr1[p]=r.nextInt(100);//����1~100���ڵ���������洢��myarr1������
			//������ӡ�����е�ֵ
			System.out.print(myarr1[p]+" ");
			//�ж������е�ֵ�Ƿ������ֵ
			if(max<myarr1[p]) {
				max=myarr1[p];
			}
		}
		System.out.println();//����
		System.out.println("���ֵΪ��"+max);
		System.out.println();//����
		System.out.println("-----------");
//		����:�ӿ���̨�����ַ���,Ȼ����ַ����е��ַ��洢���ַ�������,Ȼ���ӡ����
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str=scanner.next();//�ӿ���̨����
		//�����ַ�����
		char[] mystr=new char[str.length()];//���鳤��Ϊ�����ַ�������
		for(int w=0;w<str.length();w++) {
			mystr[w]=str.charAt(w);//��ȡ�����ַ�����ÿ���ַ�������ֵ���ַ�����
		}
		System.out.println(mystr);//��ӡ�ַ�����
//		1��While�����������������
		//�����ԣ�while��ֻ���ǲ������ʽ
//		2����ѭ��2����ѭ��4�Σ���ôһ��ѭ���˶��ٴ�
		//8��
//		3��Break����һ������2��ѭ����
		//break��ϱ�ǩʹ��ʱ������������ѭ��
//		4��������ʲô������������ʲô��
		//������java��һ�������������ͣ����������У����ȹ̶����������䣬�洢����ͬһ���������͵����ݣ�
		//����һ���Դ��ݶ��ֵ
//		5���붨���һ�����Դ���8�����͵�����
		int[] myar=new int[8];
//		6������⣺����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		int[] ar=new int[10];
		int md=30;//Ŀ��Ԫ��
		int index=0;//��һ�γ��ֵ�����
		for(int o=0;o<ar.length;o++) {
			ar[o]=(o+1)*10;
			if(ar[o]==md) {
				index=o;
			}
		}
		System.out.println(md+"��һ�γ��ֵ�����Ϊ��"+index);
		}

}
