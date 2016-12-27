package com
/**
  * Created by lxy on 2016/12/27.
  */

import com.typesafe.scalalogging.slf4j
import org.apache.log4j.Level
import org.apache.log4j.net.SyslogAppender


 class MyLevel(level:Int, name:String, syslogEquivalent:Int) extends Level(level,name,syslogEquivalent){

 }

object MyLevel{
  val level = new MyLevel(Level.DEBUG.toInt + 1000, "mylevel",SyslogAppender.LOG_LOCAL0)
}

