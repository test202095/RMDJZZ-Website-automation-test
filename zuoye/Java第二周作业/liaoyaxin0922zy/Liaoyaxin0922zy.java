package liaoyaxin0922zy;

public class Liaoyaxin0922zy {
	public static class myStudent{
		myStudent(){
			System.out.println("���ǹ��캯��");
		}
	}
//	���һ��������,�����з����,��λ��,������,�����������Ե�setter��getter����,
//	Ҫ���β�����������һ��
	public static class ClassRoom{//��ʦ��
		private int houseNum;//�����
		private int sitCount;//��λ��
		private String houseName;//������
		//�������Ե�setter��getter����
		public int getHouseNum() {//��÷����
			return houseNum;
		}
		public void setHouseNum(int houseNum) {//���÷����
			this.houseNum = houseNum;
		}
		public int getSitCount() {//�����λ��
			return sitCount;
		}
		public void setSitCount(int sitCount) {//������λ��
			this.sitCount = sitCount;
		}
		public String getHouseName() {//��÷�����
			return houseName;
		}
		public void setHouseName(String houseName) {//���÷�����
			this.houseName = houseName;
		}	
		
	}
	//����:��װһ������,����������,����,Ʒ��,�ṩ����ӿ�,ͨ���ӿڲ��ܷ������Ժ��޸�����,
//	�޸���������ʱ��Ҫ��֤�Ϸ���.�й��캯���ȸ���Щ���Ը�ֵ
	public static class Dog{//����
		private String name;//����
		private int age;//����
		private String type;//Ʒ��
		Dog(String name,int age,String type){//���캯����ʼ��
			this.name=name;
			this.age=age;
			this.type=type;
		}
		String getName() {//��ȡ����
			return name;
		}
		void setName(String name) {//��������
			this.name = name;
		}
		int getAge() {//�������
			return age;
		}
		void setAge(int age) {//��������
			if(age>0&&age<140) {//��֤�Ƿ�Ϸ�
			this.age = age;
			}else {
				System.out.println("���䲻�Ϸ�");
			}
		}
		String getType() {//���Ʒ��
			return type;
		}
		void setType(String type) {//����Ʒ��
			this.type = type;
		}
		
	}
	public static class Father{//����
//		Father(){//�޲ι��캯��
//			System.out.println("���Ǹ���Ĺ��캯��");
//		}
		Father(int a){//�вι��캯��
			this.a=a;//��д����Ͳ��ḳֵ
		}
		private int a=10;//˽�г�Ա
		public int b=20;
		void mytest() {
			System.out.println("���Ǹ����mytest����");
		}
	}
	public static class Son extends Father{//����
		Son(){//�����๹�����вι��캯����û���޲ι��캯���˴��ᱨ��
			super(100);//�����ڵ�һ��
			System.out.println("��������Ĺ��캯��");
//			System.out.println(a);//�����Լ̳�˽�г�Ա
			System.out.println("ͨ��sper�̳�˽�г�Ա:"+super.a);//����ͨ���ؼ���super�̳�˽�г�Ա����,ע��super(100)�Ѿ��Ȱ��Ӹ��Ƶ�һ��a����Ϊ100��
			System.out.println(b);//���Լ̳�
			b++;
			System.out.println(b);//�����޸������е���û���޸ĸ����е�
			
		}
		Son(int a){
			super(a);
		}
		void mytest() {
			System.out.println("���������mytest����");
		}
		void mytest01() {
			super.mytest();//���ø���ķ���
		}
	}
//	����:����һ��������Ϊ����,�����ж��������,����,Ʒ��.������������,��,è,�ϻ�,Ȼ���ӡ
//	����Ϣ,��:2����������������������Ľ� 
	public static class Animals{//������
		private String name;//����
		private int age;//����
		private String type;//Ʒ��
		Animals(String name,int age,String type){//��ʼ�����캯��
			this.name=name;
			this.age=age;
			this.type=type;
		}
		void speak() {
			
		}
	}
	public static class Dog1 extends Animals{//����

		Dog1(String name, int age, String type) {
			super(name, age, type);//�����಻���޲ι��캯�������ำֵ
		}
		void speak() {
			System.out.println(super.age+"���"+super.type+super.name+"���������Ľ�");
		}
		}
	public static class Cat extends Animals{//è��

