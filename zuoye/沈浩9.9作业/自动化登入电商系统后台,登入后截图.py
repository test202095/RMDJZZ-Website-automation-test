#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====

def test():
    f=open('1.txt','r',encoding='gbk')#读文件
    a=f.read()#返回所有内容是字符串
    c=a.split('\n')#用\n进行切片赋值给c
    d=c[1]#通过下标获取后台网址
    d1=c[3]#通过下标获取管理员账号
    d2=c[5]#通过下标获取管理员密码
    from selenium import webdriver
    from selenium.webdriver.common.keys import Keys
    from time import sleep
    dr=webdriver.Firefox()
    dr.get(d)
    a1=dr.find_element_by_id('username')#获取到可以输入登入名的位置
    a1.send_keys(d1)#输入管理员账号
    a2=dr.find_element_by_id('password')#获取到可以输入密码的位置
    a2.send_keys(d2)#输入管理员密码
    a3=dr.find_element_by_partial_link_text('登 陆')#获取到登陆的元素
    a3.click()#点击登入按键
    sleep(10)#程序休眠10秒钟
    dr.get_screenshot_as_file('1.png')#截取当前界面的内容
    dr.quit()#关闭浏览器




test()
