object multiplicacionRusa extends App {
  def ruso(a: Int, b: Int): Int = {
    var x = a
    var y = b
    var sol = 0
    while (x != 0) {
      if (x % 2 == 1) sol += y
      x /= 2
      y *= 2
    }
    sol
  }
  print(ruso(37, 12))
}