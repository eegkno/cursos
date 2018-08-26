# -*- coding: utf-8 -*-

class A:

    i = 5

    def getI(self):
        return A.i

    def getI2(self):
        return self.i

#Creando el objeto
uno = A()
print uno.getI()
print uno.getI2()
print uno.i

uno.i = 10
print

print uno.getI()  #getI() accede el atributo de la clase
print uno.getI2() #getI2() accede al atributo del objeto
print uno.i
