#Mutacion y referencias


#En las cadenas no nexista la mutacion, cada vez que se asiga una nueva cadena a
#una referencia, se creo como una nueva cadena, por lo que no se puede cambiar
#un valor dentro de la cadena

c1 = 'Hola'
c2 = c1       #Otra refeencia a la cadena

print c1
print c2

#c1[0] = 'B'    #operacion no permitida

c1 = 'Bola'    #Nueva cadena creada


#Al imprimir las cadenas, ya no son iguales, no apuntan a la misma informacion
print c1
print c2





#En las listas si se puede aplicar la mutacion

lista = ['H', 'o', 'l', 'a']

lista2 = lista    #Otra referencia a la lista

print lista

lista[0] = 'B'

#Al imprimir las listas, las dos referencias apuntan a la misma informacion
print lista
print lista2



def mutarLista(lista):
    lista[3] = 'G'



mutarLista(lista)
print lista
