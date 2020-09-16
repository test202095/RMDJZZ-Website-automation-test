package testbag02;

import java.awt.print.Printable;

public class A07陈兴用作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		2.写一个创建数组的函数
		int[] set=new int[10];
		SET(set);
//		3.写一个打印数组的函数
		Print(set);	
//		4.写一个可以排序数组的函数
		sort(set);
	}

		

	//往数组里添加随机数
	static void SET(int[] set) {
		for (int i = 0; i < set.length; i++) {
			int a=(int)(Math.random()*100);
			set[i]=a;
			System.out.print(set[i]+" ");
		}
		System.out.println();
	}
	//遍历数组并打印
	static void Print(int[] set) {
		for (int i = 0; i < set.length; i++) {
			System.out.print(set[i]+" ");
			
		}
		System.out.println();
	}
	//数组排序:冒泡排序
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
			System.out.print(set[i]+" ");//从小到大
			
		}
	}
}
