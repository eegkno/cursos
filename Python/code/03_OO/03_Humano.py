# -*- coding: utf-8 -*-

class Humano(object):


#Constructo de objetos
   def __init__(self, edad, altura, peso):
       #Los atributos y métodos que empiezan con __ se consideran privados
       self.edad=edad         #Atributo publico
       self.__altura=altura   #Atributo privado
       self.__peso=peso       #Atributo privado
       self.__myMetodoPrivado()


#Estos son métodos públicos

   def getPeso(self):
       return self.__peso

   def setPeso(self, peso = None):
       self.__peso = peso

   def getAltura(self):
       return self.__altura

   def setAltura(self, altura = None):
       self.__altura = altura

   def getEdad(self):
       return self.edad

   def setEdad(self, edad = None):
       self.edad = edad

#Este es un metodo privado
   def __myMetodoPrivado(self):
       print "Creando una instancia"


#Creación de dos objetos de la clase humano con diferentes valores
h1 = Humano(12,1.60, 50)

h2 = Humano(20,1.80, 70)

print "Humano 1: Edad = %i Altura = %.2f Peso = %i " % (h1.getEdad(), h1.getAltura(), h1.getPeso())

print "Humano 2: Edad = %i Altura = %.2f Peso = %i " % (h2.getEdad(), h2.getAltura(), h2.getPeso())


h1.edad = 18
h1.__peso = 300     #El atributo privado cambia su valor a traves de su método set

print h1.edad
print h1.__peso
#h1.__myMetodoPrivado(); #No se puede mandar llamar al método privado

print "Humano 1: Edad = %i Altura = %.2f Peso = %i " % (h1.edad, h1.getAltura(), h1.getPeso())
