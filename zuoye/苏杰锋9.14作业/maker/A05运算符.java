package maker;

public class A05运算符 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=10;
		int b=20;
		int c=a%b;
		int c1=a+b;
		int c2=a-b;
		int c3=a*b;
		int c4=a/b;
		++c;
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		int x=10;
		x+=1;
		x-=2;
		x*=10;
		x/=2;
		x%=2;
		System.out.print(x);
		
		int y=20;
		int z=10;
		System.out.println(y==z);
		System.out.println(y>=z);
		System.out.println(y<=z);
		System.out.println(y!=z);
		System.out.println("hello" instanceof String);
		
		int a1=10;
		int b1=20;
		System.out.println(++a1);
		
		System.out.println("---------------");
		//逻辑运算符
		boolean k=true;
		boolean kk=false;
		System.out.println(k&&kk);//f
		System.out.println(k&kk);//f
		System.out.println(k|kk);//t
		System.out.println(k||kk);//t
		System.out.println(k^kk);//t
		System.out.println(!kk);//t
		
		int a2=10;
		int b2=8;
		/*
		 * 0000 1010
		 * 0000 1000
		 * 0000 1000
		 * 
		 */
		int d1=a2&b2;
		System.out.println(d1);
	}

}
