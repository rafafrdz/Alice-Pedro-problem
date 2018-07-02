object Fibonacci extends App{
  //Apartado a
  def escribeFibsHasta(n:Int):Unit = {
    require(n>=1)
    var c1 = 0
    var c2 = 1
    while(c2<=n){
      println(c2)
      c2 = c2+c1
      c1 = c2-c1
    }
  }
  //Apartado b
  def escribeFibs(n:Int):Unit = {
    var c = n
    var c1 = 0
    var c2 = 1
    while(c>=1){
      println(c2)
      c2 = c2+c1
      c1 = c2-c1
      c = c-1
    }
  }
  //Apartado c
  def escribeFibsList(n:Int):List[Int] = {
    require(n>=1)
    var xs = List[Int]()
    var c1 = 0
    var c2 = 1
    while(c2<=n){
      xs = c2::xs
      c2 = c2+c1
      c1 = c2-c1
    }
    return xs.reverse
  }
  escribeFibsHasta(20)
}