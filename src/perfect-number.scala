object Perfect extends App{
  def esPerfecto(n:Int):Boolean = {
    require(n>=1)
    var c = 0
    for (i<- 1 until n){
      if(n%i==0) c = c+i
      else c = c

    }
    return c == n
  }
  def tablaDePerfectos(n:Int): Unit = {
    require(n>=1)
    for(i<-1 to n){
      if(esPerfecto(i))println(i)
    }
  }
}