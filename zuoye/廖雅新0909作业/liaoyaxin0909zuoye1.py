#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
#页面操作介绍
'''
1.鼠标键盘
clear()： 清除文本。
send_keys (value)： 模拟按键输入。
click()： 单击元素。例如按钮操作。
'''
# from selenium import  webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_id('kw')#获取输入框元素
# e.send_keys('软件测试')
# sleep(2)
# f=dr.find_element_by_xpath('//input[@value="百度一下"]')
# f.click()#点击百度一下
# sleep(2)
# e.clear()#清除文本
# sleep(2)
# dr.quit()


#案例:淘宝首页搜索栏上面点击天猫,然后在搜索栏写'软件测试',之后再清除
# from selenium import  webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# sleep(2)
# dr.find_element_by_xpath('//ul[@class="ks-switchable-nav"]/li[2]').click()#通过路径获取天猫并点击
# sleep(2)
# e=dr.find_element_by_id('q')#获得输入框元素
# e.send_keys('软件测试')
# sleep(2)
# dr.quit()

# 2.获取元素标签的属性值
# get_attribute(属性名)： 获得属性值。
# get_property(属性名):获得属性值。自定义属性不能获取
# from selenium import webdriver
# from time import  sleep
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html03/01.html'))
# e=dr.find_element_by_id('p1')
# print(e.get_attribute('name'))
# print(e.get_property('name'))
# print(e.get_attribute('ppp'))
# print(e.get_property('ppp'))#此函数无法作用于自定义的属性
# dr.quit()


# 3.获取元素的属性信息
# • text。• 获取元素标签对之间间的文本值
# • size。• 获取元素的尺寸大小
# • id。• Selenium内部的一个元素属性，用于判断两个元素是否是相同的元素。
# • screenshot()方法。
# • 给元素一个快照，并保存为PNG格式的图片。
# from selenium import  webdriver
# from time import  sleep
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html03/01.html'))
# e=dr.find_element_by_id('p1')
# print(e.size)#尺寸大小
# print(e.text)#标签对之间的值
# print(e.id)
# e.screenshot('1.png')#截e元素的图并保存为1.png
# dr.quit()

# 4.获取元素的基本状态信息
# • is_enabled()方法。--用于判断元素的可用性。  如果元素属性中添加了disabled,表示该元素不可用
# • is_selected()方法。---用于判断复选框等元素是否处于选择状态
# is_displayed()： 检查该元素是否用户可见。如果给标签添加了隐藏样式:p{display:none;}该元素会被隐藏
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html03/01.html'))
# e=dr.find_element_by_id('p2')
# print(e.is_displayed())#查询是否用户可见，可见为True
# f=dr.find_element_by_name('sporting')
# print(f.is_selected())#查询复选框是否被选中，选中返回True
# g=dr.find_element_by_name('other')
# print(g.is_enabled())#判断元素是否可用，disabled表示不可用返回False
# dr.quit()

# 5.其他操作
# submit()：用于提交表单。 例如， 在搜索框输入关键字之后的“回车” 操作， 就可以通过该方法模拟。
# title：用于获得当前页面的标题。
# current_url：用户获得当前页面的URL。
# from selenium import  webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_id('kw')
# e.send_keys('Testing')
# e.submit()#回车
# print(dr.title)#获取当前页面的标题
# print(dr.current_url)#获取当前页面的url
# sleep(2)
# dr.quit()

#案例:在淘宝首页上的搜索栏中输入软件测试,然后按回车,之后打印本页的标题和url
# from selenium import  webdriver
# from time import  sleep
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# e=dr.find_element_by_id('q')
# e.send_keys('软件测试')
# e.submit()
# print(dr.title)
# print(dr.current_url)
# sleep(2)
# dr.quit()

