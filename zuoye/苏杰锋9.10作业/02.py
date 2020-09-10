#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
#二．页面滚动条，做成缓慢下拉的动画效果
from selenium import webdriver
from time import  sleep
def scroll(url):
    dr=webdriver.Firefox()
    dr.get(url)
    dr.maximize_window()#窗口最大化
    n=0#用来存储移动的位置
    for i in range(100):
        n=i*100
        js="document.documentElement.scrollTop="+str(n)#设置滚动位置
        sleep(0.5)
        dr.execute_script(js)#执行
    sleep(1)
    dr.quit()

scroll('http://39.96.181.61/qftest-ds/index.html')