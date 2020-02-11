package com.itstaredu.scala01

/**
  * 定义构造器
  */
class Person02(name:String,age:Int) {

}

object Test1 extends App{
    val p = new Person02(name = "mimi",28)
    println(p)
}
