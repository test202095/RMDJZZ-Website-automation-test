import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;;

public class A01ģ���¼ {
	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		// TODO �Զ����ɵķ������
		//1.����appium����
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("platformName", "android");//ƽ̨����
		des.setCapability("deviceName", "Android Emulator");//�豸����
		des.setCapability("paltformVersion", "7.1.2");//ƽ̨�汾��
		des.setCapability("noReset", true);//Ĭ�ϲ���װ
		des.setCapability("appPackage", "com.tencent.qqlite");//���ð���
		des.setCapability("appActivity", "com.tencent.mobileqq.activity.SplashActivity");//������ҳ��
		
		//2.����appium����
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
		dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);//��ͣ
		
		dr.findElementById("com.tencent.qqlite:id/btn_login").click();//�����¼��ť
		
		dr.findElementsByAccessibilityId("������QQ������ֻ�������").clear();//�����
		dr.findElementByAccessibilityId("������QQ������ֻ�������").click();//���
		dr.findElementByAccessibilityId("������QQ������ֻ�������").sendKeys(new String[] {"1831207437"});//ģ�����
		
		dr.findElementById("com.tencent.qqlite:id/password").clear();//��������
		dr.findElementById("com.tencent.qqlite:id/password").click();//���
		dr.findElementById("com.tencent.qqlite:id/password").sendKeys(new String[] {"liaoyaxin12"});//ģ�����

		dr.findElementById("com.tencent.qqlite:id/login").click();//�����¼��ť
		
//		dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);//��ͣ
		
//		//ģ���˳�����
//		dr.findElementById("com.tencent.qqlite:id/ll_container").click();//����ҵ�
//		
//		dr.findElementById("com.tencent.qqlite:id/qqSettingSetting").click();//�������
//		
//		dr.findElementById("com.tencent.qqlite:id/qqSettingSetting").click();//����˺Ź���
//		
//		dr.findElementById("com.tencent.qqlite:id/logoutBtn").click();//����˳���ǰ�˺�
//		
//		dr.findElementById("com.tencent.qqlite:id/dialogRightBtn").click();//���ȷ���˳���ť
		
	}

}
