import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;


public class A02���������� {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO �Զ����ɵķ������
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName", "android");
		des.setCapability("deviceName", "Android Emulator");
		des.setCapability("platformVersion", "4.4.2");
		des.setCapability("noReset", true);
		des.setCapability("appPackage", "com.android.calculator2");
		des.setCapability("appActivity", "com.android.calculator2.Calculator");

	    AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
	    dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//�ȴ�10s
	    //1.�ȶ�λ������1 com.android.calculator2:id/digit1
//	    dr.findElementById("com.android.calculator2:id/digit1").click();
	  //ʹ��class���Զ�λ����1,�����������еİ�������һ��class name���͵���Ĭ�ϵ�del,һ�㲻��  
	    
//	    dr.findElementByClassName("android.widget.Button").click();//Ĭ��Ϊɾ����ť
	  //ͨ��text���Զ�λ��Ԫ�� 5
	    dr.findElementByAndroidUIAutomator("text(\"5\")").click();
	  //ͨ��xpath��λҳ��Ԫ��
//	    dr.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]").click();
	    Thread.sleep(5000);//�ȴ�5�� ��Ҫ�׳��쳣InterruptedException
	    //���+  com.android.calculator2:id/plus
	    dr.findElementById("com.android.calculator2:id/plus").click();
	    //���2  com.android.calculator2:id/digit2
	    dr.findElementById("com.android.calculator2:id/digit2").click();
	    
	    //���= com.android.calculator2:id/equal
	    dr.findElementById("com.android.calculator2:id/equal").click();
	    
	    //����Ԥ�ڽ��
	    String yqval="7";
	    
	    //��ȡʵ�ʽ��  	class  android.widget.EditText
	    String sjval=dr.findElementByClassName("android.widget.EditText").getAttribute("text");
	    System.out.println(sjval);
	    
	    if(yqval.equals(sjval)){
	    	System.out.println("�ӷ�����ʵ���ǶԵ�");
	    }else{
	    	System.out.println("�ӷ�����ʵ���Ǵ����");
	    }
	    
	}

}
