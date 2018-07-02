object Huracanes extends App {

  def categoríaHuracan(x: Int): String =
    if (x < 119) "Categoría 0"
    else if (x <= 153) "Categoría 1"
    else if (x <= 177) "Categoría 2"
    else if (x <= 209) "Categoría 3"
    else if (x <= 249) "Categoría 4"
    else "Categoría 5"

  //Veamos alguna prueba
  def prueba(x: Int) {
    println("Si la velocidad es " + x + "km/h entonces " + categoríaHuracan(x))
  }

  //Hagamos algunas pruebas
  prueba(119)
  prueba(224)
  prueba(222223)
}
