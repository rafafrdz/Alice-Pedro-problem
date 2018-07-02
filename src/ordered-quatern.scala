
object Compara extends  App {
  def ordena (x:Int, y:Int) :  (Int,Int) = {
    if (x<=y) (x,y)
    else (y,x)
  }
  def cadenaOrdenada (a:Int, b:Int, c:Int, d:Int) : Any = {
    var (x,y) = ordena(a,b)
    var (z,w) = ordena(c,d)
    if (y<=z) (x,y,z,w)
    else if (z<y) {
      var temp = z
      z = y
      y = temp
      var (p,q) = ordena (x,y)
      var (r,s) = ordena (z,w)
      if (r<q) (p,r,q,s)
      else (p,q,r,s)
    }
  }
  println(cadenaOrdenada (4,3,2,1))
  println(cadenaOrdenada (3,1,7,9))
  println(cadenaOrdenada (5,1,6,2))
}