import scala.io.StdIn.readInt

object TimeDriver{
  def main(args:Array[String]):Unit={
    var time1=new Time(readInt(),readInt())
    var time2=new Time(readInt(),readInt())
    val res=if(time1.before(time2))true else false
    if(res) println(time1 + " is before " + time2) else println(time2 + " is before " + time1)
  }
}
