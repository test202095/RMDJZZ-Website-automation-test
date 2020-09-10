#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 把注册功能写成模块化
from selenium import webdriver
from time import sleep
import csv

def register():
    with open('账号密码.csv','r',encoding='utf8') as f:#打开文件
        mylist=csv.reader(f)#存储文件
        for i in mylist:
            dr = webdriver.Firefox()#打开浏览器
            dr.get('http://39.96.181.61/qftest-ds/index.html')#打开网址
            dr.find_element_by_link_text('免费注册').click()#点击免费注册
            sleep(3)
            dr.find_element_by_id('username').send_keys(i[0])#模拟输入用户名
            sleep(1)
            dr.find_element_by_id('email').send_keys(i[1])  # 模拟输入邮箱
            sleep(1)
            dr.find_element_by_id('password').send_keys(i[2])  # 模拟输入密码
            sleep(1)
            dr.find_element_by_id('repassword').send_keys(i[3])  # 模拟输入确认密码
            sleep(1)
            dr.find_element_by_link_text('立即注册').click()#点击立即注册
            sleep(5)
            url=dr.current_url
            if url=='http://39.96.181.61/qftest-ds/user/index.html':#断言
                print(i[0]+'注册成功')
            else:
                print(i[0]+'注册失败')
            sleep(2)
            dr.quit()


if __name__=='__main__':

    register()
    sleep(3)
