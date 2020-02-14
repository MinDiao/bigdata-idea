package com.itstaredu.scala01.demo

private[scala01] class Person05(var name:String,age:Int) {
    var high:Int = _

    def this(name:String,age:Int,high:Int){
        this(name,age)
        this.high = high
    }
}
