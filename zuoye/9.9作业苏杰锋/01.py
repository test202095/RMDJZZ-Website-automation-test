#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====

from selenium import webdriver
import time
import os
'''
dr=webdriver.Firefox()
dr.get('https://www.baidu.com')
e=dr.find_element_by_id("kw")
#在元素中输入文字
e.send_keys('软件测试')
time.sleep(2)
#清空
e.clear()
time.sleep(2)
dr.quit()

e=dr.find_element_by_link_text('新闻')
#点击元素
e.click()
time.sleep(2)
dr.quit()


#案例:淘宝首页搜索栏上面点击天猫,然后在搜索栏写'软件测试',之后再清除
dr=webdriver.Firefox()
dr.get('http://www.taobao.com')
e=dr.find_element_by_xpath('//ul[@class="ks-switchable-nav"]/li[2]')
time.sleep(2)
e.click()
ee=dr.find_element_by_id('q')
ee.send_keys('软件测试')
time.sleep(2)
ee.clear()
time.sleep(3)
dr.quit()




dr=webdriver.Firefox()
dr.get("file:///"+os.path.abspath('h01.html'))
e=dr.find_element_by_id('11')
print(e.get_attribute('id'))
print(e.get_attribute('lala'))
print(e.get_property('id'))
print(e.get_property('lala'))   #自定义属性会返回None


dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('h01.html'))
e=dr.find_element_by_id('11')
print(e.text)#获取标签对之间的文字
ee=dr.find_element_by_id('maker2')
ee2=dr.find_element_by_name('username')
print(ee.get_attribute('name'))
print(ee.size)
print(ee.id)    #获取的是元素的属性信息，id不是属性id的值
ee.screenshot('1.png')



dr=webdriver.Firefox()
dr.get("file:///"+os.path.abspath('h02.html'))
e=dr.find_element_by_name('c1')
ee=dr.find_element_by_name('c3')
print(e.is_selected())  #判断元素是否被选择
print(ee.is_selected())

e2=dr.find_element_by_name('c88')
print(ee.is_enabled())  #是否能被用
print(e2.is_displayed())    #是否能显示


dr=webdriver.Firefox()
dr.get('https://www.baidu.com')
e=dr.find_element_by_id('kw')
e.send_keys('软件测试')
time.sleep(2)
e.submit()#回车
print(dr.title)#获取页面标题
print(dr.current_url)#获取页面的地址
time.sleep(2)
dr.quit()


#案例:在淘宝首页上的搜索栏中输入软件测试,然后按回车,之后打印本页的标题和url
dr=webdriver.Firefox()
dr.get('http://www.taobao.com')
e=dr.find_element_by_id('q')
e.send_keys('软件测试')
time.sleep(3)
e.submit()
time.sleep(4)
print(dr.title)
print(dr.current_url)
time.sleep(3)
dr.quit()


from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
import os

# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_tag_name('body')
# ActionChains(dr).context_click(e).perform()
# time.sleep(5)
# dr.quit()

dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('h03.html'))
e=dr.find_element_by_xpath('//input[@value="按键2"]')
time.sleep(3)
ActionChains(dr).double_click(e).perform()


from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time

dr=webdriver.Firefox()
url='http://www.runoob.com/try/try.php?filename=jqueryui-api-droppable'
dr.get(url)
#切换到目标元素的窗口iframeResult
dr.switch_to.frame('iframeResult')
#确定要拖拽的目标元素
s=dr.find_element_by_id('draggable')
#要拖入的目标元素
e=dr.find_element_by_id('droppable')
#执行拖拽动作
ActionChains(dr).drag_and_drop(s,e).perform()


from selenium import webdriver
import os
from selenium.webdriver.support.select import Select
import time
dr=webdriver.Firefox()
dr.get("file:///"+os.path.abspath('h04.html'))
e=dr.find_element_by_name('sel')
time.sleep(3)
#把元素转换为列表
listobj=Select(e)
#listobj.select_by_index(0)
#listobj.select_by_value('aaaa')
listobj.select_by_visible_text('北京烤鸭')
time.sleep(3)
dr.quit()


from selenium import webdriver
from time import sleep
from selenium.webdriver.common.keys import Keys
import os

dr=webdriver.Firefox()
dr.get("file:///"+os.path.abspath('h05.html'))
e=dr.find_element_by_name('文本')
sleep(2)
e.send_keys('maker')
sleep(2)
e.send_keys(Keys.BACK_SPACE)
sleep(2)
e.send_keys(Keys.CONTROL,'a')
sleep(2)
e.send_keys(Keys.CONTROL,'X')
sleep(2)
e.send_keys(Keys.CONTROL,'V')
sleep(2)
dr.quit()


#案例:在百度搜索栏中,进行输入,删除,全选,剪切,粘贴功能，然后回车
dr=webdriver.Firefox()
dr.get("https://www.baidu.com")
e=dr.find_element_by_id('kw')
sleep(2)
e.send_keys('软件测试')
sleep(2)
e.send_keys(Keys.BACK_SPACE)
sleep(2)
e.send_keys(Keys.CONTROL,'a')
sleep(2)
e.send_keys(Keys.CONTROL,'x')
sleep(2)
e.send_keys(Keys.CONTROL,'v')
sleep(2)
e.send_keys(Keys.ENTER)#回车


from selenium import webdriver
from time import sleep
from selenium.webdriver.common.keys import Keys
dr=webdriver.Firefox()
dr.get('http://www.baidu.com')
sleep(2)
dr.set_window_size(400,500)
sleep(2)
dr.minimize_window()
sleep(2)
dr.maximize_window()
sleep(2)
dr.get('http://taobao.com')
sleep(2)
dr.back()
sleep(2)
dr.forward()
sleep(2)

dr.quit()

#案例:进入淘宝,然后设置浏览器的大小400,500,然后最大,最小,再最大,转入到百度,然后后退,再前进
dr=webdriver.Firefox()
dr.get('https://www.taobao.com')
sleep(2)
#设置浏览器窗口的大小
dr.set_window_size(400,500)
sleep(2)
#让浏览器最大化
dr.maximize_window()
sleep(2)
#让浏览器最小化
dr.minimize_window()
sleep(2)
#让浏览器最大化
dr.maximize_window()
sleep(2)

#转到别的页面
dr.get('https://www.baidu.com')
sleep(2)
#后退到淘宝
dr.back()
sleep(2)
#前进到百度
dr.forward()
sleep(2)
dr.quit()


from selenium import webdriver
from time import sleep

# dr = webdriver.Firefox()
# dr.get('https://www.taobao.com')
# sleep(3)
# dr.refresh()
# sleep(3)
# dr.get_screenshot_as_file('2.png')
# sleep(3)
# dr.find_element_by_tag_name('聚划算').click()
# sleep(3)
# dr.close()
# sleep(3)
#
# dr.quit()

#案例:打开淘宝,刷新页面,点击天猫超市,然后截图,然后关闭淘宝首页,最后退出浏览器

dr=webdriver.Firefox()
dr.get('https://www.taobao.com')
sleep(3)
#刷新
dr.refresh()
sleep(3)
#点击天猫超市
dr.find_element_by_link_text('天猫超市').click()
sleep(3)
hs=dr.window_handles
dr.switch_to.window(hs[1])
sleep(1)
#截图
dr.get_screenshot_as_file('2.png')
#关闭最前的窗口
dr.close()
sleep(5)
#关闭浏览器
dr.quit()


from selenium import webdriver
from time import sleep

# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# #获取淘宝首页的句柄
# h1=dr.current_window_handle
# print(h1)
# sleep(3)
# dr.find_element_by_link_text('聚划算').click()
# h2=dr.current_window_handle#获取的是淘宝首页的句柄
# print(h2)
# sleep(3)
# dr.find_element_by_link_text('天猫超市').click()
# h3=dr.current_window_handle#获取的是淘宝首页的句柄
# print(h3)
# sleep(3)
#
# hs=dr.window_handles#获取浏览器中所有窗口的句柄
# print(type(hs))
# #把天猫超市窗口绑定给浏览器
# dr.switch_to.window(hs[1])
# sleep(2)
# dr.get_screenshot_as_file('3.png')
# sleep(1)
# dr.close()


#案例：打开百度首页，点击新闻，点击地图，点击视频，然后关闭地图页面,截取视频页面的图像，退出浏览器
dr=webdriver.Firefox()
dr.get('http://www.baidu.com')
sleep(3)
dr.find_element_by_link_text('新闻').click()
sleep(3)
dr.find_element_by_link_text('地图').click()
sleep(3)
dr.find_element_by_link_text('视频').click()

hs=dr.window_handles
dr.switch_to.window(hs[2])
sleep(3)
dr.close()
sleep(2)

dr.switch_to.window(hs[1])
dr.get_screenshot_as_file('3.png')
sleep(2)

dr.quit()
'''


