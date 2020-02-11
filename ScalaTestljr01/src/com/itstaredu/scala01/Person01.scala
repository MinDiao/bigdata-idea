package com.itstaredu.scala01

// 定义类
class Person01 {
    // 定义姓名，年龄
    var name:String = _
    var age:Int = _
}

// 继承app特质，可以不写main
object Test extends App{
    val p = new Person01
    p.name = "reba"
    p.age = 16
    println(p.name)
}