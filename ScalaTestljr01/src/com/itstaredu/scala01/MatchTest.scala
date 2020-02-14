package com.itstaredu.scala01

/**
  * 模式匹配
  */
object MatchTest {

    def main(args: Array[String]): Unit = {

        def strMatch(str:String) = str match {
            case "hunter" => println("很帅")
            case "reba" => println("很美")
            case _ => println("你是谁")
        }

        strMatch("hunter")

        def arrayMatch(arr:Any) = arr match {
            case Array(1) => println("只有一个元素的数组")
            case Array(1,2) => println("有两个元素的数组")
        }

        arrayMatch(Array(1))

        /**
          * 拓扑 tuple
          */
        def tuple(tuple:Any) = tuple match {
            case (1,_) => println("元祖的第一个元素为1，第二个元素为任意")
            case ("hunter",18) => println("他很帅")
        }

        tuple(("hunter",18))
    }
}
