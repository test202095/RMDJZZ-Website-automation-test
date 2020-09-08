#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 

#====#====今日代码====#====
#====#====find_element_by_xpath()====#====
#案例:在百度首页上用xpath随便找一个元素,并打印这个元素的其他属性值
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get("http://www.baidu.com")
# e=dr.find_element_by_xpath('//form[@id="form"]/input[1]') #找id属性为'form'的form元素的第一个input子元素
# print(e.get_attribute('name'))
# dr.quit()

#====#====find_element_by_css_selector(选择器.类样式值)====#====
#案例:自己写个有超链接的标签,通过class样式,找到该标签的href属性值
# <a class="yanshi1" href="http:ssss.sss.ssss" name="aaa">
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('01.html'))
# e=dr.find_element_by_css_selector('a.yanshi1') #(选择器.类样式值)
# print(e.get_attribute('href'))
# dr.quit()

#====#====find_elements_by_id(id的属性值)====#====
#自己写一个html文件,定义两个id属性值相同的标签,通过id获取多个元素,然后打印出各自其他的属性
#<p class="yanshi1" id="aa" name="段落1">定义两个id属性值相同的标签1</p>
#<p id="aa" name="段落2">定义两个id属性值相同的标签2</p>
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('01.html'))
# e=dr.find_elements_by_id('aa')
# # for i in e:
# #     print(i.get_attribute('name'))
# print(e[0].get_attribute('class'))   #type(e)=list 可以通过下标找到元素
# print(e[1].get_attribute('name'))
# dr.quit()

#====#====find_elements_by_name(name的属性值)====#====
#案例:自己写一个html文件,定义两个name属性值相同的标签,通过name获取多个元素,然后打印出各自其他的属性
#  <a class="yanshi1" href="http:ssss.sss.ssss" name="aaa">
#         <p>我是段落</p>
#         <b>我是普通文字</b>
#     </a><br>
#     <h1 name="aaa" id="h1">我是段落标签</h1>
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('01.html'))
# e=dr.find_elements_by_name('aaa')
# print(e[0].get_attribute('href'))
# print(e[1].get_attribute('id'))
# dr.quit()

#====#====find_elements_by_link_text("链接文字")-链接文本定位,<a>链接文字</a>标签====#====
#案例:自己写一个html文件,定义两个链接标签,链接文字相同的,通过链接文字获取多个元素,然后打印出各自的href属性
#<a class="yanshi2" href="http:ssss.sss.ssss" name="aaa">链接</a>
#<a href="http:xxxx.xxx.xxx">链接</a>
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('01.html'))
# e=dr.find_elements_by_link_text('链接')
# for i in e:
#     print(i.get_attribute('href'))
# dr.quit()

#====#====find_elements_by_partial_link_text("链接文字")  只要是链接就可以使用====#====
#案例:自己写一个html文件,定义两个链接标签,链接文字相同的,通过链接文字获取多个元素,然后打印出各自的href属性
#<a class ="yanshi1" href="http:ssss.sss.ssss" name="aaa" >
# # <p> 我是段落 </p>
#</a> <br>
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('01.html'))
# e=dr.find_elements_by_partial_link_text('我是段落')  #partial--局部的,部分的
# for i in e:
#     print(i.get_attribute('href'))
# dr.quit()

#====#====find_elements_by_tag_name(标签名)====#====
#案例:获取淘宝首页有多少个div,并打印出div里的id属性值
# from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get("https://www.taobao.com")
# e=dr.find_elements_by_tag_name('div')
# print(len(e)) #423
# for i in e:
#       if i.get_attribute('id'):
#         print(i.get_attribute('id')) #判断是否有元素id
# dr.quit()

#====#====find_elements_by_class_name("class属性值")====#====
# #案例:自己写一个有类样式的html页面,定义段落和链接标签,引用类样式,然后通过本函数获取这两个标签的其他属性
# #     <p class="yanshi1" id="aa" name="段落1">定义两个id属性值相同的标签1</p>
# #     <p id="aa" name="段落2">定义两个id属性值相同的标签2</p>
# #     <a class="yanshi1" href="http:ssss.sss.ssss" name="aaa">
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('01.html'))
# e=dr.find_elements_by_class_name('yanshi1')
# for i in e:
#     # if i.get_attribute('name'):
#         print(i.get_attribute('name'))
# dr.quit()

#====#====find_elements_by_xpath()====#====
from selenium import webdriver
# # import os
# # dr=webdriver.Firefox()
# # dr.get('file:///'+os.path.abspath('01.html'))
# # # e=dr.find_elements_by_xpath("//input[@type='checkbox']") #找元素=type='checkbox' 的input标签
# # # e=dr.find_elements_by_xpath("//form[@id='loginForm']/input")  #找元素=id='loginForm 的form标签下的input标签
# # e=dr.find_elements_by_xpath("//*[@type='checkbox']") #找元素=type='checkbox' 的标签
# # # e=dr.find_elements_by_xpath("/html/body/form")  #找form
# # # e=dr.find_elements_by_xpath("//form")   #找from 2个
# # # e=dr.find_elements_by_xpath("//form[input/@type='checkbox']")  #找form
# # # e=dr.find_elements_by_xpath("//input[@type='checkbox'][@name='旅游']") #找input /找元素为[@type='checkbox'][@name='旅游']的inp
# # print(len(e))
# # print('----------')
# # for i in e:
# #     print(i.get_attribute('name'))
# # dr.quit()

#====#====find_elements_by_css_selector(选择器.类样式值)====#====
#案例:写一个html文件,写类样式,名字要.myclass,定义多个超链接标签,引入类样式,获取各个超链表标签的链接
#  <a class="myclass" href="http:xxxx.xxxx.xx1" name="aaa">链接1</a>
#  <a class="myclass" href="http:xxxx.xxxx.xx2" name="aaaa">链接2</a>
from selenium import webdriver
import os
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('01.html'))
e=dr.find_elements_by_css_selector('a.myclass') #(选择器.类样式值)
for i in e:
    print(i.get_attribute('href'))
dr.quit()





