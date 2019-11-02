package com.nanda.test

object array {
  def main(args: Array[String]): Unit = {
    //声明一个长度为5类型是Int的数组
    var arr1=new Array[Int](5);
    arr1(0)=1
    arr1(1)=2
    arr1(2)=3
    arr1(3)=4
    arr1(4)=5
    //println(arr1)
    //声明一个长度为3类型为string的数组
    //val arr2=new Array[String]("a","b","c")
    val arr2 = Array[String]("s100","s200","s300")
   /* for (i<-arr1){
      println(i)
    }*/
    //arr1.foreach(x=>println(x+1))
    /*arr2.foreach((str:String)=>{
      println("nihao:"+str)
    })*/
    /*arr2.foreach(str=> println("nihao:"+str))*/
    /*for(i<-arr2){
      println(i)
    }*/
    arr2.foreach(println)
    //声明了一个长度是3的二维数组，String类型的
    var arr3=new Array[Array[String]](3)
    arr3(0)=Array("1","2","3")
    arr3(1)=Array("4","5","6")
    arr3(2)=Array("7","8","9")
    arr3.foreach((x:Array[String])=>{
      x.foreach(y=>println(y))
    })
  }
}
