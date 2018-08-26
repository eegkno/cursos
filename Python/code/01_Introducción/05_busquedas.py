# -*- coding: utf-8 -*-

#Cadena para buscar
cadena = "Amor y deseo son dos cosas diferentes; que no todo lo que se ama se desea, ni todo lo que se desea se ama. (Don Quijote)"

#Busqueda
print cadena.find("ama")

#Imprimiendo la subcadena
print cadena[cadena.find("ama"):]

#Buscando el segundo "ama"
print cadena[cadena.find("ama")+1:].find("ama")

#Imprimiendo la cadena a partir del segundo "ama"
print cadena[61 + 1 + 40:]

#Buscando "corazon" en la cadena
print cadena.find("corazon")

#Buscando a partir de un indice
print cadena.find("todo",62)

print cadena[78:]

#Otras funciones de en cadenas

#Cambia todos los caracteres de la cadena a mayúsculas
print cadena.upper()

#Cambia todos los caracteres de la cadena a minúsculas
print cadena.lower()

#Descomponiendo la cadena
print cadena.split(' ')

#Reemplaza cadenas
print cadena.replace("ama","come")
