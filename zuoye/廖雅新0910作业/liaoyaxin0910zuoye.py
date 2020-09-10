#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 一．今天的代码敲一遍
# 多Frame框处理
# from selenium import webdriver
# from time import sleep
#
# dr=webdriver.Firefox()
# dr.get('https://www.qq.com/')#打开网页
# dr.find_element_by_link_text('Qmail').click()#找到qq邮箱元素并点击
# sleep(2)
# hs=dr.window_handles#获取全部句柄
# #切换绑定浏览器
# dr.switch_to.window(hs[1])
#
#
# #切换给要操作的iframe
# iframe=dr.find_element_by_xpath('//iframe[@id="login_frame"]')#找到iframe
# dr.switch_to.frame(iframe)#切换
#
# if dr.find_element_by_link_text('帐号密码登录'):#判断是否已经有登录信息可以快速登录，如果是则点击账号密码登录
#     dr.find_element_by_link_text("帐号密码登录").click()#点击账号密码登录
#     dr.find_element_by_id('u').send_keys('838697566')
#     sleep(1)
#     dr.find_element_by_id('p').send_keys('123456')
#     sleep(1)
#     dr.find_element_by_id('login_button').click()
# else:#不存在登录信息，直接输入账号密码登录
#     dr.find_element_by_id('u').send_keys('838697566')
#     sleep(1)
#     dr.find_element_by_id('p').send_keys('123456')
#     sleep(1)
#     dr.find_element_by_id('login_button').click()
#
# #切换iframe窗口给主体
# dr.switch_to.default_content()
# sleep(2)
# #点击切换基础版
# dr.find_element_by_link_text('基本版').click()
# sleep(2)
# dr.quit()


#警告框处理(重点)
# from selenium import webdriver
# from time import  sleep
# from selenium.webdriver.common.action_chains import ActionChains

# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_tag_name('span')#获取设置元素
# #鼠标悬浮
# ActionChains(dr).move_to_element(e).perform()
# sleep(1)
# #获取搜索设置元素并点击
# dr.find_element_by_link_text('搜索设置').click()
#
# sleep(1)
# dr.find_element_by_id('issw1_2').click()#设置关闭
# sleep(1)
# #点击保存设置
# dr.find_element_by_link_text('保存设置').click()
#
# sleep(1)
# at=dr.switch_to.alert#将浏览器交给alert弹框
# print(at.text)#打印弹框的内容
#
# #确定
# at.accept()
#
# # at.dismiss()#取消
# sleep(1)
# dr.quit()


# 元素等待
# from selenium import webdriver
# from time import sleep
# from selenium.webdriver.support import expected_conditions as EC
# from  selenium.webdriver.support.ui import WebDriverWait
# from  selenium.webdriver.common.by import By
# import sys
# dr=webdriver.Firefox()
# dr.implicitly_wait(10)#隐式等待
# dr.get('https://www.taobao.com')
# dr.find_element_by_id('q')
# #显示等待
# try:
#     e=WebDriverWait(dr,5,0.5,ignored_exceptions=None).until(EC.presence_of_element_located((By.ID,'q')),'找不到')
#     e.send_keys('selenium')
#     sleep(2)
# except:
#     print(sys.exc_imfo())


# 页面滚动条操作
# from selenium import webdriver
# from time import  sleep
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/index.html')
# js="document.documentElement.scrollTop=10000"
# dr.execute_script(js)
# sleep(2)
# js="document.documentElement.scrollTop=0"
# dr.execute_script(js)
#
# dr.set_window_size(100,200)
# js="window.scrollTo(200,100)"
# dr.execute_script(js)

