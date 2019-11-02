package com.nanda.test

object tuple {
  def main(args: Array[String]): Unit = {
    val tuple=new Tuple1(1)
    val tuple2=Tuple2("a","ccc")
    val tuple22 = new Tuple22(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)
    //使用
    println(tuple2._1 + "\t"+tuple2._2)
    /*val pro=tuple22.productIterator;
    while(pro.hasNext){
      println(pro.next())
    }*/
    val result=tuple2.swap;
    println(result._1 + "\t"+result._2)
  }
}
