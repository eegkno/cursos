#Declaracion de funciones
def obtenerMayor(param1,param2):
    if param1 < param2:
        print str(param2)+' es mayor que '+str(param1)


def obtenerMayorv2(param1,param2):
    if param1 < param2:
        return param2
    else:
        return param1


def obtenerMasGrande(a, b, c):
    if a > b:
        if a > c:
            return a
        else:
            return c
    else:
        if b > c:
            return b
        else:
            return c

def obtenerMasGrandev2(a, b, c):
    return obtenerMayorv2(a, obtenerMayorv2(b,c))


def numeros(num):
    if num==1:
     print "tu numero es 1"
    elif num==2:
     print "el numero es 2"
    elif num==3:
     print "el numero es 3"
    elif num==4:
     print "el numero es 4"
    else:
     print "no hay opcion"



#Llamada de funciones

obtenerMayor(5, 7)     #$> "7 es mayor que 5"

obtenerMayor(7, 5)     #$>


print "El mayor es "+ str( obtenerMayorv2(4, 20) )   #$> El mayor es 20

print "El mayor es "+ str( obtenerMayorv2(11, 6) )  #$>  El mayor es 11

print "El mas grande es"+str(obtenerMasGrande(7,3,11) ) #$> El mayor es 11

print "El mas grande es"+str(obtenerMasGrande(7,13,1) ) #$> El mayor es 13

print "___"
numeros(1)
numeros(5)