# 线性脚本开发(重点)
# from selenium import  webdriver
# from time import  sleep
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/index.html')
# dr.find_element_by_link_text('免费注册').click()#获取免费注册页面并点击
# sleep(1)
# dr.find_element_by_id('username').send_keys('liao1001')#获取用户元名素并模拟输入
# sleep(1)
# dr.find_element_by_id('email').send_keys('liao1001@qq.com')#获取邮箱元素并模拟输入
# sleep(1)
# dr.find_element_by_id('password').send_keys('123456')#获取密码元素并模拟输入
# sleep(1)
# dr.find_element_by_id('repassword').send_keys('123456')#获取确认密码元素并模拟输入
# sleep(1)
# dr.find_element_by_link_text('立即注册').click()#获取立即注册元素并点击
# sleep(5)
# url=dr.current_url#获取当前页面地址
# #断言：判断测试用例执行是否成功
# if url=='http://39.96.181.61/qftest-ds/user/index.html':#页面跳转到的地址是否与此地址相同，相同则注册成功
#     print("测试用例执行成功")
# else:#不相同则注册失败 测试用例执行失败
#     print("测试用例执行失败")
#
# sleep(1)
# dr.quit()

# 模块化驱动脚本开发(重点)
# from selenium import webdriver
# from time import sleep
# from selenium.webdriver.common.action_chains import ActionChains
#
# def login(dr):#登录函数
#     dr.find_element_by_link_text('登陆').click()#获取登陆元素并点击
#     sleep(1)
#     dr.find_element_by_id('username').send_keys('liao1001')#获取用户名输入框元素并模拟输入
#     sleep(1)
#     dr.find_element_by_id('password').send_keys('123456')#获取 密码输入框元素并模拟输入
#     sleep(1)
#     dr.find_element_by_link_text('登     陆').click()#获取登陆按钮并点击
#
#
# def logout(dr):#退出函数
#     #直接点击退出登录
#     # dr.find_element_by_link_text('退出登录').click()#获取退出登录元素并点击
#     #悬浮退出
#     my=dr.find_element_by_class_name('m')
#     ActionChains(dr).move_to_element(my).perform()#悬浮
#     sleep(1)
#     dr.find_element_by_link_text('退出').click()
#
# if __name__=='__main__':#此模块下不能被外部调用
#     dr = webdriver.Firefox()
#     dr.get('http://39.96.181.61/qftest-ds/index.html')
#     login(dr)
#     sleep(5)
#     logout(dr)
#     sleep(2)
#     dr.quit()



## 数据驱动脚本开发(重点)
# from selenium import webdriver
# from time import sleep
# import csv
# def mytest(file):
#     with open(file,'r',encoding='utf8') as f:
#         my=csv.reader(f)
#         mylist=[]
#         for i in my:
#             mylist.append(i[0])
#         dr=webdriver.Firefox()
#         dr.get('http://39.96.181.61/qftest-ds/index.html')
#         dr.find_element_by_link_text('免费注册').click()
#         sleep(1)
#         dr.find_element_by_id('username').send_keys(mylist[0])#获取用户名输入框并模拟输入  mylist[0]表示csv文件中第一个元素
#         dr.find_element_by_id('email').send_keys(mylist[1])#获取用邮箱输入框并模拟输入  mylist[1]表示csv文件中第二个元素
#         dr.find_element_by_id('password').send_keys(mylist[2])#获取密码输入框并模拟输入  mylist[2]表示csv文件中第三个元素
#         dr.find_element_by_id('repassword').send_keys(mylist[3])#获取确认密码输入框并模拟输入  mylist[3]表示csv文件中第四个元素
#         dr.find_element_by_link_text('立即注册').click()#获取立即注册并点击
#         sleep(5)
#         if dr.current_url==mylist[4]:#断言：判断当前页面是否是注册成功后页面
#             print("测试用例执行成功")
#         else:
#             print("测试用例执行失败")
#
#         sleep(2)
#         dr.quit()
#
# mytest('data.csv')
'''
案例:用xls存储数据的方式驱动脚本开发
excel存储数据进行数据驱动（熟练使用）：
    先安装xlrd模块：cmd  ->  pip3 install xlrd
从excel文件中读入数据：
    1、导包，import xlrd
    2、使用xlrd的方法打开excel文件（创建一个文件对象）
    3、获取excel文件的sheet页
    4、获取sheet页中的行数据、列数据、单元格数据
    5、需要遍历数据，你先要直到文件中有多少行、多少列数据
    6、使用for循环遍历
'''
# import xlrd
#
# def test(file,index):
#     ex=xlrd.open_workbook(file)
#     sh=ex.sheet_by_index(index)
#     return sh
#
# mysh=test('1.xls',0)
# print('行数：',mysh.nrows)#行数
# print('列数',mysh.ncols)#列数
# for i in range(0,mysh.nrows):
#     rows=mysh.row_values(i)
#     print(rows)#行数据
# for j in range(0,mysh.ncols):
#     cols=mysh.col_values(j)
#     print(cols)#列数据


