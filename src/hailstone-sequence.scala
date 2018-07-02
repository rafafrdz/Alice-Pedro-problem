object Hailstone extends App{

  def plac(x:Int):List[Int] = {
    var c = x
    var xs = List[Int]()
    while (c!=1){
      if (c%2!=0){
        c = 3*c +1
        xs = c :: xs
      }
      else{
        c = c/2
        xs = c::xs
      }
    }
    return x:: xs.reverse
  }
  println(plac(7))
}