# 鼠标操作(重点)
'''
需要引入
from selenium.webdriver.common.action_chains import ActionChains
格式:
ActionChains(浏览器).context_click(元素).perform()
1）右键单击:context_click()
2）双击:double_click()

3）鼠标悬停:move_to_element()

4）拖动:drag_and_drop()
url = "http://www.runoob.com/try/try.php?filename=jqueryui-api-droppable"
'''
# from selenium.webdriver.common.action_chains import ActionChains
# from selenium import webdriver
# import time
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html03/02.html'))
# e=dr.find_element_by_xpath('//input[@value="按键1"]')
# ActionChains(dr).context_click(e).perform()#右键单击
# f=dr.find_element_by_xpath('//input[@value="按键2"]')
# ActionChains(dr).double_click(e).perform()#双击 perform()执行
#----------------3---------------
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_tag_name('span')
# ActionChains(dr).move_to_element(e).perform()#鼠标悬停
#-----------4------------
# dr=webdriver.Firefox()
# dr.get('http://www.runoob.com/try/try.php?filename=jqueryui-api-droppable')
# dr.switch_to.frame('iframeResult')#切换到该iframe下
# e=dr.find_element_by_id('draggable')#要拖动的元素
# f=dr.find_element_by_id('droppable')#要拖动到的目的元素
# ActionChains(dr).drag_and_drop(e,f).perform()#将e拖动到f上
# time.sleep(2)
# dr.quit()

#下拉列表的操作(重点)
'''
1.下拉列表是非常常见的页面元素。是一种特殊的页面元素，定位和其他元素没区
别，但是其操作不其他元素不同。
2.需要导入包
from selenium.webdriver.support.select import Select
3.选择下列列表中的元素有三种方式
• select_by_index() #索引
• select_by_visible_text()#文本
• select_by_value()#value属性的值
'''
# from selenium import webdriver
# from selenium.webdriver.support.select import Select
# from  time import sleep
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html03/03.html'))
# e=dr.find_element_by_name('sel')
# mylist=Select(e)#把元素转换为列表
# # mylist.select_by_index(0)#默认换成下标为0 的第一个
# # mylist.select_by_value('beijing')#默认换成value值为"beijing"的
# mylist.select_by_visible_text('烤羊肉')#默认选择换成标签对之间的值为烤羊肉的
# sleep(2)
# dr.quit()


# 键盘操作(重点)
'''
Keys()类提供了键盘上几乎所有按键的方法。
• send_keys()方法可以用来模拟键盘输入。
• 还可以用它来输入键盘上的按键， 甚至是组合键， 如 Ctrl+A、 Ctrl+C 等。
• 在使用键盘按键方法前需要先导入 keys 类。
• from selenium.webdriver.common.keys import Keys
常用的键盘操作:
• send_keys(Keys.BACK_SPACE) 删除键（BackSpace） 
• send_keys(Keys.TAB) 制表键(Tab)(不常用)
• send_keys(Keys.ESCAPE) esc键（Esc） 
• send_keys(Keys.ENTER) 回车键（Enter） 
• send_keys(Keys.CONTROL,‘a’) 全选（Ctrl+A） 
• send_keys(Keys.CONTROL,‘c’) 复制（Ctrl+C） 
• send_keys(Keys.CONTROL,‘x’) 剪切（Ctrl+X） 
• send_keys(Keys.CONTROL,‘v’) 粘贴（Ctrl+V） 
'''
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from time import sleep
# dr=webdriver.Firefox()
# dr.get("https://www.taobao.com")
# sleep(2)
# dr.find_element_by_xpath('//ul[@class="ks-switchable-nav"]/li[2]').click()#通过路径返回店铺的元素，点击
# e=dr.find_element_by_id('q')
# e.send_keys("软件测试1")
# sleep(1)
# e.send_keys(Keys.CONTROL,'a')#全选
# sleep(1)
# e.send_keys(Keys.BACK_SPACE)#删除元素（只删除一次）
# sleep(1)
# e.send_keys('nihao')
# e.send_keys(Keys.CONTROL,'a')
# sleep(2)
# e.send_keys(Keys.CONTROL,'x')
# sleep(2)
# e.send_keys(Keys.CONTROL,'v')
# e.send_keys(Keys.ENTER)
# sleep(2)
# dr.quit()

#案例:在百度搜索栏中,进行输入,删除,全选,剪切,粘贴功能
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_id('kw')
# e.send_keys('Testing1')
# sleep(2)
# e.send_keys(Keys.BACK_SPACE)#删除一个  1
# sleep(2)
# e.send_keys(Keys.CONTROL,'a')#全选
# sleep(2)
# e.send_keys(Keys.CONTROL,'x')#剪切
# sleep(2)
# e.send_keys(Keys.CONTROL,'v')#复制
# sleep(2)
# e.send_keys(Keys.ENTER)#回车
# sleep(2)
# dr.quit()


