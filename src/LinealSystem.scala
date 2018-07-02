object sistemaLineal extends App {
  def sistema (a:Double, b:Double, c:Double, d:Double, e:Double, f:Double) : String ={
    if ((a*e-b*d) != (0.0)) {
      val x = (c*e-b*f)/(a*e-b*d)
      val y = (a*f-c*d)/(a*e-b*d)
      "La solución del sistema es x=" ++ x.toString ++ " e y=" ++ y.toString
    }
    else "Sistema Compatible Indeterminado ó Sistema Incompatible"
  }
  print(sistema(1,1,4,1,1,4))
}
