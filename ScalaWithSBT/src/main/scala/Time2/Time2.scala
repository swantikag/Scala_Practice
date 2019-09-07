class Time2 {
  private var pvtHours=0
  private var pvtMins=0
  def this(h:Int, m:Int){
    this()
    this.hours=h
    this.mins=m
  }
  def hours=this.pvtHours

  def hours_=(h:Int): Unit = if(h<=23 && h>=0) this.pvtHours=h else this.pvtHours=0

  def mins:Int=this.pvtMins

  def mins_=(m:Int): Unit =if(m<=59 && m>=0) this.pvtMins=m else this.pvtMins=0

  private def convertToMins(time:Time2): Int = time.hours*60+time.mins

  def isBefore(that:Time2):Boolean = if(convertToMins(this)>convertToMins(that)) false else true

  override def toString: String = this.hours+" : "+this.mins
}
