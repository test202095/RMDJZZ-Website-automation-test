#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.select import Select
import os
# 一．今天的代码敲一遍
#页面中窗口切换

dr=webdriver.Firefox()
dr.get('http://www.qq.com')#打开腾讯网站
sleep(2)
dr.find_element_by_link_text('Qmail').click()#点击右上角的邮箱
sleep(2)
hs=dr.window_handles#获得浏览器所有的句柄
sleep(2)
dr.switch_to.frame(hs[1])#把浏览器对象交给邮箱界面
sleep(2)
dr.switch_to.frame('login_frame')#切换到小窗口
sleep(2)
dr.find_element_by_xpath('//span[@id="img_out_865490237"]').click()#获取账号元素并点击
sleep(1)
dr.switch_to.default_content()#返回主页面
sleep(1)
dr.quit()



# #弹窗处理

dr=webdriver.Firefox()
dr.get('http://www.baidu.com')
sleep(2)
dr.maximize_window()#窗口最大化
sleep(1)
e=dr.find_element_by_id('s-usersetting-top')#获得设置元素
sleep(2)
ActionChains(dr).move_to_element(e).perform()#鼠标悬停
sleep(3)
dr.find_element_by_link_text('搜索设置').click()#获得搜索设置元素并点击
sleep(3)
dr.find_element_by_id('nr_2').click()#搜索结果显示条数元素，并选择20条
sleep(1)
dr.find_element_by_link_text('保存设置').click()#获得保存设置按键元素并点击
sleep(3)
e=dr.switch_to.alert#将浏览器对象交给弹窗
# e.accept()#确定
e.dismiss()#取消
sleep(3)
dr.quit()
#




# # 二．页面滚动条，做成缓慢下拉的动画效果

dr=webdriver.Firefox()
dr.get('http://www.douyu.com')
sleep(2)
dr.set_window_size(400,600)#设置窗口大小
sleep(2)
dr.maximize_window()#最大化窗口
sleep(1)
js="document.documentElement.scrollTop="
n=0
for i in range(101):
    n=i*100
    js1=js+str(n)
    sleep(1)
    dr.execute_script(js1)

dr.quit()



# 三．登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
def login(dr):
    # 获取登入元素,并点击
    dr.find_element_by_link_text('登陆').click()
    sleep(2)
    # 获取用户名输入框,并输入数据
    dr.find_element_by_id('username').send_keys('nzzz123')
    sleep(1)
    # 获取密码输入框,并输入数据
    dr.find_element_by_id('password').send_keys('123456789')
    sleep(1)
    # 获取登入按键元素,并点击
    dr.find_element_by_link_text('登     陆').click()
    sleep(5)
    #获取收件地址元素并点击
    dr.find_element_by_link_text('收件地址').click()
    sleep(1)
    #获取新建地址元素并点击
    dr.find_element_by_id('newadrbtn').click()
    sleep(1)
    #获取收件人输入框，并输入数据
    dr.find_element_by_id('receiver').send_keys('cxy')
    sleep(1)
    #获取省份下拉框，并选择
    e=dr.find_element_by_id('areaslt-province')
    list=Select(e)
    list.select_by_value('19')
    sleep(1)
    #获取城市下拉框，并选择
    e=dr.find_element_by_id('areaslt-city')
    list = Select(e)
    list.select_by_value('3')
    sleep(1)
    #获取地区下拉框，并选择
    e=dr.find_element_by_id('areaslt-borough')
    list = Select(e)
    list.select_by_value('4')
    sleep(1)

    #获取详细地址输入框，并输入数据
    dr.find_element_by_id('address').send_keys('后瑞')
    sleep(1)
    #获得邮编输入框，并输入数据
    dr.find_element_by_id('zip').send_keys('000000')
    sleep(1)
    #获得手机号码输入框，并输入数据
    dr.find_element_by_id('mobile').send_keys('15679697381')
    sleep(1)
    #获得保存按键元素，并点击
    dr.find_element_by_class_name('sm-green').click()
    sleep(2)

if __name__ == '__main__':
    #获得浏览器
    dr=webdriver.Firefox()
    #获得网站
    dr.get('http://39.96.181.61/qftest-ds/')
    login(dr)
    sleep(5)
    #关闭浏览器
    dr.quit()

# 四．把注册功能写成模块化

def dogino(dr):
    #获得免费注册元素，并点击
    sleep(2)
    dr.find_element_by_link_text('免费注册').click()
    #获得用户名输入框，并输入
    sleep(1)
    dr.find_element_by_id('username').send_keys('tyriei2')
    #获得邮箱输入框，并输入
    sleep(1)
    dr.find_element_by_id('email').send_keys('42156498@qq.com')
    #获得密码输入框，并输入
    sleep(1)
    dr.find_element_by_id('password').send_keys('123456')
    #获得确认密码输入框，并输入
    sleep(1)
    dr.find_element_by_id('repassword').send_keys('123456')
    #获得立即注册元素并点击
    sleep(1)
    dr.find_element_by_link_text('立即注册').click()

if __name__=='__main__':
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    dogino(dr)
    sleep(5)
    dr.quit()