#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
'''
#昨日回顾
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

def test01():
    with open('1.txt','r',encoding='gbk')as f:
        mylist=f.read().splitlines()
        b=mylist[1]
        b1=mylist[3]
        b2=mylist[5]
    dr=webdriver.Firefox()
    dr.get(b)
    time.sleep(3)
    e=dr.find_element_by_name('username')
    e.send_keys(b1)
    e=dr.find_element_by_name('password')
    e.send_keys(b2)
    e = dr.find_element_by_class_name('btn.unslt')
    e.click()
    time.sleep(7)
    dr.get_screenshot_as_file('a.png')
    dr.quit()

#test01()

def test02():
    with open('1.txt', 'r', encoding='gbk') as f:
        mylist = f.read().splitlines()
        b = mylist[7]
    dr = webdriver.Firefox()
    dr.get(b)
    time.sleep(2)
    e = dr.find_element_by_name('kw')
    e.send_keys('苹果')
    time.sleep(3)
    e.send_keys(Keys.ENTER)
    time.sleep(3)
    dr.find_element_by_link_text('苹果').click()
    time.sleep(3)
    dr.find_element_by_link_text('加入购物车').click()
    dr.get_screenshot_as_file('b.png')
    dr.quit()

#test02()


#多个窗口切换
dr=webdriver.Firefox()
dr.get('https://www.qq.com')
dr.find_element_by_link_text('Qmail').click()
hs=dr.window_handles
dr.switch_to.window(hs[1])
time.sleep(5)

iframeObj=dr.find_element_by_xpath('//*[@id="login_frame"]')
dr.switch_to.frame(iframeObj)
time.sleep(5)

if dr.find_element_by_id('switcher_plogin'):
    dr.find_element_by_id('switcher_plogin').click()
    time.sleep(5)
    dr.find_element_by_xpath('//*[@id="u"]').send_keys("1402976722")
    time.sleep(3)
    dr.find_element_by_xpath('//*[@id="p"]').send_keys("123456")
    time.sleep(2)
    #点击登入
    dr.find_element_by_xpath('//*[@id="login_button"]').click()
    time.sleep(2)

dr.switch_to.default_content()

dr.find_element_by_link_text('基本版').click()

time.sleep(2)

dr.quit()


#警告框处理
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
dr=webdriver.Firefox()
dr.get('https://www.baidu.com')
dr.maximize_window()

e=dr.find_element_by_tag_name('span')
ActionChains(dr).move_to_element(e).perform()
time.sleep(3)

dr.find_element_by_link_text('搜索设置').click()
time.sleep(2)
dr.find_element_by_id('nr_2').click()
time.sleep(3)

dr.find_element_by_link_text('保存设置').click()
time.sleep(2)

d=dr.switch_to.alert
print(d.text)
#d.accetp()
d.dismiss()
#d.accetp()
time.sleep(5)
dr.quit()


#元素等待
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
import time
import sys

dr=webdriver.Firefox()
time.sleep(3)
#dr.implicitly_wait(10) #隐式等待
dr.get('http://www.baidu.com')
dr.find_element_by_id('kw')

try:
    e=WebDriverWait(dr,5,0.5,ignored_exceptions=None).until(EC.presence_of_element_located((By.ID,"kw")),"找不到")#显示等待
    e.send_keys('selenium')
    time.sleep(3)
except:
    print(sys.exc_info())

dr.quit()

#页面滚动条操作
from selenium import webdriver
import time
'''
# 使用JS实现
# • 到底部：js="document.documentElement.scrollTop=10000"
# • 到顶部： js="document.documentElement.scrollTop=0"
# • 左右移动：js="window.scrollTo(200,1000)"
# • Js代码的执行需要用到的方法：driver.execute_script(js)
'''

dr=webdriver.Firefox()
dr.get('https://www.hao123.com/')
dr.set_window_size(400,800)
time.sleep(3)
#把滚动条拖到底部
js="document.documentElement.scrollTop=10000"
dr.execute_script(js)
time.sleep(2)
#把滚动条拖到顶部
js="document.documentElement.scrollTop=0"
dr.execute_script(js)
time.sleep(2)

js="window.scrollTo(100,200)"
dr.execute_script(js)
time.sleep(2)

dr.quit()

#线性脚本开发
#引入模块
from selenium import webdriver
from time import sleep
#获取浏览器
dr=webdriver.Firefox()
#打开网站
dr.get('http://39.96.181.61/qftest-ds/')
#获取免费注册元素并点击
dr.find_element_by_link_text('免费注册').click()
#获取用户名输入框,并输入数据
dr.find_element_by_id('username').send_keys('11')
sleep(2)
#获取邮箱输入框,并输入数据
dr.find_element_by_id('email').send_keys('11')
sleep(2)
#获取密码输入框,并输入数据
dr.find_element_by_id('password').send_keys('11')
sleep(2)
#获取确认密码输入框,并输入数据
dr.find_element_by_id('repassword').send_keys('11')
sleep(2)
#获取'立即注册'元素,并点击
dr.find_element_by_link_text('立即注册').click()
sleep(5)
#获取当前页面的url
url=dr.current_url
sleep(2)
#进行判断http://39.96.181.61/qftest-ds/user/index.html
if url=='http://39.96.181.61/qftest-ds/user/index.html':
    print('注册成功')
else:
    print('注册失败')
#关闭浏览器
dr.quit()


from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time

def login(dr):
    #获取登入元素,并点击
    dr.find_element_by_link_text('登陆').click()
    time.sleep(2)

    dr.find_element_by_id('username').send_keys('test2')

    dr.find_element_by_id('password').send_keys('123456')

    dr.find_element_by_link_text('登     陆').click()

def logout(dr):
    e=dr.find_element_by_xpath('//*[@id="top-userbar"]/a')
    ActionChains(dr).move_to_element(e).perform()
    dr.find_element_by_link_text('退出').click()

if __name__=='__main__':

    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    time.sleep(2)
    login(dr)
    time.sleep(5)
    logout(dr)
    time.sleep(5)
    dr.quit()


from selenium import webdriver
from time import sleep
import csv
def mytest(file):
    with open(file,'r',encoding='utf8') as f:
        my=csv.reader(f)
        mylist=[]
        for i in my:
            mylist.append(i[0])
        dr=webdriver.Firefox()
        dr.get('http://39.96.181.61/qftest-ds/index.html')
        dr.find_element_by_link_text('免费注册').click()
        sleep(1)
        dr.find_element_by_id('username').send_keys(mylist[0])
        dr.find_element_by_id('email').send_keys(mylist[1])
        dr.find_element_by_id('password').send_keys(mylist[2])
        dr.find_element_by_id('repassword').send_keys(mylist[3])
        dr.find_element_by_link_text('立即注册').click()#获取立即注册并点击
        sleep(5)
        if dr.current_url==mylist[4]:#断言：判断当前页面是否是注册成功后页面
            print("测试用例执行成功")
        else:
            print("测试用例执行失败")

        sleep(2)
        dr.quit()

mytest('data.csv')

'''


