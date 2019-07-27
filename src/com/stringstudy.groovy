package com

import java.awt.print.PrinterGraphics

def name = 'a single \'a\' string'
//println name
//print name.class

def thupleName = '''\
line one
line two
line three string'''
//println thupleName
//println thupleName.class

def doubleName = "this is a common String"
//println doubleName.class

def name2 = "Qndroid"
def sayHello = "Hello: ${name2}"
//println sayHello
//println sayHello.class

def sum = "The sum of 2 and 3 equals ${2 + 3}"//花括号中可以做任意的表达式
//println sum

def result = out(sum)
//println result
//println result.class

String out(String message){
    return message
}

//----字符串的方法------
def str = "groovy hello"
//字符串填充
//println str.center(8,'a')
//println str.center(8)//默认以“空格”来填充
//println str.padLeft(8,'a')//从左面填充，以a进行填充

//字符串比较(根据unicode编码比较)
def str2 = 'hello'
//println str.compareTo(str2) //java方式：比较字符串大小
//println str > str2 //groovy方式：比较字符串大小

//获取字符串指定的index值
//println str.getAt(0)
//println str[0]
//println str[0..2]

//字符串的减法操作:将str中包含str2的字符串去掉
//println str.minus(str2)
//print str - str2

//对字符串做逆向操作
println str.reverse()

//对字符串首字母大小
println str.capitalize()

//判断字符串是否是数字类型
def str3 = "23452245"
println str3.isNumber()

//将字符串转换为其它类型，例如：int型...
int a  = str3.toInteger();
println a