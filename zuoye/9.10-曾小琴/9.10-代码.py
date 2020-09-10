#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version:
#====#====今日代码====#====
#====#====多Frame框处理====#====
'''
案例:案例:#打开qq的首页,用账号密码登录邮箱,之后点击邮箱页面的基本版
from selenium import webdriver
import time
dr=webdriver.Firefox()
#打开qq的首页
dr.get('https://www.qq.com')
#点击邮件图标
dr.find_element_by_link_text('Qmail').click()
#切换到邮箱页面  因为产生了新的页面所以要进行切换
hs=dr.window_handles#获取浏览器中所有页面的句柄
dr.switch_to.window(hs[1])#切换到邮箱页面
time.sleep(2)

#获取邮箱页面里的小窗口
iframeObj=dr.find_element_by_xpath('//*[@id="login_frame"]')
print(iframeObj.get_attribute('name'))
#切换到frame
dr.switch_to.frame(iframeObj)
time.sleep(2)

#判断是否有[帐号密码登录]页面元素
if dr.find_element_by_id('switcher_plogin'):   #帐号密码登录
    dr.find_element_by_id('switcher_plogin').click()   #有并且点击
    time.sleep(5)
    #获取输入框元素并输入qq号码
    dr.find_element_by_xpath('//*[@id="u"]').send_keys("76754438")
    time.sleep(3)
    #获取密码框元素并输入密码
    dr.find_element_by_xpath('//*[@id="p"]').send_keys("12345678")
    time.sleep(3)
    #点击登入
    dr.find_element_by_xpath('//*[@id="login_button"]').click()
    time.sleep(3)

#切换回主体
dr.switch_to.default_content()
time.sleep(2)

#点击邮箱页面的基本版
dr.find_element_by_link_text('基本版').click()
time.sleep(2)
dr.quit()
'''
#====#====警告框处理(重点)====#====
'''
案例:将百度的窗口最大化,获设置-点击搜索设置,设置搜索的内容
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
dr=webdriver.Firefox()
dr.get('https://www.baidu.com')
dr.maximize_window()#最大化

#获取设置元素  
e=dr.find_element_by_tag_name('span')
# print(e.get_attribute('id'))

#控制鼠标悬停到设置元素
ActionChains(dr).move_to_element(e).perform()
time.sleep(3)

#点击搜索设置
dr.find_element_by_link_text('搜索设置').click()
time.sleep(3)

#选择显示20条
e=dr.find_element_by_id('nr_2').click()
# print(e.get_attribute('name'))
time.sleep(4)

#点击保存设置按键
dr.find_element_by_link_text('保存设置').click()
time.sleep(3)

# 暂时将浏览器对象driver交给alter用
dd=dr.switch_to.alert
#获取警告框的文本信息
print(dd.text)
# accept()：接受现有警告框，就是点他的确定按钮
# dd.accept()
time.sleep(3)

# ：放弃现有警告框，取消
dd.dismiss()

# dr.quit()
'''
#====#====元素等待====#====
"""
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
import time
import sys

dr=webdriver.Firefox()
time.sleep(3)#强制等待
#隐式等待
#在使用隐式等待的时候，实际上浏览器会在你自己设定的时间内部不断的刷新页面去寻找我们需要
# dr.implicitly_wait(10)
dr.get('https://www.baidu.com')
dr.find_element_by_id('kw')
"""
#====#====页面滚动条操作====#====
# 案例:打开123网将窗口缩小,把滚动条拖到底部,再拖到顶部,最后左右移动
"""
from selenium import webdriver
import time
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
"""
#====#====线性脚本开发====#====
"""
# 案例:自动化登录测试
#引入模块
from selenium import webdriver
import time
#获取浏览器
dr=webdriver.Firefox()
#打开网站
dr.get('http://39.96.181.61/qftest-ds/')
#获取免费注册元素并点击
e=dr.find_element_by_link_text('免费注册').click()
# print(e.get_attribute('href'))
#获取用户名输入框,并输入数据
e1=dr.find_element_by_id("username").send_keys('test12')
# print(e1.get_attribute('name'))
#获取邮箱输入框,并输入数据
e2=dr.find_element_by_id("email").send_keys('test12@qq.com')
#获取密码输入框,并输入数据
e3=dr.find_element_by_id("password").send_keys('123456')
#获取确认密码输入框,并输入数据
e4=dr.find_element_by_id("repassword").send_keys('123456')
#获取'立即注册'元素,并点击
e5=dr.find_element_by_link_text('立即注册').click()
time.sleep(5)
#获取当前页面的url
url=dr.current_url
time.sleep(5)
#进行判断http://39.96.181.61/qftest-ds/user/index.html
if url=='http://39.96.181.61/qftest-ds/user/index.html':
    print('注册成功')
    time.sleep(3)
else:
    print('注册失败')
    time.sleep(3)
#关闭浏览器
dr.quit()
"""
#====#====模块化驱动脚本开发====#====
'''
# 案例:自动化登录和退出模块
#引入模块
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time

#登入系统用例
def login(dr):
    #获取登入元素,并点击
    dr.find_element_by_link_text('登陆').click()
    time.sleep(2)
    #获取用户名输入框,并输入数据
    dr.find_element_by_id('username').send_keys('test2')

    #获取密码输入框,并输入数据
    dr.find_element_by_id('password').send_keys('123456')
    #获取登入按键元素,并点击
    dr.find_element_by_link_text('登     陆').click()

def logout(dr):
    #获取退出登入元素,并点击
    # dr.find_element_by_link_text('退出登录')
    #获取用户名元素,并进行鼠标悬停,然后获取退出元素,并进行点击
    e=dr.find_element_by_xpath('//*[@id="top-userbar"]/a')
    ActionChains(dr).move_to_element(e).perform()
    dr.find_element_by_link_text('退出').click()

if __name__=='__main__':

    # 获取浏览器
    dr=webdriver.Firefox()
    # 打开网站
    dr.get('http://39.96.181.61/qftest-ds/')
    time.sleep(2)
    #调用登入函数
    login(dr)
    time.sleep(5)
    #调用退出函数
    logout(dr)
    time.sleep(5)
    #关闭浏览器
    dr.quit()
'''
#====#====数据驱动脚本开发====#====
'''
案例:csv文件（excel文件）数据的导入
data.csv的内容:
test333
767544383@qq.com
123456
123456
http://39.96.181.61/qftest-ds/user/index.html

from selenium import webdriver
import os
import csv
import time

with open('data.csv','r',encoding='utf-8') as f:
    data=csv.reader(f)
    mylist = []
    for d in data:
        mylist.append(d[0])
    print(mylist)
    dr=webdriver.Firefox()
    # 打开网站
    dr.get('http://39.96.181.61/qftest-ds/')
    time.sleep(2)
    # 获取免费注册元素并点击
    dr.find_element_by_link_text('免费注册').click()
    time.sleep(3)
    # 获取用户名输入框,并输入数据
    dr.find_element_by_id('username').send_keys(mylist[0])
    time.sleep(2)
    # 获取邮箱输入框,并输入数据
    dr.find_element_by_id('email').send_keys(mylist[1])
    time.sleep(2)
    # 获取密码输入框,并输入数据
    dr.find_element_by_id('password').send_keys(mylist[2])
    time.sleep(2)
    # 获取确认密码输入框,并输入数据
    dr.find_element_by_id('repassword').send_keys(mylist[3])
    time.sleep(2)
    # 获取'立即注册'元素,并点击
    dr.find_element_by_link_text('立即注册').click()

    #休眠一下
    time.sleep(9)

    #获取断言的url
    myurl=mylist[4]

    if dr.current_url==myurl:
        print("测试用例ok")
    else:
        print("测试用例错误")

    time.sleep(2)

    dr.quit()
'''



