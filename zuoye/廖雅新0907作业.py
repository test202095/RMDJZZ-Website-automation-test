#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 1.简述自动化测试流程？
# ①自动测试决定
# ②测试工具获取
# ③自动化测试引入
# ④制定测试计划、测试计划、测试开发
# ⑤测试执行与管理
# ⑥测试审批与评估
# 2.简述自动化测试的优势和局限性？
# 优势：自动化测试适用于更频繁的测试、回归测试及手工测试无法实现的测试、跨平台及重复性比较强的测试
# 局限性：测试结果人工判断更容易，软件版本不稳定以及涉及到物理设备交换的测试
# 3.请在电商网站上找10个元素,用id和name方式获取,打印元素除id和name外的其他属性,提交到git上
'''
后台登录界面
'''
from selenium import webdriver#导入驱动模块
# dr=webdriver.Firefox()#打开火狐浏览器
# dr.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')#进入电商系统后台管理登录页面
# #获取id为username的元素
# a=dr.find_element_by_id('username')
# #打印该元素的属性为type的值
# print('id为username的元素的type='+a.get_attribute('type'))
# #获取name='password'的元素
# b=dr.find_element_by_name('password')
# #打印该元素的属性为placeholder的值
# print('name为password的元素的placeholder='+b.get_attribute('placeholder'))
# dr.quit()
'''前台页面'''
# dr=webdriver.Firefox()#打开火狐浏览器
# dr.get('http://39.96.181.61/qftest-ds/')#电商系统前台网页
# c=dr.find_element_by_name('kw')#获取name为kw的元素
# print(c.get_attribute('class'))#打印该元素的class的值
# d=dr.find_element_by_id('top-userbar')#获取id为top-userbar的元素
# print(d.get_attribute('class'))#打印该元素的class的值
# e=dr.find_element_by_id('logined-userbar-tpl')#获取id为logined-userbar-tpl的元素
# print(e.get_attribute('type'))#打印该元素的type的值
# f=dr.find_element_by_id('unlogined-userbar-tpl')#获取id为unlogined-userbar-tpl的元素
# print(f.get_attribute('type'))#打印该元素的type的值
# g=dr.find_element_by_id('cartbar')#获取id为cartbar的元素
# print(g.get_attribute('href'))#打印该元素的href的值
# dr.quit()

'''前台注册页面'''
# dr=webdriver.Firefox()#打开火狐浏览器
# dr.get('http://39.96.181.61/qftest-ds/user/register.html')#进入注册页面
# h=dr.find_element_by_id('username')#获取id=username的元素
# print(h.get_attribute('data-warnpos'))#打印该元素的data-warnpos的值
# i=dr.find_element_by_name('email')#获取name=email的元素
# print(i.get_attribute('type'))#打印该元素的type的值
# k=dr.find_element_by_name('repassword')#获取name=email的元素
# print(k.get_attribute('data-warnpos'))#打印该元素的type的值
# dr.quit()
# 4.电商网站上找5个超链接元素,通过超链接文字获取元素,打印链接地址,提交到git上
dr=webdriver.Firefox()#打开火狐浏览器
dr.get('http://39.96.181.61/qftest-ds/')#进入前台页面
a1=dr.find_element_by_link_text('臭豆腐')#获取超链接文本为"臭豆腐"的超链接元素
print(a1.get_attribute('href'))#获取该超链接的href地址
a2=dr.find_element_by_link_text('烤鸭')#获取超链接文本为"烤鸭"的超链接元素
print(a2.get_attribute('href'))#获取该超链接的href地址
a3=dr.find_element_by_link_text('烧鹅')#获取超链接文本为"烧鹅"的超链接元素
print(a3.get_attribute('href'))#获取该超链接的href地址
a4=dr.find_element_by_link_text('小白')#获取超链接文本为"小白"的超链接元素
print(a4.get_attribute('href'))#获取该超链接的href地址
a5=dr.find_element_by_link_text('苹果')#获取超链接文本为"小白"的超链接元素
print(a5.get_attribute('href'))#获取该超链接的href地址
#关闭浏览器
dr.quit()


