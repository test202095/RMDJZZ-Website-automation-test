#!/usr/bin/env python
# -*- coding:utf-8 -*-
#====#====#====#====
#Author:
#CreatDate:
#Version:
#====#====#====#====
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
import time
import os
# 一．今天的代码敲一遍
#鼠标拖动
dr=webdriver.Firefox()
dr.get('https://www.runoob.com/try/try.php?filename=jqueryui-api-droppable')
dr.switch_to_frame('iframeResult')#要进行操作的区域
a=dr.find_element_by_id('draggable')#要拖拽的目标元素
b=dr.find_element_by_id('droppable')#要拖入的目标元素
ActionChains(dr).drag_and_drop(a,b).perform()#把a拖入b
dr.quit()

#鼠标悬停
dr=webdriver.Firefox()
dr.get('http://www.baidu.com')
e=dr.find_element_by_link_text('更多')#定位元素更多
ActionChains(dr).move_to_element(e).perform()#让鼠标悬停在更多目标处
dr.quit()

#键盘的操作
dr=webdriver.Firefox()
dr.get('http://baidu.com')
e=dr.find_element_by_id('kw')#百度搜索框
e.send_keys('光遇')#输入光遇
e.send_keys(Keys.ENTER)#回车
e.send_keys(Keys.CONTROL,'a')#全选
e.send_keys(Keys.CONTROL,'x')#剪切
e.send_keys(Keys.CONTROL,'v')#粘贴
dr.quit()#关闭浏览器

#获取元素的属性值
dr=webdriver.Firefox()
dr.get('http://www.taobao.com')#打开淘宝
e=dr.find_element_by_xpath('//div[@class="search-combobox-input-wrap"]/input[1]')#获取路径上的元素
print(e.size)#打印元素的尺寸
print(e.id)#打印元素的属性信息
e.screenshot('./aa.png')#拍照并保存为png的格式
e2=dr.find_element_by_xpath('//ul[@class="service-bd"]/li[1]')
print(e2.text)#打印标签对之间的文字信息
dr.quit()

#浏览器的控制
dr=webdriver.Firefox()
dr.get('http://www.baidu.com')
dr.set_window_size(200,300)#修改窗口的大小
sleep(1)
dr.maximize_window()#窗口最大化
sleep(1)
dr.minimize_window()#窗口最小化
sleep(1)
e=dr.find_element_by_id('kw')
e.send_keys('光遇')#在百度搜索框内输入光遇
e.send_keys(Keys.ENTER)#enter
dr.back()#后退
dr.forward()#前进
sleep(2)
dr.get_screenshot_as_file('百度.png')#拍照
sleep(5)
dr.quit()

#下拉列表的操作
dr.get('file:///'+os.path.abspath('h01.html'))
e=dr.find_element_by_name('111')
time.sleep(3)
list=Select(e)#将获得的元素转换成列表
list.select_by_index(2)#根据下表选择元素
list.select_by_value('Audi')#根据value值选择
list.select_by_visible_text('Saab')#根据文本选择

#多窗口处理
dr=webdriver.Firefox()
dr.get('http://www.baidu.com')
dr.find_element_by_link_text('新闻').click()#第三个
sleep(2)
dr.find_element_by_link_text('地图').click()#第二个
sleep(2)
dr.find_element_by_link_text('视频').click()#最后打开的永远是第一个
sleep(2)
ee=dr.window_handles#获取所有的句柄
dr.switch_to_window(ee[2])#把地图窗口给浏览器
sleep(2)
dr.close()#关闭地图窗口
sleep(2)
dr.switch_to_window(ee[1])#把视频窗口给浏览器
dr.get_screenshot_as_file('cc.png')#拍照
sleep(2)
dr.quit()

#其他操作

dr=webdriver.Firefox()
dr.get('http://www.taobao.com')
e=dr.find_element_by_xpath('//div[@class="search-combobox-input-wrap"]/input[1]')
e.send_keys('软件测试')
e.submit()#回车
time.sleep(1)
print(dr.title)#获取页面标题
print(dr.current_url)#获取页面的地址
time.sleep(2)
dr.quit()


# 二．自动化登入电商系统后台,登入后截图
# 注意：网站,用户名和密码要通过代码获取
f=open('电商系统-阿里云环境.txt','r',encoding='GBK')#打开文本
list = f.read().split()#读所有行返回的是列表不带\n
# print(list)
f.close()
url=list[1]#链接地址
username=list[3]#用户名
password=list[5]#密码

dr=webdriver.Firefox()
dr.get(url)#打开网站
dr.find_element_by_id('username').send_keys(username)#输入用户名
sleep(1)
dr.find_element_by_id('password').send_keys(password)#输入密码
sleep(1)
dr.find_element_by_link_text('登 陆').click()#点击登录
sleep(5)
dr.get_screenshot_as_file('截图.png')#截图
sleep(2)
dr.quit()#关闭浏览器



# 三．自动化登入电商系统前台，把苹果加入到购物车
# 注意：网站要通过代码获取
url1=list[-1]
# print(url1)
dr=webdriver.Firefox()
dr.get(url1)#打开网站
sleep(1)
dr.find_element_by_name('kw').send_keys('苹果')#输入苹果
sleep(1)
dr.find_element_by_css_selector('button.fr').click()#点击搜索
sleep(1)
dr.find_element_by_link_text('苹果').click()#点击搜到的一条苹果信息
sleep(1)
dr.find_element_by_link_text('加入购物车').click()#点击加入购物车
# sleep(1)
# dr.switch_to.default_content()
sleep(1)
dr.find_element_by_xpath('//a[@id="cartbar"]/font').click()#点击我的购物车进行查看
sleep(2)
dr.quit()#关闭浏览器