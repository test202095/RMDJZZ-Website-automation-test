package liaoyaxinzy;

public class Circle {
	int mR;//���ð뾶
	Point p=new Point();//����Բ��
	void setR(int r) {//���ð뾶
		mR=r;
	}
	int getR() {//��ð뾶
		return mR;
	}
	void setYx(Point p1) {//����Բ�ĵ��������
		p=p1;
	}
	Point getYx() {//���Բ�ĵ��������
		return p;
	}
	void ydgx(Point p1) {//�ж�Բ���Ĺ�ϵ
		if((p.mX-p1.mX)*(p.mX-p1.mX)+(p.mY-p1.mY)*(p.mY-p1.mY)>mR*mR) {
			System.out.println("����Բ��");
		}else if((p.mX-p1.mX)*(p.mX-p1.mX)+(p.mY-p1.mY)*(p.mY-p1.mY)==mR*mR) {
			System.out.println("����Բ��");
		}else {
			System.out.println("����Բ��");
		}
	}
	
}
