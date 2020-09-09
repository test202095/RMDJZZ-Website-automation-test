#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
def test1():
    f=open('1.txt','r',encoding='gbk')#读取文件
    a=f.read()#获取文件所有内容返回时字符串
    b=a.split('\n')#用\n进行切片
    c=b[len(b)-1]#通过下标获取前台网址
    from selenium import webdriver
    from selenium.webdriver.common.keys import Keys
    from time import sleep
    dr=webdriver.Firefox()
    dr.get(c)#登入到前台
    d1=dr.find_element_by_name('kw')#获取到可以进行搜索元素
    d1.send_keys('苹果')#在元素输入苹果
    sleep(5)#休眠程序5秒钟
    d1.send_keys(Keys.ENTER)#点击回车进行搜索
    sleep(5)
    d2=dr.find_element_by_partial_link_text('苹果')#找到苹果这个元素
    d2.click()#点击苹果元素
    sleep(5)#休眠程序5秒钟
    d3=dr.find_element_by_partial_link_text('加入购物车')#找到加入购物车的元素
    d3.click()#点击加入购物车
    sleep(5)#休眠程序5秒钟
    dr.get_screenshot_as_file('2.png')#截取当前界面的内容
    dr.quit()#关闭浏览器




test1()