# 二、页面滚动条，做成缓慢下拉的动画效果
# from selenium import webdriver
# from time import  sleep
# def scroll(url):
#     dr=webdriver.Firefox()
#     dr.get(url)
#     dr.maximize_window()#窗口最大化
#     n=0#用来存储移动的位置
#     for i in range(100):
#         n=i*100
#         js="document.documentElement.scrollTop="+str(n)#设置滚动位置
#         sleep(0.5)
#         dr.execute_script(js)#执行
#     sleep(1)
#     dr.quit()
#
# scroll('http://39.96.181.61/qftest-ds/index.html')




# 三．登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
# from selenium import webdriver
# from time import  sleep
# from selenium.webdriver.support.select import Select
# from selenium.webdriver.common.action_chains import ActionChains
# class Mytest():
#     def login(self,dr,username,passwd):#登录
#         dr.find_element_by_link_text('登陆').click()#获取登陆元素并点击
#         dr.find_element_by_id('username').send_keys(username)#获取用户名输入框元素并点击
#         dr.find_element_by_id('password').send_keys(passwd)#获取密码输入框元素并点击
#         dr.find_element_by_link_text('登     陆').click()#获取登陆元素并点击登录
#         sleep(5)
#
#     def address(self,dr):
#         dr.find_element_by_link_text('收件地址').click()#获取收货地址元素并点击
#         sleep(1)
#         dr.find_element_by_id('newadrbtn').click()#获取新建收件人信息并点击
#         sleep(1)
#         dr.find_element_by_id('receiver').send_keys('小张')#填写收件人姓名
#         sq=dr.find_element_by_id('areaslt-province')#获取省
#         mysq=Select(sq)
#         mysq.select_by_visible_text('湖南省')#设置湖南省
#         sleep(1)
#         cs=dr.find_element_by_id('areaslt-city')#获取市
#         mycs=Select(cs)
#         mycs.select_by_visible_text('常德市')#设置常德市
#         sleep(1)
#         qx = dr.find_element_by_id('areaslt-borough')  # 获取区县
#         myqx = Select(qx)
#         myqx.select_by_visible_text('武陵区')  # 设置武陵区
#         sleep(1)
#         dr.find_element_by_id('address').send_keys('湖南省常德市武陵区XXXXX')#设置详细地址
#         sleep(1)
#         dr.find_element_by_id('zip').send_keys('415000')#设置邮编
#         sleep(1)
#         dr.find_element_by_id('mobile').send_keys('15211112222')#设置手机号码
#         sleep(1)
#         dr.find_element_by_class_name('sm-green').click()#点击保存信息
#         sleep(5)
#
#     def logout(self,dr):  # 退出函数
#         #悬浮退出
#         my=dr.find_element_by_class_name('m')
#         ActionChains(dr).move_to_element(my).perform()#悬浮
#         sleep(1)
#         dr.find_element_by_link_text('退出').click()
#
#
# m=Mytest()
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/index.html')
# m.login(dr,'liao003','123456')
# m.address(dr)
# m.logout(dr)
# sleep(2)
# dr.quit()




# 四．把注册功能写成模块化
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











