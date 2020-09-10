#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from time import sleep
from selenium.webdriver.common.action_chains import ActionChains
# dr=webdriver.Firefox()
# dr.get('https://www.qq.com')
# dr.find_element_by_link_text('邮箱').click()
# sleep(5)
# a=dr.window_handles
# dr.switch_to.window(a[1])
# a=dr.find_element_by_id('login_frame')
# dr.switch_to.frame(a)
# sleep(5)
# if dr.find_element_by_id('switcher_plogin'):
#     dr.find_element_by_id('switcher_plogin').click()
#     sleep(2)
#     dr.find_element_by_id('u').send_keys('1375398615')
#     sleep(5)
#     dr.find_element_by_id('p').send_keys('12323124421')
#     dr.find_element_by_id('login_button').click()
#     sleep(2)
# else:
#     dr.find_element_by_id('switcher_plogin').click()
#     sleep(2)
#     dr.find_element_by_id('u').send_keys('1375398615')
#     sleep(5)
#     dr.find_element_by_id('p').send_keys('12323124421')
#     dr.find_element_by_id('login_button').click()
#     sleep(2)
#
# dr.switch_to.default_content()
# dr.find_element_by_link_text('基本版').click()
# sleep(2)
# dr.quit()

# 警告框处理
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# dr.minimize_window()
# dr.maximize_window()
# a=dr.find_element_by_tag_name('span')
# ActionChains(dr).move_to_element(a).perform()
# sleep(5)
# dr.find_element_by_link_text('搜索设置').click()
# dr.find_element_by_link_text('保存设置').click()
# sleep(5)
# a1=dr.switch_to.alert
# # print(a1.text)
# sleep(2)
# # a1.dismiss()
# a1.accept()
# sleep(3)
# dr.quit()

# 元素等待
from  selenium import webdriver
from selenium.webdriver.support import expected_conditions as EC
from  selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
# from time import sleep
# import sys
# dr=webdriver.Firefox()
# # sleep(3)
# #
# dr.implicitly_wait((10))
# dr.get('https://www.baidu.com')
# dr.find_element_by_id('kw')
# try:
#     ele=WebDriverWait(dr,5,0.5,ignored_exceptions=None).until(EC.presence_of_all_elements_located(By.ID,"KW")),"找不到")
#     ele.send_keys('selenium')
#     sleep(3)
# except:
#     print(sys.exc_info())

# 页面滚动条操作
# dr=webdriver.Firefox()
# dr.get('https://www.hao123.com')
# dr.set_window_size(500,1000)
# sleep(5)
# js="document.documentElement.scrollTop=10000"
# dr.execute_script(js)
# sleep(4)
# js='document.documentElement.scrollTop=0'
# dr.execute_script(js)
# sleep(5)
# js='window.scrollTo(111,232)'
# dr.execute_script(js)
# sleep(3)
# dr.quit()


# 二．页面滚动条，做成缓慢下拉的动画效果
# dr=webdriver.Firefox()
# dr.get('https://www.hao123.com')
# js="document.documentElement.scrollTop=10000"
# a=js.split('=')
# a1=a[0]
# a2=a[1]
# for i in range(int(a2)):
#     a3=a1+'='+str(i)
#     dr.execute_script(a3)
# sleep(5)

# 三．登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.action_chains import ActionChains
def  login(dr):
    dr.find_element_by_partial_link_text('登陆').click()#点击登陆
    dr.find_element_by_id('username').send_keys('shen123')#输入账号
    dr.find_element_by_id('password').send_keys('123456')#输入密码
    dr.find_element_by_partial_link_text('登     陆').click()#点击denglu
    sleep(5)#休眠程序让页面进行缓存
    dr.find_element_by_partial_link_text('收件地址').click()#点击收件地址
    dr.find_element_by_id('newadrbtn').click()#新建收件人信息
    dr.find_element_by_id('receiver').send_keys('老油条')#收件人
    dr.find_element_by_id('areaslt-province').click()#所在省
    dr.find_element_by_xpath('//select[@id="areaslt-province"]/option[18]').click()#湖北省
    dr.find_element_by_id('areaslt-city').click()#所在市
    dr.find_element_by_xpath('//select[@id="areaslt-city"]/option[10]').click()#荆州
    dr.find_element_by_id('areaslt-borough').click()#所在县区
    dr.find_element_by_xpath('//select[@id="areaslt-borough"]/option[8]').click()#洪湖市
    dr.find_element_by_id('address').send_keys('大口')#详细地址
    dr.find_element_by_id('zip').send_keys('444222')#邮编
    dr.find_element_by_id('mobile').send_keys('15388888888')#手机号码
    dr.find_element_by_xpath("//*[@type='button'][@class='sm-green']").click()#保存信息
    sleep(5)#等待界面加载完成
def logout(dr):
  a=dr.find_element_by_xpath('//div[@id="top-userbar"]/a')
  ActionChains(dr).context_click(a).perform()
  sleep(5)
  dr.find_element_by_link_text('退出').click()


if  __name__    ==     '  __main__   ':
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    login(dr)
    sleep(5)
    logout(dr)
    dr.quit()


# 四/把注册功能写成模块化
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.action_chains import ActionChains
def login(dr):
    dr.find_element_by_partial_link_text('免费注册')#获取免费注册
    dr.find_element_by_id('username').send_keys('shen1234')#输入用户名
    dr.find_element_by_id('email').send_keys('12333@qq.com')#输入邮箱
    dr.find_element_by_id('password').send_keys('123456')#输入密码
    dr.find_element_by_id('repassword').send_keys('123456')#再次输入密码
    dr.find_element_by_link_text('立即注册').click()#点击立即注册
    sleep(5)

def logout(dr):
    a=dr.find_element_by_xpath('//div[@id="top-userbar"]/a')
    ActionChains(dr).context_click(a).perform()
    sleep(5)
    dr.find_element_by_link_text('退出').click()


if __name__ =='__main__':
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    login(dr)
    sleep(5)
    logout(dr)
    sleep(5)
    dr.quit()




