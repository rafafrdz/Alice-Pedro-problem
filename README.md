### Alice and Pedro problem

![](http://i67.tinypic.com/34reqm1.jpg)

```scala
object monedasAliciayPedro extends App {
  import inform.util.aleatorios._
  def alicia (s:Int) :Int={
    var c = 0
    val alt = Aleatorio(s)
    var d1 = alt.entero(1,2) // Donde 1 es cara y 2 es cruz
    var xs = Array[Int](0,0)
    do {
      xs(0)= xs(1)
      d1=alt.entero(1,2)
      xs(1)=d1
      c+=1
    } while (!(xs(0)==1 && xs(1)==1))
    c
  }

  def pedro (s:Int) :Int={
    var c = 0
    val alt = Aleatorio(s)
    var d1 = alt.entero(1,2) // Donde 1 es cara y 2 es cruz
    var xs = Array[Int](0,0)
    do {
      xs(0)= xs(1)
      d1=alt.entero(1,2)
      xs(1)=d1
      c+=1
    } while (!(xs(0)==2 && xs(1)==1))
    c
  }

  def promAlicia(n:Int):Double ={
    var c = 0
    for (i <- 1 to n){
      c += alicia(i)
    }
    c.toDouble/n
  }

  def promPedro(n:Int) :Double={
    var c = 0
    for (i <- 1 to n){
      c += pedro(i)
    }
    c.toDouble/n
  }
  def aliciaVSpedro(s:Int) :Int={
    var c=0
    if (alicia(s)<=pedro(s)) c+=alicia(s)
    c
  }
  def probAliciaPedro(n:Int) :Double={
    var c = 0
    for(i <- 0 to n) c += aliciaVSpedro(i)
    c.toDouble/n
  }
    
  println("Promedio de experimentos de Alicia: " + promAlicia(1000000))
  println("Promedio de experimentos de Pedro: " + promPedro(1000000))
  println("La probabilidad de que Alicia necesite menos intentos que Pedro es: " + probAliciaPedro(1000000))
}
```

