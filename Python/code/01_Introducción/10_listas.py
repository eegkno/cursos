
# -*- coding: utf-8 -*-

#Declaracion de una lista simple
diasDelMes=[31,28,31,30,31,30,31,31,30,31,30,31]

print diasDelMes       #imprimir la lista completa
print diasDelMes[0]    #imprimir elemento 1
print diasDelMes[6]    #imprimir elemento 7
print diasDelMes[11]   #imprimir elemento 12


#Declaracion de listas anidadas

numeros=[['cero', 0],['uno',1, 'UNO'], ['dos',2], ['tres', 3], ['cuatro',4], ['X',5]]

print numeros        #imprimir lista completa

print numeros[0]     #imprime el elemento 0 de la lista
print numeros[1]     #imprime el elemento 1 de la lista

print numeros[2][0]  #imprime el primer elemento de la lista en la posicion 2
print numeros[2][1]  #imprime el segundo elemento de la lista en la posicion 2

print numeros[1][0]
print numeros[1][1]
print numeros[1][2]


#Cambiando el valor de uno de los elementos de la lista

numeros[5][0] = "cinco"

print numeros[5]




