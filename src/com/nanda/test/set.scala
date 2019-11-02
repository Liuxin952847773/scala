package com.nanda.test

object set {
  def main(args: Array[String]): Unit = {
    val set1=Set(1,2,3,4,5)
    val set2=Set(1,2,3)
    /*for (i<-set1){
      println(i)
    }*/
    //set1.foreach(println)
    //val result: Set[Int] =set1.intersect(set2);
    //val result=set1.&(set2)
    //val result=set1.diff(set2)
    //val result=set1.&~(set2);

    //x.subsetOf(y) 返回值结果：true（x是y的子集）
    //              返回值结果：false（x不是y的子集）
    //val result: Boolean =set2.subsetOf(set1);
    //println(result)
    /*for (i<-result){
      println(i)
    }*/
    //println(set1.min)
    //val result: Array[Int] =set1.toArray;
    val str: String =set1.mkString("~");
    println(str)
  }
}
