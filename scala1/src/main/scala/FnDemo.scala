object FnDemo {

  def main(args: Array[String]): Unit = {

    var dog = new Dog;
    var sum = dog.getSum(1, 2);
    println(sum)
    //方法转函数
    var f1 = dog.getSum _
    println(f1(1, 2))
    //    函数定义
    val f2 = (n1: Int, n2: Int) => n1 + n2

    println(f2(2, 3))
  }

  class Dog {
    //方法定义
    def getSum(n1: Int, n2: Int): Int = {
      n1 + n2
    }
  }


}
