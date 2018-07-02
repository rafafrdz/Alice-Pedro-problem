object MaximoComunDivisor extends App {

  def mcd1(n1: Int, n2: Int): Int = {
    def aux(ac: Int, n: Int): Int =
      if (n == 0) ac
      else aux(n, ac % n)

    if (n1 >= 0 && n2 >= 0) aux(n1, n2)
    else sys.error("No se puede")
  }

  def mcd2(n1: Int, n2: Int): Int = {
    require(n1 >= 0 && n2 >= 0)
    var a1 = n1
    var a2 = n2
    while (a2 != 0) {
      var c = a1 % a2
      a1 = a2
      a2 = c
    }
    return a1
  }

  println(mcd2(400, 1028))
}