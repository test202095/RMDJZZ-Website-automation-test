#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====

# 把今天的代码重新敲一遍，上传到git上，这里一个.py文件
from selenium import webdriver
import os


'''
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h01.html'))
#e=dr.find_element_by_xpath('/html/body/form[1]')    #maker2,找的是form
#e=dr.find_element_by_xpath('//form[1]') #maker,找的是form
#e=dr.find_element_by_xpath("//form[@id='loginForm']")
#e=dr.find_element_by_xpath("//form[@id='loginForm']/input[1]")
#e=dr.find_element_by_xpath("//form[input/@name='username']")
#e=dr.find_element_by_xpath("//input[@name='username']")#
#e=dr.find_element_by_xpath("//input[@name='cin'][@type='submit']")#input
e=dr.find_element_by_xpath("//*[@name='cin'][@type='submit']")  #input

print(e.get_attribute('value'))
dr.quit()


#案例:在百度首页上用xpath随便找一个元素,并打印这个元素的其他属性值
#dr=webdriver.Firefox()
# dr.get("https://www.baidu.com")
# # e=dr.find_element_by_xpath("/html/head/meta[4]")
# # e=dr.find_element_by_xpath('//head[meta/@name="theme-color"]')#head
# e=dr.find_element_by_xpath('//meta[@name="theme-color"]')#meta
#
# print(e.get_attribute('content'))
# dr.quit()

dr=webdriver.Firefox()
dr.get("https://www.taobao.com")
xp=dr.find_element_by_xpath("//div[@class='cover J_Cover']/div[2]")
print(xp.get_attribute('class'))
dr.quit()



dr=webdriver.Firefox()
dr.get("file:///"+os.path.abspath('html/h02.html'))
e=dr.find_element_by_css_selector('p.content')
#e=dr.find_element_by_css_selector('a.mya')
print(e.get_attribute('id'))

dr.quit()

#案例:在百度上找一个元素,用css方式
dr=webdriver.Firefox()
dr.get('https://www.baidu.com')
e=dr.find_element_by_css_selector('div.s-isindex-wrap')
print(e.get_attribute('class'))
dr.quit()

dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h02.html'))
e=dr.find_element_by_css_selector('p.myb.myc.myd')
print(e.get_attribute('id'))
dr.quit()


dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h03.html'))
e=dr.find_elements_by_id('maker')
print(type(e))
print(e[0].get_attribute('name'))

dr.quit()

#自己写一个html文件,定义两个id属性值相同的标签,通过id获取多个元素,然后打印出各自其他的属性
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h03.html'))
e=dr.find_elements_by_id('code')
for i in e:
     print(i.get_attribute('name'))

dr.quit()

dr=webdriver.Firefox()
dr.get("http://www.baidu.com")
e=dr.find_elements_by_id('wrapper')
print(len(e))


#案例:自己写一个html文件,定义两个name属性值相同的标签,通过name获取多个元素,然后打印出各自其他的属性
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h04.html'))
e=dr.find_elements_by_name('maker')
print(len(e))
for i in e:
    print(i.get_attribute('id'))
dr.quit()

dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_elements_by_link_text('[美食专栏]诗词')
print(len(e))
for i in e:
    print(i.get_attribute('href'))

dr.quit()

dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h05.html'))

e=dr.find_elements_by_partial_link_text('aaaa')
for i in e:
    print(i.get_attribute('href'))

dr.quit()

#案例:获取淘宝首页有多少个div,并打印出div里的id属性值
dr=webdriver.Firefox()
dr.get("https://www.taobao.com")
e=dr.find_elements_by_tag_name('div')
print(len(e))
for i in e:
    if i.get_attribute('id'):
        print(i.get_attribute('id'))
dr.quit()


#案例:自己写一个有类样式的html页面,定义段落和链接标签,引用类样式,然后通过本函数获取这两个标签的其他属性
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h06.html'))
e=dr.find_elements_by_class_name('myclass')
print(e[0].get_attribute('id'))
print(e[1].get_attribute('href'))

dr.quit()

dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html/h07.html'))
#e=dr.find_elements_by_xpath("//input[@name='cin']")
#e=dr.find_elements_by_xpath("//form[@id='loginForm']/input")    #获取id下的所有input的值
#e=dr.find_elements_by_xpath("//*[@name='cin']")
# e=dr.find_elements_by_xpath('/html/body/form')
# e=dr.find_elements_by_xpath('//form')
# e=dr.find_elements_by_xpath('//form[input/@name="username"]')#找的是form
e=dr.find_elements_by_xpath("//input[@name='cin'][@type='submit']")

print(len(e))
print(e[0].get_attribute('type'))
#print(e[1].get_attribute('type'))
dr.quit()
'''

dr=webdriver.Firefox()

dr.get('file:///'+os.path.abspath('html/h08.html'))
e=dr.find_elements_by_css_selector('p.myclass')
for i in e:
    print(i.get_attribute('id'))

d=dr.find_elements_by_css_selector('a.myclass')
for i in d:
    print(i.get_attribute('href'))

dr.quit()

