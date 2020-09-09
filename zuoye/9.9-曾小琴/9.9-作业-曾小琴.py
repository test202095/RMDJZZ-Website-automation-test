#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 一．	自动化登入电商系统后台,登入后截图   注意：网站,用户名和密码要通过代码获取
# f=open('zl.txt','r')
# list=f.read().splitlines()#读所有的行,返回的是列表,不带\n
# print(list)
# from selenium import webdriver
# from time import sleep
# dr=webdriver.Firefox()
# dr.get(list[1])
# e=dr.find_element_by_xpath('//input[@id="username"][@name="username"]')
# e.send_keys(list[4])
# e1=dr.find_element_by_xpath('//input[@id="password"][@name="password"]')
# e1.send_keys(list[7])
# e2=dr.find_element_by_link_text('登 陆').click()
# sleep(5)
# dr.get_screenshot_as_file('9.9.png')

# 二．	自动化登入电商系统前台，把苹果加入到购物车  注意：网站要通过代码获取
f=open('zl.txt','r')
list=f.read().splitlines()#读所有的行,返回的是列表,不带\n
print(list)
from selenium import webdriver
from time import sleep
dr=webdriver.Firefox()
dr.get(list[-1])
e=dr.find_element_by_xpath('//input[@name="kw"][@class="fl"]')
e.send_keys('苹果')
sleep(3)
# e.submit()
w1=dr.find_element_by_xpath('//*[@class="fr"][@type="submit"]').click() #点击搜索
sleep(3)
# e1=dr.find_element_by_xpath('//div[@class="gli.cut"]/ul/li/div[@class="im"]/h3/a').click()   #点击苹果的链接
# sleep(3)
w2=dr.find_element_by_xpath('//div[@class="im"]/a/img').click()   #点击苹果的链接
sleep(3)
dr.find_element_by_xpath('//div[@class="buy mt30"]/a[@class="add-cart icon"]').click() #点击加入购物车
sleep(3)
dr.get_screenshot_as_file('04.png')
dr.quit()

