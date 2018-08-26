# -*- coding: utf-8 -*-

####################Ejercicio sobre el manejo de subcadenas###############


'''Ahora que ya sabe el uso de subcadenas, escriba un programa que muestre
   su nombre completo, luego sólo su nombre de pila, después su apellido
   paterno, luego apellido materno y por último sus iniciales juntas'''

nombre = "Marco Antonio Martínez Quintana"

print "\n\t\t\tManejo de subcadenas\n"
print "Nombre completo:", nombre[:]
print "Nombre de pila:", nombre[0:13]
print "Apellido paterno:", nombre[14:23]
print "Apellido materno:", nombre[24:]
print "Iniciales:", nombre[0] + nombre[6] + nombre[14] + nombre[24]
