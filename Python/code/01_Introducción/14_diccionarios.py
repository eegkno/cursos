# -*- coding: utf-8 -*-
#Diccionario

elementos = { 'hidrogeno': 1, 'helio': 2, 'carbon': 6 }

#EL momento de la impresion, pueden aparecer en diferente orden del introducido
print elementos

print elementos['hidrogeno']
#print elementos['oxigeno']  #No existe el elemento y marca un error


#Se pueen agregar elementos al diccionario
elementos['litio'] = 3
elementos['nitrogeno'] = 8

print elementos  #Imprimiendo todos los elementos

#Creando un nuevo diccionario
elementos2 = {}
elementos2['H'] = {'name': 'Hydrogen', 'number': 1, 'weight': 1.00794}
elementos2['He'] = {'name': 'Helium', 'number': 2, 'weight': 4.002602}

print elementos2

#Imprimiendo los datos de un elemento del diccionario
print elementos2['H']
print elementos2['H']['name']
print elementos2['H']['number']
elementos2['H']['weight'] =  4.30  #Cambiando el valor de un elemento
print elementos2['H']['weight']

#Agregando elementos a una llave
elementos2['H'].update({'gas noble':True})
print elementos2['H']

#Limpiando el diccionario
#elementos2.clear()

print "____"

#Muestra todos los elementos del diccionario
print elementos2.items()

#Muestra todas las llaves del diccionario
print elementos2.keys()
