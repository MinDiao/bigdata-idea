package com.itstaredu.scala01

/**
  * 混入特质
  */
object Pig02 extends Animal with Running {
    /**
      * 定义实现的方法
      */
    override def eat(name: String): Unit = {
        println(s"$name -> 吃猪食")
    }

    override def sleep(name: String): Unit = {
        println(s"$name -> 长膘")
    }

    def main(args: Array[String]): Unit = {
        Pig02.eat("猪猪")
        Pig02.how("八戒")
    }
}
