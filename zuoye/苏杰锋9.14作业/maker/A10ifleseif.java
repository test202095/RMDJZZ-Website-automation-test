package maker;
import java.awt.Window.Type;
import java.util.Scanner;
public class A10ifleseif {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		����:�����·ݣ������Ӧ�ļ��ڣ�
//		1~3--����
//		4~6--�ļ�
//		7~9--�＾
//		10~12--����
		Scanner scan=new Scanner(System.in);
		System.out.println("�������ݣ�");
		int a=scan.nextInt();
		
		if (a>=1 && a<=3) {
			System.out.println("����");
		}else if(a>=4 && a<=6){
			System.out.println("�ļ�");
		}
		else if (a>=7 &&a<=9) {
			System.out.println("�＾");
		}
		else if(a>=10 &&a<=12) {
			System.out.println("����");
		}
		else {
			System.out.println("��������");
		}
	}

}
