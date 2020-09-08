#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====


#通过获取多个元素的方式获取元素，分别用id,name,链接文字，子链接文字，标签名，class,路径，css,
# 在电商网上至少各自找2个以上元素，并打印出其他属性，这里一个.py文件
from selenium import webdriver
''''''

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('logined-userbar-tpl')
print(e.get_attribute('type'))
dr.quit()   #text/template

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('top-userbar')
print(e.get_attribute('class'))     #topper-userbar fl
dr.quit()


dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_name('description')
print(e.get_attribute('content'))
dr.quit()   #电商平台

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_name('kw')
print(e.get_attribute('class'))
dr.quit()   #f1

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_link_text('首页')
print(e.get_attribute('href'))
dr.quit()   #http://39.96.181.61/qftest-ds

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_link_text('臭豆腐')
print(e.get_attribute('href'))
dr.quit()   #http://39.96.181.61/qftest-ds/category/index.html?id=128

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_partial_link_text('免费注册')
print(e.get_attribute('href'))
dr.quit()   #http://39.96.181.61/qftest-ds/user/register.html



