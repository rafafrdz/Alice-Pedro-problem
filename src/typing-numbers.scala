object numerosTyping extends App {
  println("Elige un numero: ")
  var num = readInt()
  var array = new ArrayBuffer[Int]()
  while (num != 0) {
    array += num
    println("Elige un numero: ")
    num = readInt()
  }
  val maximo = array.sorted.reverse(0)
  val minimo = {
    array=array.sorted
    array(0)
  }
  val cont = array.length
  var suma = 0.0
  for (a<-array) suma +=a
  print("Máximo = " + maximo + ", Mínimo = " + minimo + ", Promedio = " + (suma/cont) )
}