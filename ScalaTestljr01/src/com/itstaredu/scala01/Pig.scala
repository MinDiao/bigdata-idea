package com.itstaredu.scala01

object Pig extends Animal {

    override def eat(name: String): Unit = {
        println(s"$name -> 吃饭")
    }

    override def sleep(name: String): Unit = {
        println(s"$name -> 做梦")
    }

    def main(args: Array[String]): Unit = {
        Pig.eat("张三")
        Pig.sleep("李四")
    }
}
