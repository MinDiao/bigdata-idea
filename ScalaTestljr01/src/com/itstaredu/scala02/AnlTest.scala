package com.itstaredu.scala02

object AnlTest extends Anl {
    /**
      * 定义灵活
      */
    override type T = String

    def main(args: Array[String]): Unit = {
        AnlTest.sleep("很香")
    }
}
