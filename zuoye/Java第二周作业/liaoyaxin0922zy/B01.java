package liaoyaxin0922zy;

public class B01 {
	private String name;//����
	private int age;//����
	private double score;//����
	B01(String name,int age,double score){
		this.name=name;//����������ʼֵ
		if(age>0&&age<140) {//�ж������Ƿ�Ϸ�
			this.age=age;	//�Ϸ�����ʼֵ
		}else {
			System.out.println("���䲻�Ϸ�");
		}
		
		this.score=score;//����������ʼֵ
	}
	 String getName() {//��ȡ����
		return name;
	}
	 int getAge() {//��ȡ����
		return age;
	}
	 double getScore() {//��ȡ����
		return score;
	}
	
	

}
