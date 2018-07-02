object Hijos extends App{
  import scala.math._
  import inform.util.aleatorios._
  def hijos(semilla:Int):Int = {
    val alt = Aleatorio(semilla)
    var c = 0
    var xs = List[Int]()
    while(xs.length!=2){
      val h =alt.uniforme(1,3)
      if(xs.contains(h)) c = c+1
      else{
        xs=h::xs
        c=c+1
      }
    }
    return c
  }
  def media(n:Int):Double = {
    var c = 0
    for(i<-1 to n){
      c = c + (hijos(i))
    }
    return (c/n)
  }
  println(media(10000))
  def desviacion(n:Int):Double = {
    var c = 0.0
    for(i<- 1 to n){
      c = c + pow((hijos(i) - media(n)),2)
    }
    return(sqrt(c/(n-1)))
  }
  println(desviacion(10000))
}
//Apartado b
object Hijos2 extends App {
  import inform.util.aleatorios._
  def hijostupla(semilla:Int):(List[Int],Int) = {
    val alt = Aleatorio(semilla)
    var c = 0
    var xs = List[Int]()
    while(xs.length!=2){
      val h =alt.uniforme(1,3)
      if(xs.contains(h)) c = c+1
      else{
        xs=h::xs
        c=c+1
      }
    }
    return (xs,c)
  }
  def hijos2(semilla:Int):Int = {
    val (xs,n) = hijostupla(semilla)
    val alt = Aleatorio(semilla)
    val h = alt.uniforme(1,3)
    var j = 0
    while(xs.head!=h){
      j=j+1
      val h = alt.uniforme(1,3)

    }
    return (j+n)
  }
}