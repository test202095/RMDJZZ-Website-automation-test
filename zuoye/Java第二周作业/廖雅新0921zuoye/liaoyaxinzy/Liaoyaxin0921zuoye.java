package liaoyaxinzy;

import java.util.Scanner;

import liaoyaxinzyb.Adefault01;
import liaoyaxinzyb.Adefault01Son;
import liaoyaxinzyb.Aprivate1;
import liaoyaxinzyb.Aprotected01;
import liaoyaxinzyb.AprotectedSon;
import liaoyaxinzyb.Apublic01;

public class Liaoyaxin0921zuoye {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		����:���һ��Բ���ࣨCircle������һ�����ࣨPoint����������Բ�Ĺ�ϵ��
//		����Բ������Ϊx0, y0, �뾶Ϊr���������Ϊx1, y1��
//		1������Բ�ϣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//		2������Բ�ڣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//		3������Բ�⣺(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
		Point m=new Point();//����������
		m.setX(10);
		m.setY(20);
		
		Point n=new Point();//Բ�ĵ��������
		n.setX(15);
		n.setY(20);
		
		Circle y=new Circle();//Բ�Ķ���
		y.setR(10);
		y.setYx(n);//����Բ��
		
		y.ydgx(n);//�жϵ���Բ�Ĺ�ϵ
		
