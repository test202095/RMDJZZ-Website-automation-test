#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 二/页面滚动条，做成缓慢下拉的动画效果
from selenium import webdriver
import time
dr=webdriver.Firefox()
dr.get('https://www.hao123.com/')
dr.set_window_size(400,800)
time.sleep(3)
#把滚动条拖到底部
js="document.documentElement.scrollTop=10000"
b=(js.split('='))
b1=b[0]
b2=b[1]
for i in range(int(b2)):
    print(type(i))
    a=b1+'='+str(i)
    dr.execute_script(a)
time.sleep(2)
#把滚动条拖到顶部
js="document.documentElement.scrollTop=0"
dr.execute_script(js)
time.sleep(2)
dr.quit()

# 三/登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.action_chains import ActionChains
def login(dr):
    dr.find_element_by_link_text('登陆').click()  #点击登陆
    sleep(2)
    dr.find_element_by_id('username').send_keys('chenqi') #输入账号
    sleep(2)
    dr.find_element_by_id('password').send_keys('123456')  #输入密码
    sleep(2)
    dr.find_element_by_link_text('登     陆').click()  #点击登陆
    sleep(7)
    Url="http://39.96.181.61/qftest-ds/user/index.html"
    dr.get(Url)  #获取新的页面
    dr.find_element_by_link_text('收件地址').click()
    uu="http://39.96.181.61/qftest-ds/consignee/list.html"
    dr.get(uu)  #获取新的页面
    dr.find_element_by_id('newadrbtn').click()
    a=dr.find_element_by_id('receiver') #收件人
    a.click()
    a.send_keys('小仙女')
    dr.find_element_by_id('areaslt-province').click() #所在省
    sleep(3)
    dr.find_element_by_xpath('').click() #广东
    sleep(3)
    dr.find_element_by_id('areaslt-city').click() #所在市
    sleep(2)
    dr.find_element_by_xpath('//select[@id="areaslt-city"]/option[3]').click() #深圳
    sleep(2)
    dr.find_element_by_id('areaslt-borough').click() #所在县
    sleep(2)
    dr.find_element_by_xpath('//select[@id="areaslt-borough"]/option[4]').click() #宝安
    sleep(3)
    a1=dr.find_element_by_id('address') #详细地址
    a1.click()
    a1.send_keys('草围')
    sleep(3)
    a2=dr.find_element_by_id('zip') #邮编
    a2.click()
    a2.send_keys('123456')
    sleep(3)
    a3=dr.find_element_by_id('mobile') #手机号码
    a3.click()
    a3.send_keys('123456789')
    sleep(3)
    dr.find_element_by_xpath('//*[@class="sm-green"][@type="button"]').click()  #点击保存
    sleep(3)

def logout(dr):
    c1 = dr.find_element_by_xpath('//div[@id="top-userbar"]/a')
    ActionChains(dr).context_click(c1).perform()
    sleep(5)
    dr.find_element_by_link_text('退出').click()

if __name__ == '__main__':
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    login(dr)
    sleep(5)
    logout(dr)
    sleep(5)
    dr.quit()


# 四/把注册功能写成模块化
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.action_chains import ActionChains
def login(dr):
    dr.find_element_by_link_text('免费注册').click() #点击免费注册
    ui="http://39.96.181.61/qftest-ds/user/register.html"
    dr.get(ui)  #获取新的页面
    x=dr.find_element_by_id('username') #用户名
    x.click()
    x.send_keys('chenchen')
    sleep(3)
    x1=dr.find_element_by_id('email') #邮箱
    x1.click()
    x1.send_keys('chenchen@qq.com')
    sleep(3)
    x2=dr.find_element_by_id('password') #密码
    x2.click()
    x2.send_keys('123456')
    sleep(3)
    x3=dr.find_element_by_id('repassword') #再次确认密码
    x3.click()
    x3.send_keys('123456')
    sleep(3)
    dr.find_element_by_link_text('立即注册').click() #点击注册
    sleep(7)

def logout(dr):
    c1 = dr.find_element_by_xpath('//div[@id="top-userbar"]/a')  #退出
    ActionChains(dr).context_click(c1).perform()
    sleep(5)
    dr.find_element_by_link_text('退出').click()

if __name__ == '__main__':
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    login(dr)
    sleep(5)
    logout(dr)
    sleep(5)


