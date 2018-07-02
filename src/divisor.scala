object Divisores extends App {

  def escribeDivisores(n: Int): Unit = {
    require(n >= 0)
    var i = 1
    while (i <= n) {
      if (n % i == 0) println(i)
      i = i + 1
    }
  }

  def escribeDivisoresRec(n: Int): Unit = {
    def divide(n1: Int, n2: Int): Unit = {
      if (n1 == n2) println(n2)
      else if (n1 % n2 == 0) {
        println(n2)
        divide(n1, n2 + 1)
      }
      else divide(n1, n2 + 1)
    }

    if (n >= 0) divide(n, 1)
    else sys.error("No se puede")
  }

  def lista(n: Int): List[Int] = {
    var xs = List[Int]()
    for (i <- 1 to n) {
      xs = i :: xs
    }
    return xs.reverse
  }

  def divisores(n: Int): List[Int] = {
    var xs = lista(n)
    if (n >= 0) for (x <- xs if n % x == 0) yield x
    else sys.error("No se puede")
  }

  def divisores2(n: Int): List[Int] = {
    var xs = List[Int]()
    for (i <- 1 to n) {
      if (n % i == 0) xs = i :: xs

    }
    return xs.reverse
  }

  println(divisores2(10))
  println(divisores(10))
}