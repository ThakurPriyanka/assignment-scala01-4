package com.knoldus

import org.apache.log4j.Logger


object Application {

  def main(args: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass)
    val num1 = 1
    val num2 = 2
    val num3 = 4
    val num4 = 6
    val num5 = 8
    val operation = "int"
    val operationObject = new Operations
    val list = List(num1, num2, num3, num4, num5)
    log.info(s"Sum of list  ${operationObject.operationOfSum(operation,num1,num2)} \n")
   log.info(s"Operations ${operationObject.operateList("add",list)}")
  }

}

