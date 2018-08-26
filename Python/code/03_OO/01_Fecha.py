# -*- coding: utf-8 -*-

class Fecha:

#Atributos de la clase
    dia = 30
    mes = "Junio"
    anio = 2013

#Método de la clase
    def getFecha(self):
        return "%i de %s de %i" % (Fecha.dia, Fecha.mes, Fecha.anio)

#Creando una referencia de la clase Fecha
fecha = Fecha()
fecha2 = Fecha()

#Imprimiendo los valores de los atributos del objeto Fecha
print fecha.dia
print fecha.mes
print fecha.anio

#Ejecutando el método getFecha
print fecha.getFecha()


#Comparando las referencias
print fecha is fecha2

#Imprimiendo la dirección de memoria de cada referencia
print fecha
print fecha2
