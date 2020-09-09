#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
def test1(a,b,c,d):
    from selenium import webdriver
    dr=webdriver.Firefox()
    dr.get(a)#a是网站地址
    if d=='id':#与输入d的值进行比较
        e=dr.find_elements_by_id(b)
    elif d=='name':#与输入d的值进行比较
        e=dr.find_elements_by_name(b)
    elif d=='like':#与输入d的值进行比较
        e=dr.find_elements_by_link_text(b)
    elif d=='partial':#与输入d的值进行比较
        e=dr.find_elements_by_partial_link_text(b)
    elif d=='tag':#与输入d的值进行比较
        e=dr.find_elements_by_tag_name(b)
    elif d=='class':#与输入d的值进行比较
        e=dr.find_elements_by_class_name(b)
    elif d=='path': #与输入d的值进行比较
        e=dr.find_elements_by_xpath(b)
    elif d=='css':#与输入d的值进行比较
        e=dr.find_elements_by_class_name(b)
    else:
        print('输入d的值错误')
    for i in e:
     print(i.get_attribute(c))
     dr.quit()


test1('http://39.96.181.61/qftest-ds/user/login.html','username','name','id')
test1('http://39.96.181.61/qftest-ds/user/login.html','username','id','name')
test1('http://39.96.181.61/qftest-ds/user/login.html','免费注册','href','like')
test1('http://39.96.181.61/qftest-ds/','我的购物车','href','partial')
test1('http://39.96.181.61/qftest-ds/','a','href','tag')
test1('http://39.96.181.61/qftest-ds/','fl','name','class')
test1('http://39.96.181.61/qftest-ds/','//a','href','path')
test1('http://39.96.181.61/qftest-ds/','input.hide','type','css')


