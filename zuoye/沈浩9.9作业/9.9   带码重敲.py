#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# from selenium import webdriver
# from selenium.webdriver.common.keys import Keys
# from time import  sleep
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# a=dr.find_element_by_id('kw')
# a.send_keys("别克")
# sleep(5)
# a.clear()
# sleep(5)
# a.send_keys('大众')
# sleep(5)
# a.click()
# sleep(5)
# a.send_keys(Keys.ENTER)
# dr.quit()

#案例:淘宝首页搜索栏上面点击天猫,然后在搜索栏写'软件测试',之后再清除
# from selenium import webdriver
# from selenium.webdriver.common.keys import Keys
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# a=dr.find_element_by_partial_link_text('天猫')
# a1=dr.find_element_by_name('q')
# a1.send_keys('软件测试')
# a1.clear()
# a1.send_keys(Keys.ENTER)
# sleep(5)
# dr.quit()
# 获取元素标签的属性值
# get_attribute(属性名)： 获得属性值。
# get_property(属性名):获得属性值。自定义属性不能获取
# from selenium import  webdriver
# from selenium.webdriver.common.keys import Keys
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html/h1.html'))
# a=dr.find_element_by_id("1111")
# print(a.get_attribute('name'))
# print(a.get_attribute('lala'))
# print(a.get_property('name'))
# print(a.get_property('lala'))
# dr.quit()
# 获取元素的属性信息
# • text。• 获取元素标签对之间间的文本值
# • size。• 获取元素的尺寸大小
# • id。• Selenium内部的一个元素属性，用于判断两个元素是否是相同的元素。
# • screenshot()方法。
# • 给元素一个快照，并保存为PNG格式的图片。
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from time import sleep
import  os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('03HTML/02HTML.html'))
# a=dr.find_element_by_id('maker')
# print(a.text)
# ee2=dr.find_element_by_name('username')
# print(a.get_attribute('name'))
# print(a.size)
# print(a.id)#获取的是元素的属性信息,id,不是属性id的值
# print(ee2.id)
# ee2.screenshot('./aa.png')
# dr.quit()
# 获取元素的基本状态信息
# • is_enabled()方法。--用于判断元素的可用性。  如果元素属性中添加了disabled,表示该元素不可用
# • is_selected()方法。---用于判断复选框等元素是否处于选择状态
# is_displayed()： 检查该元素是否用户可见。如果给标签添加了隐藏样式:p{display:none;}该元素会被隐藏
# dr=webdriver.Firefox()
# dr.get("file:///"+os.path.abspath('03HTML/04HTML.html'))
# e=dr.find_element_by_name('c1')
# ee=dr.find_element_by_name('c3')
# print(e.is_selected())
# print(ee.is_selected())
#
# e2=dr.find_element_by_name('c88')
# print(ee.is_enabled())
# print(e2.is_displayed())
# 其他操作
# submit()：用于提交表单。 例如， 在搜索框输入关键字之后的“回车” 操作， 就可以通过该方法模拟。
# title：用于获得当前页面的标题。
# current_url：用户获得当前页面的URL。

#案例:在淘宝首页上的搜索栏中输入软件测试,然后按回车,之后打印本页的标题和url
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# a=dr.find_element_by_name('q')
# a.send_keys('软件测试')
# a.submit()
# print(dr.title)
# print(dr.current_url)
# dr.quit()
from  selenium.webdriver.common.action_chains import ActionChains
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# a=dr.find_element_by_tag_name('body')
# ActionChains(dr).context_click(a).perform()

# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('03HTML/06HTML.html'))
# e=dr.find_element_by_xpath('//input[@value="按键2"]')
# ActionChains(dr).double_click(e).perform()
# sleep(5)
# dr.quit()
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_link_text('更多')
# ActionChains(dr).move_to_element(e).perform()
# sleep(5)
# dr.quit()
# 鼠标拖动
# dr=webdriver.Firefox()
# a='http://www.runoob.com/try/try.php?filename=jqueryui-api-droppable'
# dr.get(a)
# dr.switch_to.frame('iframeResult')
# b1=dr.find_element_by_id('draggable')
# c2=dr.find_element_by_id('droppable')
# ActionChains(dr).drag_and_drop(b1,c2).perform()
# sleep(2)
# dr.quit()
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html/h1.html'))
# e = dr.find_element_by_name('sel')
# sleep(2)
# listobj=Select(e)
# # listobj.select_by_index(3)
# # listobj.select_by_value('123')
# listobj.select_by_visible_text('烤羊肉')
# sleep(2)
# dr.quit()
# from selenium import webdriver
# from  time import sleep
# from selenium.webdriver.common.keys import Keys
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# a=dr.find_element_by_id('kw')
# sleep(2)
# a.send_keys('软件测试')
# sleep(1)
# a.send_keys(Keys.BACK_SPACE)
# sleep(1)
# a.send_keys(Keys.CONTROL,'a')
# sleep(1)
# a.send_keys(Keys.CONTROL,'x')
# sleep(2)
# a.send_keys(Keys.CONTROL,'v')
# sleep(1)
# a.send_keys(Keys.ENTER)
# sleep(3)
# dr.quit()
# from selenium import webdriver
# from time import sleep
# from selenium.webdriver.common.keys import Keys
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# sleep(2)
# dr.set_window_size(400,500)#浏览器大小
# sleep(2)
# dr.maximize_window()#最大化浏览器窗口
# sleep(2)
# dr.minimize_window()#最小化浏览器窗口
# sleep(2)
# dr.maximize_window()#最大化浏览器窗口
# sleep(2)
# dr.get('https://www.baidu.com')#前往百度
# sleep(2)
# dr.get('https://www.jd.com/?')#前往京东
# sleep(2)
# dr.forward()#上一个页面
# sleep(2)
# dr.back()#后退一个页面
# sleep(2)
# dr.quit()#退出浏览器
from selenium import webdriver
from time import sleep
dr=webdriver.Firefox()
dr.get('https://www.baidu.com')

sleep(3)
dr.find_element_by_link_text('新闻').click()
sleep(3)
dr.find_element_by_link_text('地图').click()
sleep(3)
dr.find_element_by_link_text('视频').click()
a3=dr.current_window_handle
sleep(3)
a4=dr.window_handles
dr.switch_to.window(a4[2])
sleep(3)
dr.close()
sleep(3)
dr.switch_to.window(a4[1])
sleep(3)
# dr.get_screenshot_as_file('5.png')
dr.quit()
