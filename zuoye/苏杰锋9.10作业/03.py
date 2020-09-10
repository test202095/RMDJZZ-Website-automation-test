#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====


# 三．登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
from selenium import webdriver
from time import  sleep
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.action_chains import ActionChains
class Mytest():
    def login(self,dr,username,passwd):
        dr.find_element_by_link_text('登陆').click()
        dr.find_element_by_id('username').send_keys(username)
        dr.find_element_by_id('password').send_keys(passwd)
        dr.find_element_by_link_text('登     陆').click()
        sleep(5)

    def address(self,dr):
        dr.find_element_by_link_text('收件地址').click()#获取收货地址元素并点击
        sleep(1)
        dr.find_element_by_id('newadrbtn').click()#获取新建收件人信息并点击
        sleep(1)
        dr.find_element_by_id('receiver').send_keys('小明')#填写收件人姓名
        sq=dr.find_element_by_id('areaslt-province')#获取省
        mysq=Select(sq)
        mysq.select_by_visible_text('湖南省')#设置湖南省
        sleep(1)
        cs=dr.find_element_by_id('areaslt-city')#获取市
        mycs=Select(cs)
        mycs.select_by_visible_text('常德市')#设置常德市
        sleep(1)
        qx = dr.find_element_by_id('areaslt-borough')  # 获取区县
        myqx = Select(qx)
        myqx.select_by_visible_text('武陵区')  # 设置武陵区
        sleep(1)
        dr.find_element_by_id('address').send_keys('湖南省常德市武陵区XXXXX')#设置详细地址
        sleep(1)
        dr.find_element_by_id('zip').send_keys('415000')#设置邮编
        sleep(1)
        dr.find_element_by_id('mobile').send_keys('13822498888')#设置手机号码
        sleep(1)
        dr.find_element_by_class_name('sm-green').click()#点击保存信息
        sleep(5)

    def logout(self,dr):  # 退出函数
        #悬浮退出
        my=dr.find_element_by_class_name('m')
        ActionChains(dr).move_to_element(my).perform()#悬浮
        sleep(1)
        dr.find_element_by_link_text('退出').click()


m=Mytest()
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/index.html')
m.login(dr,'testt','123456')
m.address(dr)
m.logout(dr)
sleep(2)
dr.quit()