package com.itstaredu.scala01

class Person06(private var name:String,age:Int) {
    var high:Int = _

    def this(name:String,age:Int,high:Int){
        this(name,age)
        this.high = high
    }
}

/**
  * 注意：在伴生对象中可以访问类的私有成员方法和属性
  * 什么是伴生对象？→ 单例类名与类名相同
  */
object Person06 extends App {
    val p = new Person06("hunt",99)
    println(p.name)
}