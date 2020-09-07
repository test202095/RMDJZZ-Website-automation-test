#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 一.简述自动化测试流程？
# 1.自动测试决定
# 2.测试工具获取
# 3.自动化测试引入
# 4.制定测试计划（5w1H）、测试设计（测试用例：测试步骤、测试数据、预期结果）、测试开发（编写测试脚本、在工具中完成测试场景的开发）---最关键的一个环节
# 5.测试执行与管理（脚本的运行、过程监控、结果管理）
# 6.测试审评和评估
#
# 二.简述自动化测试的优势和局限性？
# 优势:
# 执行效率高,可靠性高,全天候全时段运行,准确度高,精确度高,不易出错
# 局限性:
# 如果代码不对，就无法得出准确结果;如果被测试的程序界面修改了，代码也不能正常运行没有错误联想功能
#
# 三.请在电商网站上找10个元素,用id和name方式获取,打印元素除id和name外的其他属性,提交到git上
from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get("http://39.96.181.61/qftest-ds/")
# e=dr.find_element_by_name('kw')
# print(e.get_attribute('type'))
# dr.quit()

# dr=webdriver.Firefox()
# dr.get("http://39.96.181.61/qftest-ds/")
# e=dr.find_element_by_id('top-userbar')
# print(e.get_attribute('class'))
# dr.quit()

# 四.电商网站上找5个超链接元素,通过超链接文字获取元素,打印链接地址,提交到git上
dr=webdriver.Firefox()
dr.get("http://39.96.181.61/qftest-ds/")
e=dr.find_element_by_link_text('首页')  #dsfs #中国 wan #a  #dady
print(e.get_attribute('href'))
dr.quit()

