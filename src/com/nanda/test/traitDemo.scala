package com.nanda.test

trait test01{
  val readType = "Read"
  val gender = "m1"
  def read(name:String){
    println(name+" is reading")
  }
}
trait Listen {
  val listenType = "Listen"
  val gender = "m2"
  def listen(name:String){
    println(name + " is listenning")
  }
}

class Product extends test01 with Listen{

}
object traitDemo {
  def main(args: Array[String]): Unit = {
    val product=new Product();
    product.read("我是test001")
    product.listen("我是你的第二个特征")
    println(product.listenType)
  }
}