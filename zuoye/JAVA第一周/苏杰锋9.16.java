package day03;

public class A08��ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		дһ����������ĺ���
		int[] scan=new int[10];
		myarr(scan);
		
		
//		дһ����ӡ����ĺ���
		arr1(scan);
		
//		дһ��������������ĺ���
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
