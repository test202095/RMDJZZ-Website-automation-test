package testbag02;

import java.awt.print.Printable;

public class A07��������ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		2.дһ����������ĺ���
		int[] set=new int[10];
		SET(set);
//		3.дһ����ӡ����ĺ���
		Print(set);	
//		4.дһ��������������ĺ���
		sort(set);
	}

		

	//����������������
	static void SET(int[] set) {
		for (int i = 0; i < set.length; i++) {
			int a=(int)(Math.random()*100);
			set[i]=a;
			System.out.print(set[i]+" ");
		}
		System.out.println();
	}
	//�������鲢��ӡ
	static void Print(int[] set) {
		for (int i = 0; i < set.length; i++) {
			System.out.print(set[i]+" ");
			
		}
		System.out.println();
	}
	//��������:ð������
	static void sort(int[] set) {
		for (int i = 0; i < set.length-1; i++) {
			for (int j = 0; j < set.length-1-i; j++) {
				if(set[j]>set[j+1]) {
					int x=set[j];
					set[j]=set[j+1];
					set[j+1]=x;
					
				}
		
			}
			
		}
		for (int i = 0; i < set.length; i++) {
			System.out.print(set[i]+" ");//��С����
			
		}
	}
}
