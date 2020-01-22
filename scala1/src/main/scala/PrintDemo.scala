object PrintDemo {

  def main(args: Array[String]): Unit = {
    val name = "xiaohong"
    val age: Int = 123

    var salary: Int = 29999
    var height: Int = 165

    print(name + age)

    println(s"我的名字叫\n$name,今年\n$age, 身高\n$height,月薪\n$salary")

    val arr = new Array[Int](10);
    for (item <- arr) {
      println(item)
    }
  }
}
