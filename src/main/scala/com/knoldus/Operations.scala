package com.knoldus

class Operations {

  def operationOfSum(operation: String, leftOperand: Int, rightOperand: Int): Int = {
    def sum(f: (Int, Int) => Int, leftOperand: Int, rightOperand: Int): Int = {
      f(leftOperand, rightOperand)

    }

    operation.toLowerCase match {
      case "int" => sum((leftOperand, rightOperand) => leftOperand + rightOperand, leftOperand, rightOperand)
      case "cube" => sum((leftOperand, rightOperand) => (leftOperand * leftOperand * leftOperand) +
        (rightOperand * rightOperand * rightOperand), leftOperand, rightOperand)
      case "square" => sum((leftOperand, rightOperand) => (leftOperand * leftOperand) +
        (rightOperand * rightOperand), leftOperand, rightOperand)
    }

  }


  def operateList(operation: String, list: List[Int]): Int = {

    def operate(leftOperand: Int, rightOperand: Int, operating: (Int, Int) => Int): Int = {
      operating(leftOperand, rightOperand)

    }

    def count(leftOperand: Int, rightOperand: Int, operation: String): Int = {
      operation match
      {
        case "add" => operate(leftOperand: Int, rightOperand: Int, (elem1: Int, elem2: Int) => elem1 + elem2)
        case "product" => operate(leftOperand: Int, rightOperand: Int, (elem1: Int, elem2: Int) => elem1 * elem2)
      }
    }
    list match {
        case leftOperand :: rightOperand :: tail  => operateList(operation, count(leftOperand,rightOperand, operation)::tail)
        case leftOperand :: Nil => leftOperand
        case Nil => 0
      }

  }

}

