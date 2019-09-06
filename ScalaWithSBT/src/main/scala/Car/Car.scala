import javax.print.attribute.standard.PrinterMoreInfoManufacturer

class Car(man:String, name:String) {
  private val manufacturer = man
  private val modelName = name
  private var modelYear = -1
  private var licensePlate = ""

  def this(manufacturer:String, modelName:String, year:Int, plate:String){
    this(manufacturer,modelName)
    this.modelYear=year
    this.licensePlate=plate
  }

  def this(manufacturer: String, modelName: String, plate: String){
    this(manufacturer, modelName, -1, plate)
  }

  def this(manufacturer: String, modelName: String, year: Int) {
    this(manufacturer, modelName, year, "")
  }

  override def toString: String = "Manufacturer: "+this.manufacturer+"\nModel Name: "+this.modelName+"\nModel Year: "+this.modelYear+"\nLicense Plate: "+this.licensePlate


}
