### Alice and Pedro problem

![](http://i67.tinypic.com/34reqm1.jpg)

* ### Scala

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

* #### Python

```python
 # -*- coding: utf-8 -*-
from numpy import *
from matplotlib.pyplot import *
from random import *

def Alicia():
    (a,b)=('R','R')
    count = 0
    while(a!='C' or b!='C'):
        count += 1
        b=a
        a=choice(['C','X'])
    return count

def Pedro():
    (a,b)=('R','R')
    count = 0
    while(a!='C' or b!='X'):
        count += 1
        b=a
        a=choice(['C','X'])
    return count
#Apartado A y B
def AliciaPedro(N):
    A = 0
    P = 0
    for i in range(N):
        A += Alicia()
        P += Pedro()
    A = float(A)/N
    P = float(P)/N
    return (A,P)

#Apartado C
def AliciaMenosPedro(N):
    count = 0
    for i in range(N):
        (A,P)=(Alicia(),Pedro())
        if(A<=P):
            count += 1
    count = float(count)/N
    return count

```