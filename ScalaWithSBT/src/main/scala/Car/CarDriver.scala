object CarDriver {
  def main(args: Array[String]) {
    var car1 = new Car("Renault", "Kwid")
    var car2 = new Car("Renault", "Kwid", 2012)
    var car3 = new Car("Renault", "Kwid", "JK022323")
    var car4 = new Car("Renault", "Kwid", 2012, "JK022323")

    println(car1)
    println(car2)
    println(car3)
    println(car4)

  }
}