# 浏览器控制(重点)
'''
• 浏览器窗口大小的控制
dr.set_window_size(宽,高)
dr.minimize_window():最大化显示
dr.minimize_window():最小化显示，在最小化情况下，也可以进行元素定位及操作
• 页面前进与后退
back()和forward()方法来模拟后退和前进按钮
'''
# from selenium import webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('http://www.baidu.com')
# dr.set_window_size(200,400)#设置窗口的大小 宽=200  高=400
# sleep(2)
# dr.minimize_window()#最小化
# sleep(2)
# dr.maximize_window()#最大化
# sleep(2)
# dr.get("https://www.taobao.com")#转到淘宝
# sleep(1)
# dr.back()#后退
# sleep(1)
# dr.forward()#前进
# sleep(2)
# dr.quit()

#案例:进入淘宝,然后设置浏览器的大小400,500,然后最大,最小,再最大,转入到百度,然后后退,再前进
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# dr.set_window_size(400,500)#设置浏览器窗口大小宽400 高500
# sleep(2)
# dr.maximize_window()#最大化
# sleep(2)
# dr.minimize_window()#最小化
# sleep(2)
# dr.maximize_window()#最大化
# sleep(1)
# dr.get('http://www.baidu.com')#转到百度
# sleep(1)
# dr.back()
# sleep(2)
# dr.forward()
# sleep(2)
# dr.quit()


'''
• 页面刷新
driver.refresh()
• 针对浏览器窗口页面截图
get_screenshot_as_file(保存图片的位置)
• 浏览窗口的关闭和浏览器退出
使用quit()方法，其含义为退出相关的驱动程序和关闭所有窗口。
使用close()方法,关闭单个窗口,关闭最前面的窗口
'''
# dr=webdriver.Firefox()
# dr.get('http://www.baidu.com')
# sleep(2)
# dr.refresh()#刷新页面
# sleep(2)
# dr.find_element_by_link_text('新闻').click()#点击
# sleep(2)
# dr.close()#关闭最前面的窗口 因为dr是http://www.baidu.com
# sleep(2)
# dr.quit()
#案例:打开淘宝,刷新页面,点击天猫超市,然后截图,然后关闭淘宝首页,最后退出浏览器
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# sleep(2)
# dr.refresh()
# sleep(2)
# dr.find_element_by_link_text('天猫超市').click()#点击天猫超市 跳转
# sleep(2)
# dr.get_screenshot_as_file('2.png')
# sleep(2)
# dr.close()
# sleep(2)
# dr.quit()


# 多窗口处理(重点)
'''
多窗口的意思是一个浏览器中打开了多个窗口

• 浏览器标签页的切换
• 浏览器的标签页在应用中一般称为页面句柄（handle）。
• 获取当前窗口句柄：driver.current_window_handle
• 获取浏览器所有句柄：driver.window_handles
• 切换到指定的浏览器窗口：driver.switch_to.window(handle)
'''
from selenium import webdriver
from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# sleep(1)
# dr.find_element_by_link_text('天猫').click()
# sleep(1)
# dr.find_element_by_link_text('聚划算').click()
# sleep(1)
# dr.find_element_by_link_text('天猫超市').click()
# sleep(1)
# print(dr.current_window_handle)#淘宝首页的句柄
# hs=dr.window_handles#所有的句柄
#
# dr.switch_to.window(hs[1])
# dr.close()#关闭天猫超市窗口
# sleep(1)
# dr.quit()

# 案例：打开百度首页，点击新闻，点击地图，点击视频，然后关闭地图页面,截取视频页面的图像，退出浏览器
dr=webdriver.Firefox()
dr.get('https://www.baidu.com')
dr.find_element_by_link_text('新闻').click()
sleep(2)
dr.find_element_by_link_text('地图').click()
sleep(2)
dr.find_element_by_link_text('视频').click()
sleep(2)
h=dr.current_window_handle#把首页的句柄存起来
# print(h)
hs=dr.window_handles
dr.switch_to.window(hs[2])
dr.close()
sleep(2)
# print(dr.current_url)

dr.switch_to.window(hs[1])
sleep(2)
dr.get_screenshot_as_file('3.png')
sleep(2)
dr.quit()