		Cat(String name, int age, String type) {
			super(name, age, type);//�����಻���޲ι��캯�������ำֵ
		}
		void speak() {
			System.out.println(super.age+"���"+super.type+super.name+"���������Ľ�");
		}
		}
	public static class Tigger extends Animals{//�ϻ���
		Tigger(String name, int age, String type) {
			super(name, age, type);//�����಻���޲ι��캯�������ำֵ
		}
		void speak() {
			System.out.println(super.age+"���"+super.type+super.name+"�������صĽ�");
		}
		}
	 static void mytest(Animals an) {//��������
		an.speak();
	}
	 public static class Car{//��������
		 private String  brandName;//Ʒ������
		 private String model;//�ͺ�
		 private double price;//�۸�
		 Car(String  brandName,String model,double price){
			 this.brandName=brandName;
			 this.model=model;
			 this.price=price;
		 }
		 void myBrand() {
			 
		 }
	 }
	 public static class Bmw extends Car{//��������
		 Bmw(String  brandName,String model,double price){
			 super(brandName,model,price);//��ʼ��
		 }
		 void myBrand() {
			 System.out.println("�ҵ�����Ʒ���ǣ�"+super.brandName);
		 }
	 }
	 //����
	 static void mytest01(Car mycar) {
		 mycar.myBrand();
	 }
	 public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		myStudent m=new myStudent();
//		����:�ڱ���ļ�����һ����,����������name,age,score,����age��ֵʱҪ�жϺϷ���
//		����ͨ�����캯����ֵ,���Ե��ô�ӡ��Щ���Եķ���
		B01 n=new B01("����",18,99.5);
		System.out.println("������"+n.getName()+" ���䣺"+n.getAge()+" ������"+n.getScore());
		
		ClassRoom c=new ClassRoom();
		c.setHouseNum(1001);//���÷����
		c.setSitCount(50);//������λ��
		c.setHouseName("�������");//���÷�����
		//��ӡ��������ó�Ա������
		System.out.println("����ţ�"+c.getHouseNum()+" ��λ����"+c.getSitCount()+" ��������"+c.getHouseName());
		
		Dog dog=new Dog("С��",2,"��Ȯ");//ʵ��������
		System.out.println("���֣�"+dog.getName()+" ���䣺"+dog.getAge()+" Ʒ�֣�"+dog.getType());
		dog.setAge(144);//���ò��Ϸ�����
		dog.setName("С��");//��������
		dog.setAge(3);//���úϷ�����
		dog.setType("�»�");//����Ʒ��
		System.out.println("���֣�"+dog.getName()+" ���䣺"+dog.getAge()+" Ʒ�֣�"+dog.getType());
		
	
		Son mys=new Son();//�ȵ��ø����еĹ��캯�����ٵ��������еĹ��캯��
		Father f=new Father(10);
		System.out.println("���Ǹ����еģ�"+f.b);//�޸������еĸ����е�δ���޸ģ�����Ϊ����̳��Ǹ�����һ�ݹ���
		mys.mytest();
		mys.mytest01();
		
		
		Dog1 mydog=new Dog1("С��",2,"̩��");
		Cat mycat=new Cat("����",3,"��ż");
		Tigger myti=new Tigger("С��",4,"������");
		mytest(mydog);//���������
		mytest(mycat);//è�������
		mytest(myti);//�ϻ��������
		
		
//		2.���췽����˭���õ�
//		ʵ��������
//		3.����Ĺ��캯��Ĭ�ϵ��ø����ʲô���캯��
//		�޲ι��캯��
//		4.�������Ĺ��캯��Ҫ���ø�����вι���,Ҫ��ʲô����
//		super();//����
//		5.This��������ʲô
//		����ͬ���ĳ�Ա�����;ֲ�����
//		6.�̳еĹؼ�����ʲô
//		extends
//		7.�̳п��Լ̳и����˽�б�����?
//		���Լ̳У���super.˽�б�����
//		8.дһ�������Ķ�̬����,���������Ǹ���,���������,������ӡ���������Ʒ��
//		�ش�:
		Bmw bm=new Bmw("����","x3",800000);
		mytest01(bm);
	}

}
