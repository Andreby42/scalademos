import scala.io.StdIn

/**
 * scala 键盘输入语句
 */
object InputDemo {

  def main(args: Array[String]): Unit = {
    println("请输入名字")
    val name= StdIn.readLine()
    println(name)
  }
}
