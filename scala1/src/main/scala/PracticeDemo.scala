import java.awt.geom.Ellipse2D

object PracticeDemo {


  def main(args: Array[String]): Unit = {
    var egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with extentionRc;
    println(egg.x)
    println(egg.y)
    egg.grow(10,29);
    println(egg.x)
    println(egg.y)
  }


  trait extentionRc extends Ellipse2D.Double {

    def translates(x: Double, y: Double): Unit = {
      this.x = x;
      this.y = y;
    }

    def grow(x: Double, y: Double): Unit = {
      this.x += x;
      this.y += y;
    }
  }

}
