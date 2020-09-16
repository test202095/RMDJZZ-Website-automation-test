package liaoyaxin;

import java.util.Random;

import liaoyaxin.A07�స��.AdvCircle;
import liaoyaxin.A07�స��.Point;

public class Liaoyaxin0916zuoye {
 static class Cube{
	 int xm;//��
	 int ym;//��
	 int zm;//��
	 //���ó����
	 void setX(int x) {
		 xm=x;
	 }
	 void setY(int y) {
		 ym=y;
	 }
	 void setZ(int z) {
		 zm=z;
	 }
	 //��ȡ�����
	 int getX() {
		 return xm;
	 }
	 int getY() {
		 return ym;
	 }
	 int getZ() {
		return zm;
	 }
	 //�����
	 int are() {
		 return (2*(xm*ym)+2*(xm*zm)+2*(ym*zm));
	 }
	 //�����
	 int val() {
		 return (xm*ym*zm);
	 }
	 //�ж��������Ƿ���ͬ
	 boolean isSame(Cube n) {
		 boolean i=true;
		 if(xm==n.xm&&ym==n.ym&&zm==n.zm) {
			 i=true;
		 }else {
			 i=false;
		 }
		 return i;
	 }
 }
 static class Point{//����
	  int x1;//���x����
	  int y1;//���y����
	  void setX(int x) {//���õ��x����
		  x1=x;
	  }
	  void setY(int y) {//���õ��y����
		  y1=y;
	  }
	 
	  int getX() {//��ȡ���x����
		  return x1;
	  }
	  int getY() {//��ȡ���y����
		  return y1;
	  }
	  
	  
 }
static class AdvCircle{//Բ����
	  int r;//�뾶
	  int x0;//Բ��x����
	  int y0;//Բ��y����
	  void setR(int bj) {//����Բ�İ뾶
		  r=bj;
	  }
	  void setX(int x) {//����Բ�ĵ�x����
		  x0=x;
	  }
	  void setY(int y) {//����Բ�ĵ�y����
		  y0=y;
	  }
	  int getR() {//��ȡԲ�İ뾶
		  return r;
	  }
	  int getX() {//��ȡԲ�ĵ�x����
		  return x0;
	  }
	  int getY() {//��ȡԲ�ĵ�y����
		  return y0;
	  }
	  int isInreg(Point d) {
		  int i=0;//0��ʾ��Բ�� 1��ʾ��Բ��  2��ʾ��Բ��
		  if((d.x1-x0)*(d.x1-x0) + (d.y1-y0)*(d.y1-y0) == r*r){
			  i=0;
		  }else if((d.x1-x0)*(d.x1-x0) + (d.y1-y0)*(d.y1-y0) < r*r) {
			  i=1;
		  }else {
			  i=2;
		  }
		  return i;
	  }	  
 }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
////     1.����Ĵ���ú�ϸϸ����ĥһ��,����,���ͷʹ,��ֹͣ!
//		����:��ӡһ��5��5�е�*ͼ��
		char[][] str=new char[5][5];
		for(int i =0;i<str.length;i++) {//��ѭ�������� �����ܹ��ж�����
			for(int j=0;j<str[i].length;j++) {//��ѭ�������� ÿһ���м���
				str[i][j]='*';//����ά�����ÿ��ÿ�и�ֵ
				System.out.print(str[i][j]);//��ӡ
			}
			System.out.println();//ÿ��ִ���껻��
		}
		
