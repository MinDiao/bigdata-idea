package com.itstaredu.scala01

abstract class AbstractDemo {

    def eat(food:String)

    def sleep(how:String): Unit = {
        println(s"$how -> 很香")
    }
}
