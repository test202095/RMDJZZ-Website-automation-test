#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====今日代码====#====
#====#====clear()清除文本。 send_keys(value)模拟按键输入。 click()单击元素。例如按钮操作。====#====
#案例:淘宝首页搜索栏上面点击天猫,然后在搜索栏写'软件测试',之后再清除
# from selenium import webdriver
# import os
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('http://www.taobao.com')
# e=dr.find_element_by_xpath('//ul[@class="ks-switchable-nav"]/li[2]').click()
# e1=dr.find_element_by_id('q')
# e1.send_keys('软件测试')
# sleep(3)
# e1.clear()
# sleep(2)
# dr.quit()

#案例:在淘宝首页上的搜索栏中输入软件测试,然后按回车,之后打印本页的标题和url
# from selenium import webdriver
# import time
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# e=dr.find_element_by_id('q')
# e.send_keys('软件测试')
# time.sleep(2)
# e.submit() #回车
# print(dr.title)
# print(dr.current_url)
# time.sleep(2)
# dr.quit()

#案例:在百度搜索栏中,进行输入,删除,全选,剪切,粘贴功能
# from selenium import webdriver
# from time import sleep
# from selenium.webdriver.common.keys import Keys
# dr=webdriver.Firefox()
# dr.get("http://www.baidu.com")
# e=dr.find_element_by_id('kw')
# sleep(2)
# #往元素输入内容
# e.send_keys('乌龙茶')
# sleep(2)
# #删除一个字符
# e.send_keys(Keys.BACK_SPACE)
# sleep(2)
# #全选
# e.send_keys(Keys.CONTROL,'a')
# sleep(2)
# #剪切
# e.send_keys(Keys.CONTROL,'x')
# sleep(2)
# #粘贴
# e.send_keys(Keys.CONTROL,'v')
# sleep(2)
# #回车
# e.send_keys(Keys.ENTER)
# sleep(2)

#案例:进入淘宝,然后设置浏览器的大小400,500,然后最大,最小,再最大,转入到百度,然后后退,再前进
# from selenium import webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# sleep(2)
# #设置浏览器窗口的大小
# dr.set_window_size(400,500)
# sleep(2)
# #让浏览器最大化
# dr.maximize_window()
# sleep(2)
# #让浏览器最小化
# dr.minimize_window()
# sleep(2)
# #让浏览器最大化
# dr.maximize_window()
# sleep(2)
#
# #转到别的页面
# dr.get('https://www.baidu.com')
# sleep(2)
# #后退到淘宝
# dr.back()
# sleep(2)
# #前进到百度
# dr.forward()
# sleep(2)
# dr.quit()

# #案例:打开淘宝,刷新页面,点击天猫超市,然后截图,然后关闭淘宝首页,最后退出浏览器
# from selenium import webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# sleep(3)
# #刷新
# dr.refresh()
# sleep(3)
# #点击天猫超市
# dr.find_element_by_link_text('天猫超市').click()
# sleep(3)
# #截图
# dr.get_screenshot_as_file('2.png')
# #关闭最前的窗口
# dr.close()
# sleep(5)
# #关闭浏览器
# dr.quit()

#案例：打开百度首页，点击新闻，点击地图，点击视频，然后关闭地图页面,截取视频页面的图像，退出浏览器
# from selenium import webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# sleep(3)
# dr.find_element_by_link_text('新闻').click()
# sleep(3)
# dr.find_element_by_link_text('地图').click()
# sleep(3)
# dr.find_element_by_link_text('视频').click()
# sleep(3)
# hs=dr.window_handles#获取浏览器中所有窗口的句柄
# dr.switch_to.window(hs[2])#把地图绑定给浏览器
# sleep(2)
# dr.close()
# sleep(1)
# dr.switch_to.window(hs[1])#把视频绑定给浏览器
# dr.get_screenshot_as_file('4.png')
# sleep(2)
# dr.quit()

