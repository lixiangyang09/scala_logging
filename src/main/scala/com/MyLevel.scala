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
  val myLevelName = "mylevel"
  val level = new MyLevel(Level.DEBUG.toInt + 1000, myLevelName,SyslogAppender.LOG_LOCAL0)
  def toLevel(name:String, defLevel:Level): Level = {
    if (name == myLevelName) level
    else Level.toLevel(name,defLevel)
  }
}

