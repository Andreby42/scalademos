import scala.io.StdIn

object Ob {

  def main(args: Array[String]): Unit = {

    println(10 % 3)
    println(-10 % 3)
    //还有97天放假 还有多少个星期
    var a = 97 / 7;
    val b = 97 % 7;
    println("当前剩余" + a + "个星期零" + b + "天");
    if (b > 0) {
      a = a + 1
      println(a)
    } else {
      println(a)
    }
    //定义变量保存华氏温度 5/9*（华氏温度-100） 请求华氏温度对应的摄氏温度 测试温度为232.5
    val sheshi= huaShi(232.5);
    println(sheshi)
    println(max(5,3))


  }

  def huaShi(huashi: Double): String = {
    (5.0 / 9 * (huashi - 100.00)).formatted("%.2f")
  }


  def max(n1: Int, n2: Int): Int = {
    if (n1 > n2) {
      n1
    } else {
      n2
    }

  }
  def max(n1: Int, n2: Int,n3:Int): Int = {
    if (n1 > n2) {
      if (n1>n3){
        n1
      }else{
        n3
      }
    } else {
      if (n2>n3){
        n2
      }else{
        n3
      }
    }

  }
}
