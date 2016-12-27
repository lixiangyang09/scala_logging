import java.io._
import java.net.URL

import org.apache.commons.compress.archivers.tar.TarArchiveInputStream
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream

import scala.io.Source
import sys.process._
import org.apache.log4j.{Level, Logger, PropertyConfigurator}

object Example {
  val logger = Logger.getLogger(getClass)
  def main(args: Array[String]): Unit = {
    PropertyConfigurator.configure("log4j.properties")
    println("Sample Scala Project")
    Logger.getRootLogger.setLevel(Level.INFO)
    //logger.setLevel(MyLevel.level)
    logger.setLevel(Level.DEBUG)

    logger.warn("warning test")
    logger.info("info test")
    logger.log(MyLevel.level, "my level")
    logger.debug("debug test")
    logger.trace("trace teest")
  }

}