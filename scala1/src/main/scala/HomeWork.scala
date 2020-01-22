object HomeWork {

  def main(args: Array[String]): Unit = {
    /**
     * 一个数字如果为正数  则他的signum为 1 如果附属 那么signum为-1 如果为0 那么 signum wei 0 写函数
     *
     */
    println(sigNumGet(23))

    /**
     * 一个空的块表达式 值是什么  类型是什么
     * 是个Unit
     */
    var block = {}
    println(block)
    println(block.isInstanceOf[Unit])

    /**
     * 编写函数计算xn 其中n为整数 使用递归定义
     * 1 xn= x* xn-1
     * 2 x0 =1
     * 3 xn =1/x-n 如果n是负数的话
     * 4 不得使用return语句
     */


  }

  def mi(x: Double, n: Int): Double = {
    if (n == 0) {
      1
    } else if (n > 0) {
      x * mi(x, n - 1)
    } else {
      1 / mi(x, -n)
    }
  }

  def sigNumGet(n: Int): Int = {

    if (n > 0) {
      1
    } else if (n < 0) {
      -1
    } else {
      0
    }
  }

}
