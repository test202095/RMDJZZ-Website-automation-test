import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;


public class A02计算器操作 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO 自动生成的方法存根
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName", "android");
		des.setCapability("deviceName", "Android Emulator");
		des.setCapability("platformVersion", "4.4.2");
		des.setCapability("noReset", true);
		des.setCapability("appPackage", "com.android.calculator2");
		des.setCapability("appActivity", "com.android.calculator2.Calculator");

	    AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
	    dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//等待10s
	    //1.先定位到按键1 com.android.calculator2:id/digit1
//	    dr.findElementById("com.android.calculator2:id/digit1").click();
	  //使用class属性定位按键1,但是由于所有的按键都是一个class name，就点了默认的del,一般不用  
	    
//	    dr.findElementByClassName("android.widget.Button").click();//默认为删除按钮
	  //通过text属性定位到元素 5
	    dr.findElementByAndroidUIAutomator("text(\"5\")").click();
	  //通过xpath定位页面元素
//	    dr.findElementByXPath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]").click();
	    Thread.sleep(5000);//等待5秒 需要抛出异常InterruptedException
	    //点击+  com.android.calculator2:id/plus
	    dr.findElementById("com.android.calculator2:id/plus").click();
	    //点击2  com.android.calculator2:id/digit2
	    dr.findElementById("com.android.calculator2:id/digit2").click();
	    
	    //点击= com.android.calculator2:id/equal
	    dr.findElementById("com.android.calculator2:id/equal").click();
	    
	    //定义预期结果
	    String yqval="7";
	    
	    //获取实际结果  	class  android.widget.EditText
	    String sjval=dr.findElementByClassName("android.widget.EditText").getAttribute("text");
	    System.out.println(sjval);
	    
	    if(yqval.equals(sjval)){
	    	System.out.println("加法运算实现是对的");
	    }else{
	    	System.out.println("加法运算实现是错误的");
	    }
	    
	}

}
