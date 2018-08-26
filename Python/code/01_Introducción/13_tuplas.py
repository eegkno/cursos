
# -*- coding: utf-8 -*-

#Declaracion de una tupla
diasDelMes=(31,28,31,30,31,30,31,31,30,31,30,31)

print diasDelMes       #imprimir la tupla completa
print diasDelMes[0]    #imprimir elemento 1
print diasDelMes[6]    #imprimir elemento 7
print diasDelMes[11]   #imprimir elemento 12


#Declaracion de tuplas anidadas

numeros=(('cero', 0),('uno',1, 'UNO'), ('dos',2), ('tres', 3), ('cuatro',4), ('X',5))

print numeros        #imprimir tupla completa

print numeros[0]     #imprime el elemento 0 de la tupla
print numeros[1]     #imprime el elemento 1 de la tupla

print numeros[2][0]  #imprime el primer elemento de la tupla en la posicion 2
print numeros[2][1]  #imprime el segundo elemento de la tupla en la posicion 2

print numeros[1][0]
print numeros[1][1]
print numeros[1][2]


#No se puede cambiar el valor de uno de los elementos de la tupla

#numeros[5][0] = "cinco"





