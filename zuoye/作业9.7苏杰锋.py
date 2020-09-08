#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====

# 1.简述自动化测试流程？
#1.自动化测试决定  2.测试工具获取   3.自动化测试引入
#4.制定测试计划   5.测试执行与管理   6.测试审评和评估

# 2.简述自动化测试的优势和局限性？
# 优势：回归测试
# 更多更频繁的测试
# 手工测试无法实现的工作
# 跨平台产品的测试
# 重复性较强的操作
# 局限性：软件版本不稳定
# 涉及与物理设备交换的测试
# 测试结果较容易通过人工判断的测试

from selenium import webdriver
import os
'''
# 3.请在电商网站上找10个元素,用id和name方式获取,打印元素除id和name外的其他属性,提交到git上
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('top-userbar')
print(e.get_attribute('class'))     #topper-userbar fl
dr.quit()   

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('logined-userbar-tpl')
print(e.get_attribute('type'))
dr.quit()   #text/template

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('catebar')
print(e.get_attribute('class'))
dr.quit()   

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('cartbar')
print(e.get_attribute('href'))
dr.quit()   #http://39.96.181.61/qftest-ds/cart/index.html

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_name('kw')
print(e.get_attribute('type'))
dr.quit()   #text

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_name('verydows-baseurl')
print(e.get_attribute('content'))
dr.quit()   #http://39.96.181.61/qftest-ds

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_name('keywords')
print(e.get_attribute('content'))
dr.quit()   #子商务系统

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
'''











# 4.电商网站上找5个超链接元素,通过超链接文字获取元素,打印链接地址,提交到git上
'''
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
e=dr.find_element_by_link_text('登陆')
print(e.get_attribute('href'))
dr.quit()   #http://39.96.181.61/qftest-ds/user/login.html


dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_link_text('免费注册')
print(e.get_attribute('href'))
dr.quit()   #http://39.96.181.61/qftest-ds/user/register.html

dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_link_text('中国 wan')
print(e.get_attribute('href'))
dr.quit()   #http://39.96.181.61/qftest-ds/%E5%BC%80%E5%BF%83L%20%20%20%20%20%20%20%20%20%20ll56_fds
'''

