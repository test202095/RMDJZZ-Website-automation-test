package liaoyaxinzy;

public class Circle {
	int mR;//设置半径
	Point p=new Point();//定义圆心
	void setR(int r) {//设置半径
		mR=r;
	}
	int getR() {//获得半径
		return mR;
	}
	void setYx(Point p1) {//设置圆心的坐标对象
		p=p1;
	}
	Point getYx() {//获得圆心的坐标对象
		return p;
	}
	void ydgx(Point p1) {//判断圆与点的关系
		if((p.mX-p1.mX)*(p.mX-p1.mX)+(p.mY-p1.mY)*(p.mY-p1.mY)>mR*mR) {
			System.out.println("点在圆外");
		}else if((p.mX-p1.mX)*(p.mX-p1.mX)+(p.mY-p1.mY)*(p.mY-p1.mY)==mR*mR) {
			System.out.println("点在圆上");
		}else {
			System.out.println("点在圆内");
		}
	}
	
}
