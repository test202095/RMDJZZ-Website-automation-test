package liaoyaxin0922zy;

public class B01 {
	private String name;//姓名
	private int age;//年龄
	private double score;//分数
	B01(String name,int age,double score){
		this.name=name;//给姓名赋初始值
		if(age>0&&age<140) {//判断年龄是否合法
			this.age=age;	//合法赋初始值
		}else {
			System.out.println("年龄不合法");
		}
		
		this.score=score;//给分数赋初始值
	}
	 String getName() {//获取姓名
		return name;
	}
	 int getAge() {//获取年龄
		return age;
	}
	 double getScore() {//获取分数
		return score;
	}
	
	

}
