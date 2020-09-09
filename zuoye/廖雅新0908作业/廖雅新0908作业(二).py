#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 在电商网上通过路径和css各找一个元素，并打印其他属性值，这里一个.py文件
from selenium import webdriver
import os
from time import sleep
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_element_by_xpath('//input')
print(e.get_attribute('class'))
f=dr.find_element_by_css_selector('input.fl')
print(f.get_attribute('name'))
dr.quit()


