package com.itstaredu.scala01

/**
  * 类的构造器访问权限，private 私有
  * 主构造器设为私有
  */
class Person04 private (var name:String,age:Int) {
    var high:Int = _

    /**
      * 辅助构造器不设私有
      */
    def this(name:String,age:Int,high:Int){
        this(name,age)
        this.high = high
    }
}
