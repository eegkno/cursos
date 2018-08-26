# -*- coding: utf-8 -*-

#Definicion de funciones
def imprimeNombre(cadena):
    print cadena
    return cadena[0], cadena[-1]

def quienEs(cadena):
    print cadena + " mejor conocido como el Zorro \n"

def find_segundo(s1,s2):
    first = s1.find(s2)
    return s1.find(s2, first+1)

#Llamada de funciones
cadena = "Alejandro Murrieta"
[x,y] =imprimeNombre(cadena)
#Imprimiendo los valores regresados por la funcion imprimeNombre

print x
print y

print "\n"

quienEs(cadena)

s1 = "Amor y deseo son dos cosas diferentes; que no todo lo que se ama se desea, ni todo lo que se desea se ama. (Don Quijote)"
s2 = "ama"

print find_segundo(s1, s2)

print "__"
'''
Se pueden definir funciones que reciban múltiples parámetros
*a mapea todos los argumentos a una tupla
**kw mapea los argumentos de palabra clave a un diccioanrio
'''
def f(p, *a, **kw):
    print "p:", p
    print "a:", a
    print "kw:", kw

f(1,2,3, cuatro=4)
