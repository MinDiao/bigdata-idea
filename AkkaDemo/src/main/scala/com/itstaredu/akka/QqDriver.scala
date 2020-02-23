package com.itstaredu.akka

import akka.actor.{ActorSystem, Props}

object QqDriver {

    /**
      * 1.创建ActorSystem，用ActorSystem创建Actor
      */
    private val qqFactory = ActorSystem("QqFactory")

    /**
      * 2.Actor发送消息通过ActorRef（创建代理）
      */
    private val hRef = qqFactory.actorOf(Props[HunterActor], "Hunter")

    /**
      * 3.热巴需要接收Hunter发送的消息（创建代理）
      */
    private val dRef = qqFactory.actorOf(Props(new DilirebaActor(hRef)), "Dilireba")

    def main(args: Array[String]): Unit = {
        /**
          * ① Hunter自己给自己发消息
          */
        // hRef ! "我爱Hunter"

        /**
          * ② Dilireba给Hunter发消息
          */
        dRef ! "你好，我是热巴"
    }
}
