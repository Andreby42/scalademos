object digui {

  def main(args: Array[String]): Unit = {
    //斐波那契 1，1,2,3,5,8,13
    //求函数值

    val sample = 7
    val res = fbn(sample)
    println(res)
    //求桃子数量 猴子吃桃 第一天吃一半 并多吃一个  之后每天吃一半 再多吃一个 当第十天的时候想再吃没有了 发现只有一个了

    println(peach(9))
    lazy val lazyV = sum(1, 3);
    println(lazyV)

    mockExceptions()

    /**
     * 打印金字塔
     */
    printPyramids()

  }

  def printPyramids() = {
    /**
     *
     */
    var end = 3
    for (i <- 1 to end) {
      for (j <- 1 to end-1) {
       System.out.print(" ")
      }
      for (k <- 1 to (2 * i - 1)) {
        print("*")
      }
      println("\n")
    }


  }


  def mockExceptions(): Unit = {
    try {
      var i = 10 / 0
    } catch {
      case ex: ArithmeticException => {
        println("catched a ArithmeticException")
      }
      case ex: Exception => {
        println("catched a exception")
      }
    } finally {
      println(" finally printed")
    }
  }

  def peach(n: Int): Int = {
    if (n == 10) {
      1
    } else {
      (peach(n + 1) + 1) * 2
    }
  }

  def fns(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * fns(n - 1) + 1
    }
  }

  def fbn(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }

  def sum(n1: Int, args: Int*): Int = {

    for (item <- args) {
      println(item)
    }
    args.length
  }
}