		System.out.println("------------");
//		����:��ӡ����ͼ��
//		@@@@@@@@
//		$$$
//		#####
//		@@@@@@
//		!!!!!!!!
		char[][] mystr;//�����ά����
		mystr=new char[5][];//������
		//�����У�ÿ���м���
		mystr[0]=new char[8];
		mystr[1]=new char[3];
		mystr[2]=new char[5];
		mystr[3]=new char[6];
		mystr[4]=new char[8];
		for(int i=0;i<mystr.length;i++) {
			for(int j=0;j<mystr[i].length;j++) {
				if(i==0 || i==3) {//�������±��жϵڼ���Ӧ���ֵ��ַ�
					mystr[i][j]='@';
				}else if(i==1) {
					mystr[i][j]='$';
				}else if(i==2) {
					mystr[i][j]='#';
				}else if(i==4) {
					mystr[i][j]='!';
				}
				System.out.print(mystr[i][j]);//��ӡ
			}
			System.out.println();//ÿ�н�������
		}
		System.out.println("---------------------");
//		����:�������0-99�ڵ�10����,���뵽������,����ӡ����,Ȼ�����ð������,֮���ٴ�ӡ
		Random r=new Random();//���������
		int[] myarr=new int[10];//����һ������Ϊ10��һά����
		for(int i=0;i<myarr.length;i++) {//�����鸳ֵ��������0~99�������
			myarr[i]=r.nextInt(99);
		}
		//ð������
		for(int i=0;i<myarr.length-1;i++) {
			for(int j=0;j<myarr.length-1-i;j++) {
				if(myarr[j]>myarr[j+1]) {//��С����
					int temp=myarr[j];
					myarr[j]=myarr[j+1];
					myarr[j+1]=temp;
				}
			}
		}
		//��ӡ������ɵ�����
		for(int i:myarr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======================");
//		����:д2��������ȡ�����е����ֵ����Сֵ
		int[] arr1= {1,2,3,4,5,6};
		System.out.println("���ֵΪ��"+getMax(arr1));
		System.out.println("��СֵΪ��"+getMin(arr1));
		System.out.println("=======================");
//		����:дһ���ܴ�ӡ����ĺ���
		printArr(arr1);
		System.out.println();
		System.out.println("=======================");
//		���У�д2��ͬ���ļӷ�����,���Դ���double���ͺ�int���͵�����
		add(1,2);
		add(2,2.2);
//		����һ��java�ļ�,дһ����,������name='maker',age=18;�г�set,get����ǰ���������Եķ���
//		����һ���ļ��е��ø���,���ɶ���,Ȼ��ͨ�������ӡ��2�����Ե�ֵ,�͵��÷���
		Mytest m=new Mytest();
		System.out.println(m.getName()+" "+m.getAge());
		m.setAge(18);
		m.setName("zhangsan");
		System.out.println(m.getName()+" "+m.getAge());
		System.out.println("=======================");
//		����:�����������(Cube)���������������( 2*a*b + 2*a*c + 2*b*c )�����( a * b * c)��
//		�ֱ���ȫ�ֺ����ͳ�Ա�����ж������������Ƿ���ȡ�
		Cube n=new Cube();
		n.setX(10);
		n.setY(20);
		n.setZ(30);
		System.out.println(n.getX()+" "+n.getY()+" "+n.getZ());
		Cube n1=new Cube();
		n1.setX(100);
		n1.setY(200);
		n1.setZ(300);
		System.out.println(n1.getX()+" "+n1.getY()+" "+n1.getZ());
		if(n.isSame(n1)) {
			System.out.println("������������ͬ");
		}else {
			System.out.println("���������岻��ͬ");
		}
		System.out.println("=======================");
//		����:���һ��Բ���ࣨAdvCircle������һ�����ࣨPoint����������Բ�Ĺ�ϵ��
//		����Բ������Ϊx0, y0, �뾶Ϊr���������Ϊx1, y1��
//		1������Բ�ϣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//		2������Բ�ڣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//		3������Բ�⣺(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
		AdvCircle ad=new AdvCircle();
		Point p=new Point();
		ad.setR(3);
		ad.setX(0);
		ad.setY(0);
		p.setX(0);
		p.setY(3);
		if(ad.isInreg(p)==0) {
			System.out.println("����Բ��");
		}else if(ad.isInreg(p)==1) {
			System.out.println("����Բ��");
		}else {
			System.out.println("����Բ��");
		}
		System.out.println("=======================");
//		2.дһ����������ĺ���
		for(int i:createArr(10)) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======================");
//		3.дһ����ӡ����ĺ���
		int[] arr2= {2,3,4,5,6,6};
		printA(arr2);
		System.out.println();
		System.out.println("=======================");
//		4.дһ��������������ĺ���
		int[] arr3=createArr(10);//��������
		printA(arr3);//��ӡ����������
		System.out.println();
		sortArr(arr3);//����
		printA(arr3);//��ӡ����������
	}
	//�������麯��
	static int[] sortArr(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {//��С����
					int temp=arr[j];//Ҫ�ȱ����ǵĴ洢����ʱ����
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		return arr;//�������������鷵�س�ȥ
	}
	//��ӡ���麯��
	static void printA(int[] arr) {
		for(int i :arr) {
			System.out.print(i+" ");
		}
		
	}
	static int[] createArr(int n) {//������������ֵ
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		return arr;
	}
	
	//��������
	static int add(int a,int b) {
		return a+b;
	}
	static int add(double a,int b) {
		return (int)a+b;
	}
	static int add(double a,double b) {
		return (int)a+(int)b;
	}
	static int add(int a,double b) {
		return a+(int)b;
	}
	static void printArr(int[] arr) {//��ӡ���麯��
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	static int getMax(int[] arr) {//��ȡ���ֵ
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	static int getMin(int[] arr) {//��ȡ��Сֵ
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}


}
