package testbag04;

import java.awt.print.Printable;

public class B06������zuoye {
//	2.���췽����˭���õ�
	//�𣺹��췽�����ڶ��󴴽�֮��new�������ǰ�����õ�
	
//	3.����Ĺ��캯��Ĭ�ϵ��ø����ʲô���캯��
	//���޲ι��캯��
	
//	4.�������Ĺ��캯��Ҫ���ø�����вι���,Ҫ��ʲô����
	//��super
	
//	5.This��������ʲô
	//�𣺵��βκͳ�Ա��������ʱ��this����
	
//	6.�̳еĹؼ�����ʲô
	//��extends
	
//	7.�̳п��Լ̳и����˽�б�����?
	//�𣺲�����
	
//	8.дһ�������Ķ�̬����,���������Ǹ���,���������,������ӡ���������Ʒ��
	public static class Car{
		String brand;//Ʒ��
		String color;//��ɫ
		String type;//����
		void carprint() {//�����carprint����
			System.out.println("Ʒ�ƣ�"+brand+" ��ɫ��"+color+" ���ͣ�"+type);
		}
	}
	public static class BMW extends Car{
		BMW(String brand,String color,String type){
			this.brand=brand;
			this.color=color;
			this.type=type;
		}
		void Print(){//��д�����carprint����
			System.out.println("Ʒ�ƣ�"+brand+" ��ɫ��"+color+" ���ͣ�"+type);
		}
		
	}
	public static class Benz extends Car{
		Benz(String brand,String color,String type){
			this.brand=brand;
			this.color=color;
			this.type=type;
		}
		void Print(){//��д�����carprint����
			System.out.println("Ʒ�ƣ�"+brand+" ��ɫ��"+color+" ���ͣ�"+type);
		}
		
	}
	public static class Ferrari extends Car{
		Ferrari(String brand,String color,String type){
			this.brand=brand;
			this.color=color;
			this.type=type;
		}
		void Print(){//��д�����carprint����
			System.out.println("Ʒ�ƣ�"+brand+" ��ɫ��"+color+" ���ͣ�"+type);
		}
		
	}
	//����
	public static void test(Car ca) {//��ͬ����ͬһ����������ͬ�Ľ��
		ca.carprint();
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BMW b=new BMW("����","��ɫ","����");//����
		Benz be=new Benz("����","��ɫ","����"); 
		Ferrari f=new Ferrari("������","��ɫ","�ܳ�");
		test(b);
		test(f);
		test(be);
	}

}
