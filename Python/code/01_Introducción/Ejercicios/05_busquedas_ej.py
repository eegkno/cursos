# -*- coding: utf-8 -*-

###################Ejercicio sobre búsqueda de cadenas####################

'''Ahora que ya sabe buscar cadenas vamos a hacer el proceso inverso con
   respecto al programa anterior, es decir ahora en vez de nosotros dar la
   posición de la cadena a imprimir, el programa nos debe de dar la posición'''

nombre = "Marco Antonio Martínez Quintana"

print "\n\t\t\tBúsqueda de cadenas\n"
print "La cadena completa comienza en la posición:",nombre.find("Marco Antonio Martínez Quintana")
print "El nombre de pila cominza en la posición:",nombre.find("Marco Antonio")
print "El apellido paterno en la posición:",nombre.find("Martínez")
print "El apellido materno en la posición:",nombre.find("Quintana")
print "Y las iniciales en la posición:",nombre.find("Marco"),nombre.find("Antonio"),nombre.find("Martínez"),"y",nombre.find("Quintana")
