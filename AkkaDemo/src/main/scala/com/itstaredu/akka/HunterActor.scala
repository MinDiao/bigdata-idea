package com.itstaredu.akka

import akka.actor.Actor

class HunterActor extends Actor{

    override def receive: Receive = {

        case "你好，我是热巴" => {
            println("你好，我是Hunter")
        }

        case "我爱Hunter" => {
            println("Hunter也爱热巴")
        }
    }
}
