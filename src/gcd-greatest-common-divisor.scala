object maximoComunDivisor extends App{
  def mcd (x:Int, y:Int): Double ={
    var d = 0
    var a = x
    var b = y
    while (a%2==0 && b%2==0){
      a/=2
      b/=2
      d+=1
    }
    while (a!=b){
      if (a%2==0) a/=2
      else if (b%2==0) b/=2
      else if (a>b) a = (a-b)/2
      else b = (b-a)/2
    }
    val sol = a*pow(2,d)
    sol
  }
  println(mcd(48,18))
  println(mcd(150,25))
}