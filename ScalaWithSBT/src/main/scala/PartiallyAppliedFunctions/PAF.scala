package PartiallyAppliedFunctions

object PAF {
  def main(args:Array[String]){
    def sum(a:Int, b:Int, c:Int):Int=a+b+c
    val z=sum _
    println("None Partially Applied Function")
    println(z(1,2,3))
    val x = sum(4,_:Int, _:Int)
    println("1 Partially Applied Function")
    println(x(4,6))
  }


}
