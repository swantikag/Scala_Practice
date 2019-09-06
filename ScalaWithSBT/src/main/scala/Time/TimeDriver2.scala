import scala.io.StdIn._

object TimeDriver2 {
  def main(args: Array[String]) {
    var time1 = new Time2(readInt(), readInt())
    var time2 = new Time2(readInt(), readInt())

    val res = time1.isBefore(time2)
    if (res) println(time1 + " is before " + time2) else println(time2 + " is before " + time1)
  }
}
