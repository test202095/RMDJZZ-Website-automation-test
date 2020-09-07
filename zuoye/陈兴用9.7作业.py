#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver

# 1.简述自动化测试流程？
# 自动测试决定----测试工具获取----自动化测试引入----制定测试计划----测试执行与管理----测试审评和评估

# 2.简述自动化测试的优势和局限性？
# 优势：可重复，可程序化，可靠，提高测试的效率
#局限性：如果代码错了就无法找出错误，如果代码不对，
# 就无法得出准确结果;如果被测试的程序界面修改了，代码也不能正常运行没有错误联想功能


# 3.请在电商网站上找10个元素,用id和name方式获取,打印元素除id和name外的其他属性,提交到git上
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('top-userbar')
print(e.get_attribute('class'))
dr.quit()
#1

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('logined-userbar-tpl')
print(e.get_attribute('type'))
dr.quit()
# #2

#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('unlogined-userbar-tpl')
print(e.get_attribute('type'))
dr.quit()
#3
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('cartbar')
print(e.get_attribute('href'))
dr.quit()
#4
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_id('190')
print(e.get_attribute('href'))
dr.quit()
#5
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_name('verydows-baseurl')
print(e.get_attribute('content'))
dr.quit()
#6
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_name('keywords')
print(e.get_attribute('content'))
dr.quit()
#7

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_name('description')
print(e.get_attribute('content'))
dr.quit()
# #8
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_name('kw')
print(e.get_attribute('type'))
dr.quit()
#9
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_name('verydows-baseurl')
print(e.get_attribute('content'))
dr.quit()
# #10
# # 4.电商网站上找5个超链接元素,通过超链接文字获取元素,打印链接地址,提交到git上
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_link_text('首页')
print(e.get_attribute('href'))
dr.quit()
# #1
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_link_text('dsfs')
print(e.get_attribute('href'))
dr.quit()
# #2
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_link_text('中国wan')
print(e.get_attribute('href'))
dr.quit()
# #3
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_link_text('a')
print(e.get_attribute('href'))
dr.quit()
# #4
#
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_link_text('dady')
print(e.get_attribute('href'))
dr.quit()
# #5
