object DataType {


  def main(args: Array[String]): Unit = {

     var num1:Int = 10;

    println(num1.toDouble+"1"+num1.toString)
    //scala中 nothing 是所有类型的子类 在抛出异常时候经常用
    //scala中有 Any对象 Any的子类为 AnyVal(值类型) AnyRef （引用类型） 所有的都是对象
    //scala中存在Null 和 Unit 相当于 null 与void 一样 即（）
    //基本数据类型 可以低精度往高精度做隐式转换
  }

  def  nothing:Nothing ={
    throw  new RuntimeException(" 抛出了一个异常")
  }


}

