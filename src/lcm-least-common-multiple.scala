object minimoComunMultiplo extends App {
  def mcm (x:Int,y:Int) :Int={
    val a = x
    val b = y
    val arraya= new ArrayBuffer[Int]()
    val arrayb= new ArrayBuffer[Int]()
    for (i <- 1 to (a*b)){
      arraya += a*i
      arrayb += b*i
    }
    val c = arraya.intersect(arrayb)
    c.min
  }
  println(mcm(180,48))
}