package com.nanda.test

object list {
  def main(args: Array[String]): Unit = {
    val list1=List(1,2,3,4)
    /*for (i<-list1){
      println(i)
    }*/
    //list1.foreach(x=>println(x))
   /* var result: Seq[Int] =list1.filter(x=>{
      if (x>1)
         true
      else
        false
    })
    result.foreach(println)*//*
    val result: Int =list1.count(x=>{
      if(x>1)
        true
      else
        false
    })

    println(result)*/
    /*val result =list1.map(x=>{x+1})
    result.foreach(println)*/
    val nameList = List(
      "hello a",
      "hello b",
      "hello c"
    )
    val result: List[Array[String]] =nameList.map(x=>{x.split("")})
    result.foreach(x=>{
      for (i<-x){
        println(x)
      }
    })

  }
}
