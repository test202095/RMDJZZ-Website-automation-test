package liaoyaxinzy;

public class GamePerson {
//	��Ϸ���������������,����,����,�Ա�,
	private String pName;//����
	private int pAge;//����
	private String pSect;//����
	private String pSex;
	
	//set����
	void setName(String name) {
		pName=name;
	}
	void setAge(int age) {
		if(age>0 && age<140) {
			pAge=age;
		}else {
			System.out.println("�����õ����䲻�Ϸ�");
		}
	}
	void setSect(String sect) {
		pSect=sect;
	}
	void setSex(String sex) {
		if(sex=="��"||sex=="Ů") {
			pSex=sex;
		}else {
			System.out.println("�����õ��Ա𲻺Ϸ�");
		}
	}
	String getName() {
		return pName;
	}
	int getAge() {
		return pAge;
	}
	String getSect() {
		return pSect;
	}
	String getSex() {
		return pSex;
	}
	
}
