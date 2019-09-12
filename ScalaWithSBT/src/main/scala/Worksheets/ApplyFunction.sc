//Case 1
object Greet{
  def apply(name:String):String="Hello, "+name
}

//Explicit Call to apply method of singleton object
Greet.apply("World")

//Case 2
//With Case Classes
case class Car(manufacturer:String, model:String, year:Int)

//apply method of the companion object can be called as follows:
val c1= Car.apply("Renault", "kwid", 2016)
val c2 = Car("Renault", "Duster", 2016)
//Constructor can also be called
val c3 = new Car("Renault", "Kwid", 2018)

//Anonymous functions use apply method implicitly
val f1 = (x:Int)=>x*2
f1(4)
f1.apply(4)
//f1 is actually an object of type Function1
f1.getClass

//Classes with apply method
class Container{
  private val elements = Array("Books", "Pen", "Laptop")

  def apply(index:Int)=if(index<=elements.length)elements(index) else "Index Not Found"
}

val container = new Container
container(2)