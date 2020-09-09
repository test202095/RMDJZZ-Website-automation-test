#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 三．自动化登入电商系统前台，把苹果加入到购物车
# 注意：网站要通过代码获取
from selenium import  webdriver
from selenium.webdriver.common.keys import Keys
from time import sleep
def shop(file):#file：文件名 kw:搜索关键词
    f=open(file,'r')#打开文件，读文件
    mylist=f.read().splitlines()#读到的文件用mylist以列表的形式存储起来，不带\n
    f.close()#关闭窗口
    for i in range(len(mylist)):
        if mylist[i]=='电商系统前台地址：':#获取电商系统前台的地址url
            url=mylist[i+1]
    dr=webdriver.Firefox()#打开浏览器
    dr.get(url)#打开网页
    sleep(1)
    search=dr.find_element_by_name('kw')#获取搜索框的元素
    sleep(1)
    search.send_keys('苹果')#模拟键入关键字
    sleep(1)
    # search.submit()#回车提交方式1
    # search.send_keys(Keys.ENTER)#回车提交方式2
    bt=dr.find_element_by_xpath('//button[@class="fr"]')#获得搜索按钮的元素
    bt.click()#点击
    sleep(1)
    ee=dr.find_element_by_link_text('苹果')#获取第一个苹果的a链接
    sleep(3)
    ee.click()#点击
    car=dr.find_element_by_link_text('加入购物车')#获取加入购物车元素
    sleep(3)
    car.click()#点击加入购物车
    sleep(2)
    dr.get_screenshot_as_file('car.png')#截图
    sleep(2)
    dr.quit()

shop('./file/电商系统-阿里云环境.txt')
