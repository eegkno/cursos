
# -*- coding: utf-8 -*-

#Nuevas listas

lista = ['H','o', 'l','a']
lista2 = ['A','d','i','o','s']

lista.append('s')         #Agregando un nuevo elemento a la lista

print lista

print len(lista)         #Obteniendo la longitud de la lista


lista3 = lista + lista2     #Concatenando dos listas
print lista3
print lista
print lista2


#Uso de len en listas
otra_lista = [0,1,2,[3,4]]

print len(otra_lista)       #Solo imprime el numero de elementos externos

print len(otra_lista[3])    #Imprime el numero de elementos de la lista interna


#Uso de index en listas
print otra_lista.index(1)

print otra_lista[3].index(3)


#Uso de in en listas

print 2 in otra_lista
print 3 in otra_lista
print 3 in otra_lista[3]


#Uso de not in en listas

print 2 not in otra_lista
print 3 not in otra_lista
print 3 not in otra_lista[3]
print not 3 in otra_lista[3]

#Pop y push en listas

la = [1,2,3,4]
lb = [3,4,5,6]

la.pop()
print la

#La función del sirve para eliminar elementos de una lista
print lb
del(lb[2])
print lb

#Insertando elementos en la lista

lb.insert(3,5)
lb.insert(4,15)
print lb

#Ciclo for

for p in lb:
    print p

print "__"
#La función range ayuda a generar un rango de números


print range(5,10)
print range(5)

print "__"

x=range(5,10)
for p in x:
    print p

print "__"

for p in range(5):
    print "Hola"


print "__"

for p in "programando":
    print p

