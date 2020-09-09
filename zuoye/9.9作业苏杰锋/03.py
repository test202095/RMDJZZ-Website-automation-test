#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====

def test1():
    f=open('1.txt','r',encoding='gbk')
    a=f.read()
    b=a.split('\n')
    c=b[len(b)-1]
    from selenium import webdriver
    from selenium.webdriver.common.keys import Keys
    from time import sleep
    dr=webdriver.Firefox()
    dr.get(c)
    d1=dr.find_element_by_name('kw')
    d1.send_keys('苹果')
    sleep(5)
    d1.send_keys(Keys.ENTER)
    sleep(5)
    d2=dr.find_element_by_partial_link_text('苹果')
    d2.click()
    sleep(5)
    d3=dr.find_element_by_partial_link_text('加入购物车')
    d3.click()
    sleep(5)
    dr.get_screenshot_as_file('5.png')
    dr.quit()




test1()
