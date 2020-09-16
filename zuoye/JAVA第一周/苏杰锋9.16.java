package day03;

public class A08作业 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		写一个创建数组的函数
		int[] scan=new int[10];
		myarr(scan);
		
		
//		写一个打印数组的函数
		arr1(scan);
		
//		写一个可以排序数组的函数
		arr2(scan);
		
		
		
		
	}
		static void myarr(int[] arr) {
			for (int i=0;i<arr.length;i++) {
				int a=(int)(Math.random()*100);
				arr[i]=a;
				//System.out.print(arr[i]+" ");
			}//System.out.println();
			
		}
		
		static void arr1(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
				
			}
			System.out.println();
		
		}
		static void arr2(int[] arr) {
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-1-i; j++) {
					if(arr[j]<arr[j+1]) {
						int a=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=a;
						
					}
			
				}
				
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
				
			}
}
}
