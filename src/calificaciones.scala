object Calificaciones extends App {

  def puntuacion (a:Double, b:Double, c:Double, d:Double, e:Double, f:Double) : Double = {
    val punt0 = Array(a,b,c,d,e,f)
    val punt1 = punt0.sorted
    val notas = Array (punt1(1),punt1(2),punt1(3),punt1(4))
    var sum = 0.0
    for (i <- 0 until notas.length) {
      sum += notas(i)
    }
    sum/(notas.length)
  }
  print(puntuacion(4.7,3.2,9.1,1.8,2.4,7))
}
