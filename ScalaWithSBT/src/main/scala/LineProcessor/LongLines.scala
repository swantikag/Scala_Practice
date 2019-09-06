package LineProcessor
import scala.io.Source

object LongLines {
  def processFiles(filename:String, width:Int): Unit ={
    //Local Function - only visible to enclosing function
    //               - can access the parameters of the enclosing function
    def processLines(line: String): Unit ={
      if(line.length>width) println(filename+" : "+line.trim)
    }

    val source = Source.fromFile(filename)
    for(line <- source.getLines()){
      processLines(filename, width, line)
    }
  }
}


