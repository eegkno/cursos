
#Esta es una cadena que tiene 22 caracteres
cadena = "parangaricutirimicuaro"

print cadena[0]    #primer caracter
print cadena[21]   #ultimo caracter

#Si se pone un indice negativo, la cuenta empieza en el ultimo elemento
#de la cadena
print cadena[-2]   #ultimo caracter

#Si se quiere acceder a un elemento de la cadena fuera de rango, se obtiene
#el error IndexError: string index out of range

#print cadena[22]   #ultimo caracter

print cadena[5:13]  #imprimiendo garicuti
print cadena[5:]    #imprimiendo garicutirimicuaro
print cadena[:5]    #imprimiendo param
print cadena[:]     #regresa la cadena completa
