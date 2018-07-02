object cincoPorLinea extends App {
  println("Valor origen: ")
  val a = readInt()
  println("Valor destino: ")
  val b = readInt()
  for (i <- a to b){
    if (i%5 == 4) println(i)
    else print(i.toString ++ " ")
  }
}
