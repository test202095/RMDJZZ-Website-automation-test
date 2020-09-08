#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 三．通过获取多个元素的方式获取元素，分别用id,name,链接文字，子链接文字，标签名，class,路径，css,
# 在电商网上至少各自找2个以上元素，并打印出其他属性，这里一个.py文件
from selenium import webdriver#引入驱动
def mytest(url,ys,md,type):
    dr = webdriver.Firefox()
    dr.get(url)
    if type=='id':#通过id获得多个元素
        e=dr.find_elements_by_id(ys)
    elif type=='name':#通过name获得多个元素
        e=dr.find_elements_by_name(ys)
    elif type=='link':#通过链接文字获取多个元素
        e=dr.find_elements_by_link_text(ys)
    elif type=='zlink':#通过链接子元素文字获取多个路径
        e=dr.find_elements_by_partial_link_text(ys)
    elif type=='tgname':#通过标签名获取多个元素
        e=dr.find_elements_by_tag_name(ys)
    elif type=='class' :#通过class获取多个元素
        e=dr.find_elements_by_class_name(ys)
    elif type=='path':#通过路径获得多个元素
        e=dr.find_elements_by_xpath(ys)
    elif type=='css':#通过css获得多个元素
        e=dr.find_elements_by_css_selector(ys)
    else:
        print("获取方式错误")
    # print(len(e))#打印长度
    for i in e:#打印获得的列表的元素的其他属性的值
        if i.get_attribute(md):
            print(i.get_attribute(md))
    print('---------')#用来分割每个执行的打印
    dr.quit()#关闭浏览器

#通过id获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/user/login.html','username','name','id')
mytest('http://39.96.181.61/qftest-ds/user/login.html','password','name','id')
#通过name获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/user/login.html','username','id','name')
mytest('http://39.96.181.61/qftest-ds/user/login.html','username','name','name')
#通过链接文字获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/user/login.html','免费注册','href','link')
mytest('http://39.96.181.61/qftest-ds/user/login.html','忘记密码','href','link')
#通过子链接文件获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/','我的购物车','href','zlink')
mytest('http://39.96.181.61/qftest-ds/','0','href','zlink')
#通过标签名获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/','a','href','tgname')
mytest('http://39.96.181.61/qftest-ds/','div','class','tgname')
#通过class获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/','fl','name','class')
mytest('http://39.96.181.61/qftest-ds/','fl','class','class')
#通过路径获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/','//a','href','path')
mytest('http://39.96.181.61/qftest-ds/','//div','class','path')
#通过css获取多个元素的其他属性的值
mytest('http://39.96.181.61/qftest-ds/','input.hide','type','css')
mytest('http://39.96.181.61/qftest-ds/','div.wbox','class','css')



