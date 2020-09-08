#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
import os
from time import sleep
#课堂练习一．把今天的代码重新敲一遍，上传到git上，这里一个.py文件
# dr=webdriver.Firefox()#打开火狐浏览器
# # dr.get('http://39.96.181.61/qftest-ds/')
# # #写/html/body/form[1]或者/html/body/form[1]报错是因为在body的下一级没有form表单元素
# # e=dr.find_element_by_xpath('//form')
# # print(e.get_attribute('action'))
# # dr.quit()
#用本地文件练习通过路径获取元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_element_by_xpath('/html/body/form')#如果是访问第一个则不用加[i]默认从1开始，访问除了第一个以外的则加上[i]
# e=dr.find_element_by_xpath('//form[2]')#如果是访问第一个则不用加[i]默认从1开始，访问除了第一个以外的则加上[i]
# e=dr.find_element_by_xpath('//form[@id="login"]')#默认返回的是获取到满足条件的第一个元素
# e=dr.find_element_by_xpath('//form[input/@name="username"]')#默认返回的是第一个满足条件的form（form下有一个input的name='username'）
# e=dr.find_element_by_xpath('//form[@id="login"]/input[2]')#找到满足条件的form表单（id=login），再找form表单下的第i个input
# e=dr.find_element_by_xpath('//input[@name="username"]')#默认返回满足name='usename'的第一个input元素
# e=dr.find_element_by_xpath('//input[@name="tj"][@type="submit"]')#默认返回满足两个条件的第一个input元素
# e=dr.find_element_by_xpath('//*[@name="username"][@id="username"]')#默认返回满足两个条件的第一个元素
# print(e.get_attribute('id'))
# dr.quit()

# dr.get('file://'+os.path.abspath('HTML02/zuoye.html'))
#案例:在百度首页上用xpath随便找一个元素,并打印这个元素的其他属性值
# dr=webdriver.Firefox()
# dr.get('http://www.baidu.com')
# # e=dr.find_element_by_xpath('//input[@id="kw"]')
# print(e.get_attribute('class'))
# dr.quit()

#通过css来获取元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_element_by_css_selector('input.username')#通过类选择器username，属于inpu元素，来获取
# print(e.get_attribute('id'))
# dr.quit()


#通过id获取多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_elements_by_id('commit')#返回相同id且id=commit的元素，以列表返回
# print(len(e))
# for i in e:
#     print(i.get_attribute('value'))
# dr.quit()

#通过name来获得多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_elements_by_name('tj')#返回name=tj的列表e
# print(len(e))
# for i in e:
#     print(i.get_attribute('id'))
# dr.quit()


#通过超链接文字获取多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_elements_by_link_text("百度")#放回全部a标签中文字为百度的元素列表
# print(len(e))
# for i in e:
#     print(i.get_attribute('href'))
# dr.quit()

#通过超链接的子元素的文字获取多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_elements_by_partial_link_text('腾讯')#返回a标签下子元素的文字中有腾讯的
# print(len(e))
# for i in e:
#     print(i.get_attribute('id'))
# dr.quit()

# from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/')
# e=dr.find_elements_by_partial_link_text('烧猪')
# print(len(e))
# for i in e:
#     print(i.get_attribute('href'))
# dr.quit()

#通过标签名获取多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_elements_by_tag_name('input')#返回标签为input的全部元素列表
# print(len(e))
# for i in e:
#     if i.get_attribute('id'):
#         print(i.get_attribute('id'))
# dr.quit()

#案例:获取淘宝首页有多少个div,并打印出div里的id属性值
# dr=webdriver.Firefox()
# dr.get('http://www.taobao.com')
# e=dr.find_elements_by_tag_name('div')
# sleep(5)
# print(len(e))
# for i in e:
#     if i.get_attribute('id'):
#         print(i.get_attribute('id'))
# dr.quit()


#通过class获得多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# e=dr.find_elements_by_class_name('username')#返回类名为username的全部元素列表
# print(len(e))
# for i in e:
#     print(i.get_attribute('id'))
# dr.quit()

#通过路径获得多个元素
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
# # e=dr.find_elements_by_xpath('/html/body/form')#返回该路径下全部form元素列表
# # e=dr.find_elements_by_xpath('//form')#返回全部form元素列表
# # e=dr.find_elements_by_xpath('//form[@id="login"]')#返回满足条件的form元素列表
# # e=dr.find_elements_by_xpath('//form[input/@name="username"]')#返回满足form下input元素中name=username的全部form元素列表
# # e=dr.find_elements_by_xpath('//form[@id="login"]/input[@name="username"]')#先找到form表单id=login的，再找这个form下input中name=username的元素列表
# # e=dr.find_elements_by_xpath('//input[@name="tj"]')#返回满足条件的input元素列表
# # e=dr.find_elements_by_xpath('//input[@name="tj"][@type="submit"]')#返回满足两个条件的input元素列表
# e=dr.find_elements_by_xpath('//*[@name="tj"][@type="submit"]')#返回满足两个条件的元素列表
# print(len(e))
# for i in e:
#     print(i.get_attribute('id'))
# dr.quit()

#通过css获取多个元素
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('HTML02/zuoye.html'))
e=dr.find_elements_by_css_selector('input.username')#返回类选择器为username的input元素列表
print(len(e))
for i in e:
    print(i.get_attribute('type'))
dr.quit()
