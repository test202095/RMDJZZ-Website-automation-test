package maker;

public class A04����ת�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ʽת��,��С����
		
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
		
		//��ʾת��,�Ӵ�С
		double d1=20.222222;
		float f1=(float)d1;
		int c1=42;
		short b1=(short)c1;
		System.out.println(b1);//���ݲ�����,ǿ��ת����Ҫ�û��Լ�����
		
		byte a2=(byte)1000;
		System.out.println(a2);
		/*
		 * 1000 --->1111101000
		 * byteֻ��һ���ֽڵĿռ�
		 * ���λ����
		 * 11101000 -->��תԭ��
		 * 10010111 +1
		 * 10011000 -->-24
		 */
		
		
		
	}
	
	

}
