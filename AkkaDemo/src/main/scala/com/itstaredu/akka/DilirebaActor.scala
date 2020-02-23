package com.itstaredu.akka

import akka.actor.{Actor, ActorRef}

class DilirebaActor(val h:ActorRef) extends Actor{

    override def receive: Receive = {
        case "你好，我是热巴" => {
            /**
              * 热巴发消息给HunterActor
              */
            h ! "我爱Hunter"
        }
    }
}
