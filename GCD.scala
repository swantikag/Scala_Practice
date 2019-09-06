class GCD{
	def calculateGCD(a:Int, b:Int):Int={
		val small = if(a<b) a else b
		val large = if(a>b) a else b
		println(small+" "+large)
		val answer = if(small==0) large else calculateGCD(large-small, small)
		answer
}
}
