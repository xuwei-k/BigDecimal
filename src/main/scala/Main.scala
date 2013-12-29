
object Main {

  def main(args: Array[String]){
    try{
      BigDecimal(1, Int.MaxValue).toInt
    }catch{
      case e: Throwable =>
        e.printStackTrace
    }
  }

}

