#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 二．自动化登入电商系统后台,登入后截图
# 注意：网站,用户名和密码要通过代码获取
from selenium import webdriver
from time import sleep
def login(file):#file: 文件路径
    #打开文件读取文件中的管理员账号和密码以及网址
    with open(file,'r') as f:
        mylist=f.read().splitlines()#将读取到的内容以列表的形式返回（不带\n）
        f.close()#关闭文件
        for i in range(len(mylist)):#循环列表
            if mylist[i]=='电商系统后台管理登录网址：':#获取文件中的后台登录网址
                url=mylist[i+1]
            if mylist[i]=='管理员账号：':#获取文件中的管理员账号
                username=mylist[i+1]
            if mylist[i]=='管理员密码：':#获取文件中的管理员密码
                passwd=mylist[i+1]
        dr=webdriver.Firefox()#打开浏览器
        dr.get(url)#打开网址
        sleep(1)
        usname=dr.find_element_by_id('username')#获取登录名输入框元素
        paswd=dr.find_element_by_id('password')#获取登录密码输入框元素
        sleep(1)
        usname.send_keys(username)#将获取到的值模拟键盘输入到登录名输入框中
        sleep(1)
        paswd.send_keys(passwd)#将获取到的值模拟键盘输入到登录名输入框中
        sleep(1)
        dr.find_element_by_link_text('登 陆').click()#获取登录按钮元素并点击该元素
        sleep(8)
        dr.get_screenshot_as_file('login.png')#登录后截图
        sleep(2)
        dr.quit()

login('./file/电商系统-阿里云环境.txt')


