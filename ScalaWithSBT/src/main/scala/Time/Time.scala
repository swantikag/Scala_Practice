import scala.io.StdIn._

class Time {
  private var pvtHours=0
  private var pvtMins=0
  def this(h:Int,m:Int){
    this()
    this.hours=h
    this.mins=m
  }

  def hours=pvtHours
  def hours_=(h:Int){
    if(h<=23 && h>=0) this.pvtHours=h else this.pvtHours=0
  }

  def mins=pvtMins
  def mins_=(m:Int){
    if(m<=60 && m>=0) this.pvtMins=m else this.pvtMins=0
  }

  def before(other:Time):Boolean={
    if(this.hours<other.hours){
      true
    }
    else if(this.hours>other.hours){
      false
  }
    else{
    if(this.mins<other.mins) true else false}
  }

  override def toString: String = hours+":"+mins
}
