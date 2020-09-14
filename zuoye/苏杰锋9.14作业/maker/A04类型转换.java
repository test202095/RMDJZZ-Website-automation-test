package maker;

public class A04类型转换 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//隐式转换,从小到大
		
		byte a=10;
		System.out.println(a);
		short b=a;
		System.out.println(b);
		int c=b;
		System.out.println(c);
		float f=c;
		System.out.println(f);
		double d=f;
		System.out.println(d);
		System.out.println("----------------");
		
		//显示转换,从大到小
		double d1=20.222222;
		float f1=(float)d1;
		int c1=42;
		short b1=(short)c1;
		System.out.println(b1);//数据不对了,强制转换需要用户自己控制
		
		byte a2=(byte)1000;
		System.out.println(a2);
		/*
		 * 1000 --->1111101000
		 * byte只有一个字节的空间
		 * 最高位舍弃
		 * 11101000 -->补转原码
		 * 10010111 +1
		 * 10011000 -->-24
		 */
		
		
		
	}
	
	

}
