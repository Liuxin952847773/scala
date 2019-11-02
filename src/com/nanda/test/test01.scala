package com.nanda.test

class Person(xname :String,xage:Int){
  private var name=xname;
  var age=xage;
  var pwd="xxx";
  def toStrings()={
    "my name is"+name
  }

  println("创建class时，除了方法不执行，其他的都执行")
  def this(xname :String,xage:Int,xPwd:String){
    this(xname,xage);
    pwd=xPwd;
  }
  println("你不要骗我")

}
object Person {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    println("hello scala1")
    var a:String="1";
    a="2";
    println(a)
    val b=1011;
    //b=2222;
    println(b);
    /*var person=new Person();
    person.age=19;
    println("年龄"+person.age+";姓名"+person.name)
    println(person.toStrings())*/
    var person=new Person("lisa",88,"11");
    /*println(person.toStrings())
    println(person.pwd)
    println(person.name)*/
    println(person.name)
    //class和object同命情况下
    //class可以和object相互调用内部private属性
    //object叫做class伴生对象
    //class叫做object伴生类
  }
}
