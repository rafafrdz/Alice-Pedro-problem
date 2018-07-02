bject Facts extends App {

  def fp(x:Int,d:Int):List[Int] = {
    var xs = List[Int]()
    var x1 = x
    var r = x%d
    var c = d
    while(x1>=c){
      if(r==0){
        xs = c::xs
        x1 = x1/c
        r = x1%c
      }
      else {
        c = c+1
        r = x1%c
      }
    }
    return xs.reverse
  }
}