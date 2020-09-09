#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====

def test():
    f=open('1.txt','r',encoding='gbk')
    a=f.read()
    c = a.split('\n')
    d = c[1]
    d1 = c[3]
    d2 = c[5]
    from selenium import webdriver
    from selenium.webdriver.common.keys import Keys
    from time import sleep
    dr = webdriver.Firefox()
    dr.get(d)
    a1 = dr.find_element_by_id('username')
    a1.send_keys(d1)
    a2 = dr.find_element_by_id('password')
    a2.send_keys(d2)
    a3 = dr.find_element_by_partial_link_text('登 陆')
    a3.click()
    sleep(10)
    dr.get_screenshot_as_file('4.png')
    dr.quit()
test()