package liaoyaxinzyb;

public class Apublic01 {
	public void mytest01() {
		System.out.println("我是public的不同包中成员函数");
	}
	public int pb=300;//成员变量
	public int[] mySort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
