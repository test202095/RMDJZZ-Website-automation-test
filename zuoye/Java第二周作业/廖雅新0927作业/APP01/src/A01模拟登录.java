import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;;

public class A01模拟登录 {
	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		// TODO 自动生成的方法存根
		//1.配置appium参数
		DesiredCapabilities des =new DesiredCapabilities();
		des.setCapability("platformName", "android");//平台名称
		des.setCapability("deviceName", "Android Emulator");//设备名称
		des.setCapability("paltformVersion", "7.1.2");//平台版本号
		des.setCapability("noReset", true);//默认不重装
		des.setCapability("appPackage", "com.tencent.qqlite");//设置包名
		des.setCapability("appActivity", "com.tencent.mobileqq.activity.SplashActivity");//设置主页名
		
		//2.创建appium对象
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
		dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);//暂停
		
		dr.findElementById("com.tencent.qqlite:id/btn_login").click();//点击登录按钮
		
		dr.findElementsByAccessibilityId("请输入QQ号码或手机或邮箱").clear();//先清除
		dr.findElementByAccessibilityId("请输入QQ号码或手机或邮箱").click();//点击
		dr.findElementByAccessibilityId("请输入QQ号码或手机或邮箱").sendKeys(new String[] {"1831207437"});//模拟键入
		
		dr.findElementById("com.tencent.qqlite:id/password").clear();//清除密码框
		dr.findElementById("com.tencent.qqlite:id/password").click();//点击
		dr.findElementById("com.tencent.qqlite:id/password").sendKeys(new String[] {"liaoyaxin12"});//模拟键入

		dr.findElementById("com.tencent.qqlite:id/login").click();//点击登录按钮
		
//		dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);//暂停
		
//		//模拟退出操作
//		dr.findElementById("com.tencent.qqlite:id/ll_container").click();//点击我的
//		
//		dr.findElementById("com.tencent.qqlite:id/qqSettingSetting").click();//点击设置
//		
//		dr.findElementById("com.tencent.qqlite:id/qqSettingSetting").click();//点击账号管理
//		
//		dr.findElementById("com.tencent.qqlite:id/logoutBtn").click();//点击退出当前账号
//		
//		dr.findElementById("com.tencent.qqlite:id/dialogRightBtn").click();//点击确定退出按钮
		
	}

}
