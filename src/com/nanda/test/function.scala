package com.nanda.test

import java.util.Date

object function {
  def main(args: Array[String]): Unit = {
    def f1(x: Int, y: Int) = {
      x + y
    }

    //println(f1(1,2))
    def f2(i: Int): Int = {
      if (i == 1) {
        i
      } else {
        i * f2(i - 1)
      }
    }

    //println(f2(5))
    def f3(a: Int, b: Int = 10) = a + b

    //println(f3(10))
    def f4(elements: Int*) = {
      var num = 0
      for (i <- elements) {
        num = i + num
      }
      num
    }

    //println(f4(1,2,3,4,5,6,7,8,9))
    val f5 = (a: Int) => {
      a + 1
    }
    //println(f5(5))
    val f6 = () => {
      println("最近好冷呀")
    }

    //f6()
    def f7(a: Int) = {
      def f8(b: Int) = {
        a + b
      }

      f8(10)
    }

    //print(f7(2))
    def log(date: Date, s: String) = {
      println("date is " + date + ",log is " + s)
    }

    val date = new Date()
    //log(date ,"log1")
    //log(date ,"log2")
    //log(date ,"log3")
    //想要调用log，以上变化的是第二个参数，可以用偏应用函数处理
    val logWithDate = log(date, _: String)

    //logWithDate("log11")
    //logWithDate("log22")
    //logWithDate("log33")
    //高阶函数
    //1 函数的参数是函数 (函数，Int)
    def f9(f: (Int, Int) => Int, a: Int) = {
      f(a, 100) //f10(a,100)
    }

    def f10(x: Int, y: Int): Int = {
      x + y
    }

    //print(f9(f10, 20))
    f10(100, 20)

    //高阶函数，函数的返回值也是一个函数
    def f11(a: Int, b: Int): (Int, Int) => Int ={
      def f12(x: Int, y: Int): Int={
        a+b+x+y
      }
      f12
    }
    //val f13=f11(1,2);
    //print(f13(3,4))
    //println(f11(1,2)(3,4))
    def f13 (f:(Int,Int)=>Int):(Int,Int)=>Int={
      f
    }
    def f14(a:Int,b:Int):Int={
      a+b
    }
    //println(f13(f14)(2,3))
    /**
      * 柯里化函数
      */
    def f15(a :Int,b:Int)(c:Int,d:Int) = {
      a+b+c+d
    }
    println(f15(1,2)(3,4))
  }
}
