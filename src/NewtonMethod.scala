object newton extends App {

  val eps = 0.00001

  def cuadrado(x: Double): Double = { // Ésta función devuelve la función x^2
    x * x
  }

  def aprox(a: Double, b: Double): Boolean = { // Devuelve True si a y b están muy próximos entre sí
    if (a < b) (b - a) <= eps
    else (a - b) <= eps
  }

  def derivada(f: Double => Double, x: Double): Double = { // Función derivada
    (f(x + eps) - f(x)) / eps
  }

  def newtonRec(f: Double => Double, x: Double): Double = { //Newton de manera recursiva
    var xn = x
    if (!(aprox(f(xn), 0))) {
      xn = xn - (f(xn) / derivada(f, xn))
      newtonRec(f, xn)
    }
    else xn
  }

  def newton(f: Double => Double, x: Double): Double = { //Newton en bucle
    var xn = x
    while (!aprox(f(xn), 0)) xn = xn - (f(xn) / derivada(f, xn))
    xn
  }

  println(newton(cuadrado, 1))
  println(newtonRec(cuadrado, 1))
}