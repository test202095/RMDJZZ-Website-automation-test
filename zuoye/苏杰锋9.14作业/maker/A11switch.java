package maker;
import java.util.Scanner;
public class A11switch {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan=new Scanner(System.in);
		System.out.println("����һ���ַ���");
		
		
//		����:�����������ͱ���,Ȼ��ӿ���̨��ȡһ���ַ�,�����+��ô���������������,����ʲô���žͶ�Ӧ����ʲô
//		//�ӿ���̨��ȡһ���ַ�
//		char d=scan.next().charAt(0);
		char d=scan.next().charAt(0);
		switch (d) {
		case '+':
			System.out.println(10+20);
			break;
		case '-':
			System.out.println(10-20);
			break;
		case '*':
			System.out.println(10*20);
			break;
		case '/':
			System.out.println(10/20);
			break;

		default:
			System.out.println("��������");
			break;
		}
		
	}

}
