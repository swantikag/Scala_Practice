class Rational(n:Int, d:Int){
	//PreCondition
	require(d!=0)
	//Private field
	private val g = gcd(n.abs, d.abs)
	val num:Int=n/g
	val den:Int=d/g
	//Auxillary Constructor for rational numbers with denominator 1
	def this(num:Int)=
		this(num,1)
	//Over-riding a method
	override def toString=
		num+"/"+den
	//Creating a new method and accessing the invoking object using this
	def +(that:Rational):Rational=
		new Rational(this.num*that.den+that.num*this.den, this.den*that.den)
	//Private Method
	private def gcd(a:Int, b:Int):Int=		
		if (b==0) a else gcd(b,a%b)

	def *(that:Rational):Rational=
		new Rational(this.num*that.num, this.den*that.den)

	//Operator Overloading
	def +(n:Int):Rational=
		new Rational(n*this.den+this.num, this.den)

	def *(n:Int):Rational=
		new Rational(this.num*n, this.den)

	def -(that:Rational):Rational=
		new Rational(this.num*that.den-that.num*this.den, this.den*that.den)
	def -(n:Int):Rational=
		new Rational(this.num-n*this.den, this.den)	
}
