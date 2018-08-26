# -*- coding: utf-8 -*-

#Nos permite reutilizar código, agregando funcionalidades
#extras a clases que ya estan definidas

class Animal:
    def __init__(self,num_patas):
        self.num_patas = num_patas
        self.alimento = 0

    def comer(self):
        self.alimento += 1

    def hablar(self):
        print "grrrr"

#La clase perro hereda de la clase animal
class Perro(Animal):
    def __init__(self):
        #llamar al constructor de la clase padre para
        #heredar los atributos definidos ahi
        Animal.__init__(self,4)


a = Perro()    #Se crea un objeto de la clase perro
a.hablar()     #ejecución del metodo sobreescrito
a.comer()      #se puede usar porque lo heredamos de la clase animal
a.comer()
print a.alimento

b = Animal(4)   #Creación de un objeto de la clase padre
b.hablar()
b.comer()
print b.alimento
