package collections


import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


object CharArrayDemo {

  def main(args: Array[String]): Unit = {
    val s: String = "HELLO"

    for (i <- s) {

      println(i)
    }

    println(s(2))


    var arr = new Array[Int](20)

    arr(2) = 2
    println(arr(2))
    var arr1 = Array(1, 2, "char")
    //不指定泛型那么 该数组的泛型为Any
    for (i <- arr1) {
      println(i)
    }
    import scala.collection.JavaConverters._
    val arrList = List("hi", "bye").asJava;
    var scalaArr: mutable.Buffer[String] = arrList.asScala
    // java.util.List ==> Buffer
    println(scalaArr)


    var arr2 = ArrayBuffer("1", "2")
    val pb = new ProcessBuilder(arr2) // Scala到Java的转换
   var a= pb.command();
  println(a)

  }
}
