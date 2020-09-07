#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import  webdriver
driver=webdriver.Firefox()
driver.get('https://www.baidu.com')
print(driver.title)
driver.quit()

