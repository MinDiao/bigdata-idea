package com.itstaredu.scala01

/**
  * 继承抽象类可以再继承特质，但是抽象类写在前，特质写在后，用with连接
  */
object AbstractImpl extends AbstractDemo with Running {
    /**
      * 快捷键：ctrl + i
      */
    override def eat(food: String): Unit = {
        println(s"$food -> 吃猪蹄")
    }

    def main(args: Array[String]): Unit = {
        AbstractImpl.eat("hunter02")
    }
}
