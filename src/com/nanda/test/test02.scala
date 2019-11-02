package com.nanda.test

object test02 {
  def main(args: Array[String]): Unit = {
    /*val age=19;
    if(age<18){
      println("未成年人不能上网")
    }else if(age==18){
      println("刚好成年了，我要放飞自我")
    }else if(age>18){
      println("再也不通宵了")
    }*/
    //println(1 to (10,3))

    //println(1 until(10,3))
    for (i <- 1 to 10;j<- 1 to 10){
        if(i>=j)
        println("i="+i+";j="+j)
    }
  }
}
