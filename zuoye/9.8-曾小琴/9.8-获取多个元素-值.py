#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 通过获取多个元素的方式获取元素，分别用id,name,链接文字，子链接文字，标签名，class,路径，css,
# 在电商网上至少各自找2个以上元素，并打印出其他属性
from selenium import webdriver
import os
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('01.html'))
a1=dr.find_elements_by_id('aa')
a2=dr.find_elements_by_name('aaa')
a3=dr.find_elements_by_link_text('链接')    #链接的文字
a4=dr.find_elements_by_partial_link_text('我是段落')
a5=dr.find_elements_by_tag_name('a')   #标签
a6=dr.find_elements_by_class_name('myclass')
a7=dr.find_elements_by_xpath("//input[@type='checkbox'][@name='旅游']")
a8=dr.find_elements_by_css_selector('a.myclass')   #(选择器.类样式值)

def ceshi():
    for i in a1:
        print(i.get_attribute('name'))
    for i in a2:
        print(i.get_attribute('id'))
    for i in a3:
        print(i.get_attribute('href'))
    for i in a4:
        print(i.get_attribute('href'))
    for i in a5:
        print(i.get_attribute('class'))
    for i in a6:
        print(i.get_attribute('name'))
    for i in a7:
        print(i.get_attribute('value'))
    for i in a8:
        print(i.get_attribute('href'))
ceshi()
dr.quit()
