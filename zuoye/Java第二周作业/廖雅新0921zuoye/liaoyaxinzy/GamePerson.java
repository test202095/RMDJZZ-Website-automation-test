package liaoyaxinzy;

public class GamePerson {
//	游戏人物的属性有姓名,年龄,门派,性别,
	private String pName;//姓名
	private int pAge;//年龄
	private String pSect;//门派
	private String pSex;
	
	//set方法
	void setName(String name) {
		pName=name;
	}
	void setAge(int age) {
		if(age>0 && age<140) {
			pAge=age;
		}else {
			System.out.println("您设置的年龄不合法");
		}
	}
	void setSect(String sect) {
		pSect=sect;
	}
	void setSex(String sex) {
		if(sex=="男"||sex=="女") {
			pSex=sex;
		}else {
			System.out.println("您设置的性别不合法");
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
