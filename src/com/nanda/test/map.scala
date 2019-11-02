package com.nanda.test

object map {
  def main(args: Array[String]): Unit = {
    var map = Map(
      "1" -> "男子100米",
      2 -> "女子100米"
    )
    /*println(map.get(2).get)*/
    /*for(x<-map){
      println("key:"+x._1+"~~~~value:"+x._2)
    }*/
    //map.foreach(x=>println("key:"+x._1+"~~~~value:"+x._2)
    //)
    //获取到map中所有的key
    //val result: Iterable[Any] =map.keys;
    //result.foreach(println)
    //合并map
    val map1 = Map(
      (1, "a"),
      (2, "b"),
      (3, "c")
    )
    val map2 = Map(
      (1, "aa"),
      (2, "aa"),
      (3, "bb"),
      (4, "cc")
    )
    //map1.++(map2).foreach(println)
    //map中的count的计数对key进行去重
    /* val result=map2.count(x=>{
      x._2.equals("aa")
    })
    println(result)*/
    //map2.filter(_._2.equals("aa")).foreach(println)
    /*val result: Map[Int, String] =map2.filter(x=>{
      if (x._2.equals("aa"))
        true
      else
        false
    })
  }*/
    //println(map2.contains(2))
    //exist
    println(map2.exists(f =>{
      f._2.equals("cc")
    }))
  }
}
