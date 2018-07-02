object Primos extends App {
  import scala.math._

  def esPrimo (n:Int):Boolean = {
    var t = true
    for (i<-2 to (n-1)){
      if(n%i==0){
        t = false
      }
    }
    return t
  }

  def esPrimo2 (n:Int) : Boolean = {
    var t = true
    for (i<-2 to sqrt(n).toInt){
      if (n%i==0){
        t = false
      }
    }
    return t
  }

  def esPrimo3 (n:Int) : Boolean = {
    var i = 2
    while(n%i!=0){
      i = i+1
    }
    if (i==n)  true
    else false
  }
  println(esPrimo3(8))
}