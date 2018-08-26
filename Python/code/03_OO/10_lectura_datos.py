# -*- coding: utf-8 -*-
'''La linea de arriba sirve para que no nos marque error con
   los acentos y los caracteres especiales'''

print "Hola, como te llamas?"
nombre = raw_input(' ')
print "Buen día " + nombre


running = True
while running:
    valor_1 = 0
    valor_2 = 0
    print "---Calculadora---"
    print "1- Sumar"
    print "2- Restar"
    print "3- Multiplicar"
    print "4- Dividir"
    print "5- Salir"
    op = int(raw_input('Opcion: '))
    if op == 1:
        print "---Sumar---"
        valor_1 = int(raw_input(''))
        print " + "
        valor_2 = int(raw_input(''))
        suma = valor_1 + valor_2
        print "El resultado es: %d" % suma
    elif op == 2:
        print "---Restar---"
        valor_1 = int(raw_input(''))
        print " - "
        valor_2 = int(raw_input(''))
        resta = valor_1 - valor_2
        print "El resultado es: %d" % resta
    elif op == 3:
        print "---Multiplicar---"
        valor_1 = int(raw_input(''))
        print " x "
        valor_2 = int(raw_input(''))
        multiplicacion = valor_1 * valor_2
        print "El resultado es: %d" % multiplicacion
    elif op == 4:
        print "---Dividir---"
        valor_1 = int(raw_input(''))
        print " / "
        valor_2 = int(raw_input(''))
        Dividir = valor_1 / valor_2
        print "El resultado es: %d" % Dividir
    elif op == 5:
        running = False
