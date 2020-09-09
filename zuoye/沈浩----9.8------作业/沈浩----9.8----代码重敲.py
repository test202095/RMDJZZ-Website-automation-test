#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import  webdriver
import  os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML/h4.html'))
# # a=dr.find_element_by_xpath('/html/body/form[1]')
# # a=dr.find_element_by_xpath('//form[1]')
# # a=dr.find_element_by_xpath("//form[@id='loginForm']")
# # a=dr.find_element_by_xpath("//form[input/@name='cin']")
# # a=dr.find_element_by_xpath("//form[@name='qwqe']/input[1]")
# # a=dr.find_element_by_xpath("//input[@name='username']")
# # a=dr.find_element_by_xpath("//input[@name='username'][@id='1213']")
# a=dr.find_element_by_xpath("//*[@name='username'][@id='1213']")
# print(a.get_attribute('type'))
# dr.quit()
#案例:在百度首页上用xpath随便找一个元素,并打印这个元素的其他属性值
# dr=webdriver.Firefox()
# dr.get("http://www.baidu.com")
# a=dr.find_element_by_xpath('/html/head/meta[1]')
# print(a.get_attribute('id'))
# dr.quit()
# 案例:自己写个有超链接的标签,通过class样式,找到该标签的href属性值
# dr=webdriver.Firefox()
# dr.get('http://www.baidu.com')
# a=dr.find_element_by_css_selector("a.c-font-medium")
# print(a.get_attribute('href'))
# dr.quit()
# 自己写一个html文件,定义两个id属性值相同的标签,通过id获取多个元素,然后打印出各自其他的属性
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML/h1.html'))
# a=dr.find_elements_by_id('12')
# for i in a:
#     print(i.get_attribute('name'))
# dr.quit()
# 案例:自己写一个html文件,定义两个name属性值相同的标签,通过name获取多个元素,然后打印出各自其他的属性
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML/h1.html'))
# a=dr.find_elements_by_name('qqq')
# for i in a:
#     print(i.get_attribute('id'))
# dr.quit()
# 案例:自己写一个html文件,定义两个链接标签,链接文字相同的,通过链接文字获取多个元素,然后打印出各自的href属性
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML/h2.html'))
# a=dr.find_elements_by_link_text('112')
# for i in a:
#     print(i.get_attribute('id'))
# dr.quit()
#在超链接定位里,通过链接文字获取多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML/h2.html'))
# a=dr.find_elements_by_partial_link_text('112')
# for i in a:
#     print(i.get_attribute('href'))
# dr.quit()
#案例:获取淘宝首页有多少个div,并打印出div里的id属性值
# dr=webdriver.Firefox()
# dr.get('http://www.taobao.com')
# a=dr.find_elements_by_tag_name('div')
# for  i in a:
#     if i.get_attribute('id'):
#       print(i.get_attribute('id'))
# dr.quit()
# dr=webdriver.Firefox()
# dr.get('http://www.baidu.com')
# a=dr.find_elements_by_xpath('/html/head/meta')
# for i in a:
#     if i.get_attribute('id'):
#         print(i.get_attribute('id'))
# dr.quit()
#案例:写一个html文件,写类样式,名字要.shen,定义多个超链接标签,引入类样式,获取各个超链表标签的链接
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('HTML/h1.html'))
b=dr.find_elements_by_css_selector('p.shen')
for j in b:
    print(j.get_attribute('id'))
dr.quit()
