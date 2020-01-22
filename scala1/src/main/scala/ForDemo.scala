import scala.io.StdIn
import scala.util.control.Breaks._;

object ForDemo {

  def main(args: Array[String]): Unit = {


    var res = for (i <- 3 to 10) yield i + 1
    println(res)

    for (i <- Range(1, 10, 2)) {
      println(i)
    }
    //打印1-100之间所有是9的倍数的整数的个数和总和
    var j = 0
    var k = 0
    for (i <- 1 to 100 if i % 9 == 0) yield {
      j += i
      k += 1
    }
    println(j)
    println(k)
    //100以内的数求和 求出当和当第一次大于20的当前数
    val start = 0;
    val end = 100;
    var sum = 0;
    var result = 0;
    breakable {
      for (item <- start to end) {
        if (sum > 20) {
          result = item;
          break();
        }
        sum += item;
      }
    }
    //守卫实现
    var sum2 = 0;
    var flag = true;
    var result2 = 0
    for (item <- start to end if flag) {
      if (sum2 > 20) {
        result2 = item;
        flag = false
      }
      sum2 += item;
    }


    printf("当和当第一次大于20的当前数 为%d", result2)
    //实现登录 三次机会 账号 a 123 并提示还有几次机会
    println("")

    var times = 3;
    breakable {
      for (i <- 1 to times) {
        println("请输入账号")
        var name = StdIn.readLine();
        println("请输入密码")
        var pass = StdIn.readLine()
        if (i != 3) {
          if (!name.equals("a") || (!pass.equals("123"))) {
            printf("当期还有%s次机会", times - i);
          } else {
            println("登录成功")
            break()
          }
        }


        if (i == 3)
          println("账号密码错误次数超过上限,已锁定")

      }
    }
    //某人有10万元 过路要交费 1.现金>5万 交5% 2现金小于等于5万 缴纳1000 计算他可以过多少路口

    var crosses = 0
    var money = 100000.00
    //    do {
    //      if (money>50000){
    //        money= money-(money*0.05)
    //      }else{
    //        money-=1000.00
    //      }
    //      crosses+=1
    //    }while(money>=1000.00)

    while (money >= 1000.00) {
      if (money > 50000) {
        money = money - (money * 0.05)
      } else {
        money -= 1000.00
      }
      crosses += 1
    }
    printf("过了%s个路口", crosses)
  }

}
