#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
import os
import time
# 一．把今天的代码重新敲一遍，上传到git上，这里一个.py文件
#通过路径获取多个元素
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('H02.html'))
e=dr.find_elements_by_xpath("//input[@name='123'][@value='0']")
for i in e:
    print(i.get_attribute('id'))
dr.quit()
#通过路径获取一个元素
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('H02.html'))
e=dr.find_element_by_xpath("//form[@id='chen'][name='xingyong']")
for i in e:
    print(i.get_attribute('id'))
dr.quit()
#通过css获取多个元素

dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('H02.html'))
e=dr.find_elements_by_css_selector("p.23")
for i in e:
    print(i.get_attribute('href'))
dr.quit()
#通过class的值获取多个元素
dr.get('http://www.baidu.com')
e=dr.find_elements_by_class_name('mnav.c-font-normal.c-color-t')
print(len(e))
for i in e:
    if i.get_attribute('href'):
        print(i.get_attribute('href'))
dr.quit()
#通过标签名来获取元素
dr=webdriver.Firefox()
dr.get('https://www.taobao.com')
e=dr.find_elements_by_tag_name('div')
print(len(e))
for i in e:
    print(i.get_attribute('id'))
dr.quit()
#通过超链接中的文字来获取元素
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('H02.html'))
e=dr.find_element_by_link_text('百度')
print(e.get_attribute('href'))
dr.quit()
#通过超链接中的子链接中的文字来获取多个元素
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_elements_by_partial_link_text('我的购物车')
for i in e:
    print(i.get_attribute('href'))
# dr.quit()
# 二．在电商网上通过路径和css各找一个元素，并打印其他属性值，这里一个.py文件
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_xpath('//div[@id="top-userbar"]')
print(e.get_attribute('class'))
e=dr.find_element_by_css_selector('div.topper-userbar.fl')
print(e.get_attribute('id'))
dr.quit()


# 三．通过获取多个元素的方式获取元素，
# 分别用id,name,链接文字，子链接文字，标签名，class,路径，css,
# 在电商网上至少各自找2个以上元素，并打印出其他属性，这里一个.py文件
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('H02.html'))
e=dr.find_elements_by_id('wang')
r=dr.find_elements_by_name('123')
t=dr.find_elements_by_css_selector('a.zz')
y=dr.find_elements_by_link_text('百度')
u=dr.find_elements_by_partial_link_text('加入')
o=dr.find_elements_by_tag_name('div')
p=dr.find_elements_by_class_name('zz')
q=dr.find_elements_by_xpath('//form[@id="chen"]/input')
def ceshi():

    for i in e:
        print(i.get_attribute('value'))
    for i in r:
        print(i.get_attribute('id'))
    for i in t:
        print(i.get_attribute('href'))
    for i in y:
        print(i.get_attribute('href'))
    for i in u:
        print(i.get_attribute('href'))
    for i in o:
        print(i.get_attribute('id'))
    for i in p:
        print(i.get_attribute('href'))
    for i in q:
        print(i.get_attribute('id'))

ceshi()

dr.quit()



