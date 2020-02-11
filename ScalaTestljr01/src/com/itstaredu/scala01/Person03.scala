package com.itstaredu.scala01

/**
  * 定义主构造器
  */
class Person03(var name:String,age:Int) {
    var high:Int = _
    var weight:Int = _

    /**
      * 定义辅助构造器
      */
    def this(name:String,age:Int,high:Int){
        // 注意：在辅助构造器中必须先调用主构造器
        this(name,age)
        this.high = high
    }

    /**
      * 辅助构造器可以是多个
      */
    def this(name:String,age:Int,hight:Int,weight:Int){
        this(name,age)
        this.weight = weight
    }
}

object Test2 extends App{
    /**
      * 如果主构造器中成员变量属性没有被val、var修饰的情况，该属性不能被访问；
      * 相当于java中没有对外提供get方法。
      *
      * 如果成员属性使用var修饰的情况，相当于java中对外提供了get方式和set方式。
      * 如果成员属性使用val修饰的情况，相当于java中对外只提供了get方式。
      */
    val p = new Person03("Hunter",18)
    println(p.name)
}
