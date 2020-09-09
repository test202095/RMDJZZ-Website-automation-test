#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/index.html')
# a=dr.find_element_by_xpath("//input[@name='kw']")
# print(a.get_attribute("type"))
# dr.quit()


dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/index.html')
b=dr.find_element_by_css_selector('a.red')
print(b.get_attribute('href'))
dr.quit()