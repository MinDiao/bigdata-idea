package com.itstaredu.akka

import akka.actor.{Actor, ActorSystem, Props}

object CallMe {
    /**
      * 1.创建ActorSystem，用ActorSystem创建Actor
      */
    private val acFactory = ActorSystem("AcFactory")

    /**
      * 2.Actor发送消息通过ActorRef
      */
    private val callRef = acFactory.actorOf(Props[CallMe], "CallMe")

    def main(args: Array[String]): Unit = {
        /**
          * 3.发送消息
          */
        callRef ! "Hunter很帅"
        callRef ! "Hunter不帅"

        // 用于关闭线程阻塞
        callRef ! "stop"
    }
}

class CallMe extends Actor {
    /**
      * Receive用户接受消息并且处理消息
      */
    override def receive: Receive = {

        // 模式匹配
        case "Hunter很帅" => println("你是对的")
        case "Hunter不帅" => println("你是错的")
        case "stop" => {
            /**
              * 关闭代理ActorRef
              */
            context.stop(self)

            /**
              * 关闭ActorSystem
              */
            context.system.terminate()
        }
    }
}
