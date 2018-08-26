cadena = "avada kedavra"
contador = 0
while contador < 10:
    print cadena
    contador = contador + 1



def cuenta(limite):
    i = limite
    while True:
        print i
        i = i -1
        if i == 0:
            break # Rompiendo el ciclo


def factorial(n):
    i = 2
    tmp = 1
    while i <n+1:
        tmp = tmp * i
        i = i + 1
    return tmp




#Llamada a las funciones
cuenta(10)

print factorial(4)
#>>> 24
print factorial(5)
#>>> 120
print factorial(6)
#>>> 720
