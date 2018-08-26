# -*- coding: utf-8 -*-
from Tienda import Tienda
from superm import superm

################Ejemplo usando programación orientada a objetos#########

'''Ahora que ya conoce la filosofía de la programación orientada a objetos
   la herencia, el polimorfismo, la abstracción, el encapsulamineto, etc.
   Realizar un programa que simule el inventario de un supermercado y luego
   REUTILIZAR ese código para crear otro programa que simule el inventario
   de una tiendita, tome por ejemplo que en el supermercado se hace un informe
   de las ventas y en la tiendita no, además REDEFINIR algunos métodos para
   que tengan DIFRENTE FUNCIONALIDAD ésto aplicando parte de la filosofía
   de la programación orientada a objetos'''

s = superm(100, 90, 50, 40, 35, 60, 19)
t = Tienda(50, 45, 25, 20)


class principal:


    def Menu():
        op = int(raw_input("\n\t\t\t\tBienvenido\n ¿Qué lugar desea visitar?\n 1)Supermercado\n 2)Tiendita "))
        if op == 1:
            s.Menu_1()
        else:
            t.Menu_1()
    Menu()
    o = raw_input("Desea hacer otra actividad?(s/n) ")
    while o == 's':
        Menu()
        o = raw_input("Desea hacer otra actividad?(s/n) ")

if __name__ == '__principal__':
    principal
