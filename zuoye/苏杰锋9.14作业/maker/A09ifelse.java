package maker;
import java.util.Scanner;
public class A09ifelse {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		Scanner scan=new Scanner(System.in);
		System.out.println("�����һ�����ݣ�");
		int a=scan.nextInt();
		System.out.println("����ڶ������ݣ�");
		int a2=scan.nextInt();
		System.out.println("������������ݣ�");
		int a3=scan.nextInt();
		if (a>a2) {
			if (a>a2) {
				System.out.println("���ֵΪ��"+a);
			}else {
				System.out.println("���ֵΪ��"+a2);}
		}else {
			if (a2>a3) {
				System.out.println("���ֵΪ��"+a2);
			}
			else {
				System.out.println("���ֵΪ��"+a3);
			}
		}
			
		}
		
	}


