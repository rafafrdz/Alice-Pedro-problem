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
