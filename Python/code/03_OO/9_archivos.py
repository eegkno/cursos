# -*- coding: utf-8 -*-

#Manejando archivos

f = open("archivo.txt", "r") #Abriendo el archivo en modo lecurta

completo = f.read()           #devuelve una cadena con el contenido del archivo

f.close()                   #Cerrando el archivo

print completo

print "___"

f = open("archivo.txt", "r")

#Se lee el archivo línea por línea
while True:
      linea = f.readline()
      if not linea: break
      print linea

f.close()

print "___"


#Agragando una línea al archivo

otras_lineas=["otra linea 2 \n","otra linea 3 \n"]

f = open("archivo.txt", "a")
f.write("otra línea 1 \n")     #Guarda una línea
f.writelines(otras_lineas)     #Alamcena las líneas de una lista
f.close()


f = open("archivo.txt", "r")
lineas = f.readlines()    #Esta función lee las líneas y las almacena en una lista
f.close()

print lineas