		System.out.println("==========�ָ���============");
		//����ͬ���еĳ�Ա�����ͳ�Ա���� public
		mytest01();
		System.out.println(pb);
		//����ͬ���еĳ�Ա�����ͳ�Ա���� public
		Apublic ap=new Apublic();
		ap.mytest01();
		System.out.println(ap.pb);
		//���ò�ͬ���еĳ�Ա�����ͳ�Ա����public
		Apublic01 ap1=new Apublic01();
		ap1.mytest01();
		System.out.println(ap1.pb);
//		����:�ڱ��ļ���дһ������,������Ȩ���ǹ��е�,Ȼ����main��ʹ���������,��������Ĺ����Ǽӷ�����
		int sum=test(1,2);
		System.out.println(sum);
//		����:�ڱ���ļ�дһ����,������һ������,���������,Ȼ���ڱ��ļ�����ʹ��
		int[] arr={1,4,3,5,2,7,8};
		Apublic01 ap2=new Apublic01();
		ap2.mySort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("==========�ָ���============");
		//������Ա�ڱ�����
		mytest02();
		System.out.println(pt);
		//������Ա��ͬ����
		Aprotected apt=new Aprotected();
		apt.mytest02();
		System.out.println(apt.pt);
		//������Ա�ڲ�ͬ����
		Aprotected01 apt1=new Aprotected01();
		apt1.mytest002();//�������ͬ���й��к������øñ����ĳ�Ա
		AprotectedSon apt2=new AprotectedSon();//�̳иñ�������Ա���࣬�����øñ������ĳ�Ա
		apt2.mytest0002();
		//�̳в�ͬ���е���
		AprotectedSon1 apt3=new AprotectedSon1();
		apt3.mytest0002();
		System.out.println("==========�ָ���============");
		//Ĭ��Ȩ����ͬһ����
		mytest03();
		System.out.println(df);
		//Ĭ��Ȩ����ͬ����
		Adefault dft=new Adefault();
		dft.mytest03();
		System.out.println(dft.df);
		//Ĭ��Ȩ���ڲ�ͬ����
		Adefault01 dft1=new Adefault01();
//		dft1.mytest03();
		dft1.mytest003();
		//ͬ���̳�
		Adefault01Son dft2=new Adefault01Son();
		dft2.mytest0003();
		System.out.println("==========�ָ���============");
		//˽�г�Աͬ��
		mytest04();
		System.out.println(pv);
		//˽�г�Աͬ��
		Aprivate apv=new Aprivate();
//		apv.mytest04();//��ͬ�಻������
		//˽�г�Ա��ͬ��
		Aprivate1 apv1=new Aprivate1();
//		apv1.mytest04();//��ͬ��������
		System.out.println("==========�ָ���============");
		//setter��getter
		//����:���һ���û���,������˽�г�Ա����������,�绰����.���������˽�����Ե�setter��getter����
		//�����޸�������Ҫ��֤�绰����	
		�û��� user=new �û���();
		System.out.println("����ǰ");
		System.out.println("��Ա������"+user.getName());
		System.out.println("���룺"+user.getPwd());
		System.out.println("�绰���룺"+user.getTel());
		user.setName("zhangsan");
		user.setTel("15211598111");
		user.setPasswd("123456");
		System.out.println("���ĺ�");
		System.out.println("��Ա������"+user.getName());
		System.out.println("���룺"+user.getPwd());
		System.out.println("�绰���룺"+user.getTel());
		System.out.println("==========�ָ���============");
//		1.��ĳ�ԱȨ��ȫ��ʲô
		//����Ȩ�� public
		//����Ȩ�� protected
		//Ĭ��Ȩ��
		//˽��Ȩ�� private
//		2.����Ȩ�޺�Ĭ��Ȩ�޵�������ʲô
		//����Ȩ�޿��Կ���̳б���Ȩ�޵ĳ�Ա
		//Ĭ��Ȩ�޲����Կ���̳�Ĭ��Ȩ�޵ĳ�Ա
//		3.���ڿ��Է���˽��Ȩ�޵ĳ�Ա��
		//�����п��Է���˽��Ȩ�޵ĳ�Ա
//		4.������Ҫ�������е�˽�г�Աʱ������һ�����ô����
		//����ʹ��setter��getter������˽��Ȩ�޵ĳ�Ա�����ͻ�ȡ˽��Ȩ�޵ĳ�Ա����
		//����ʹ��public�ĳ�Ա����˽�г�Ա����
//		5.һ���ʲô��Ա����Ϊ˽�е�
		//����Ҫ���ⲿ����ʵĳ�Ա���������ⲿ�������޸ĵĳ�Ա
//		6.��дһ����Ϸ������,�����ļ���д,��Ϸ���������������,����,����,�Ա�,
//		д����Щ���Ե�getter��setter����,������Ա�Ҫ������ܸ�ֵ
		GamePerson gp=new GamePerson();
		gp.setName("���");
		gp.setAge(100);
		gp.setSect("��ң��");
		gp.setSex("nan");
		System.out.println("������"+gp.getName());
		System.out.println("���䣺"+gp.getAge());
		System.out.println("���ɣ�"+gp.getSect());
		System.out.println("�Ա�"+gp.getSex());
		System.out.println("==========���ĺ�============");
		gp.setSex("��");//���ĺϷ����Ա�
		System.out.println("������"+gp.getName());
		System.out.println("���䣺"+gp.getAge());
		System.out.println("���ɣ�"+gp.getSect());
		System.out.println("�Ա�"+gp.getSex());
		
	}
	public static void mytest01() {
		System.out.println("����public��ͬ���еĺ���");
	}
	public static int pb=100;//��Ա����
	public static int test(int a,int b) {//����ӷ�
		return a+b;
	}
	protected static void mytest02() {
		System.out.println("����protected��ͬ���еĺ���");
	}
	protected static int pt=10;
	static void mytest03() {
		System.out.println("����Ĭ�ϵ�ͬ���еĺ���");
	}
	static int df=1;
	private static void mytest04() {
		System.out.println("����˽�г�Ա��ͬ���еĺ���");
	}
	private static int pv=11;//��Ա����
static  class �û���{
	private String memberName;
	private String passwd;
	private String tel; 
	void setName(String name) {
		memberName=name;
	}
	void setPasswd(String pswd) {
		System.out.println("������绰���룺");
		Scanner scan=new Scanner(System.in);
		String mytel=scan.next();
		if(mytel.equals(tel)) {//�ж�������Ƿ���绰�����ֵ��ȣ����������޸�����
			passwd=pswd;		
		}else {
			System.out.println("������ĵ绰���벻��ȷ�������޸����룡");
		}
	}
	void setTel(String telp) {
		tel=telp;
	}
	String getName() {
		return memberName;
	}
	String getPwd() {
		return passwd;
	}
	String getTel(){
		return tel;
	}
}

}
