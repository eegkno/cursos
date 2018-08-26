# -*- coding: utf-8 -*-


class superm:

    def __init__(self, r, p, l, d, f, a, m):
        self.refresco = r
        self.papas = p
        self.leche = l
        self.dulces = d
        self.fruta = f
        self.aparatos = a
        self.medicinas = m

    def Menu_1(self):
        op = int(raw_input("\n¿Qué desea hacer:?\n 1) Comprar\n 2) Vender\n 3) Informe  "))
        if op == 1:
            self.Menu()
            p = int(raw_input("¿Qué artículo ?"))
            c = int(raw_input("Cantidad "))
            self.comprar(p, c)
        elif op == 2:
            self.Menu()
            p = int(raw_input("¿Qué artículo ?" ))
            c = int(raw_input("Cantidad "))
            self.vender(p, c)
        else:
            self.informe()

    def informe(self):
        f = open("inventario.txt", "w")
        f.write("refrescos " + str(self.refresco) + "\n")
        f.write("papas " + str(self.papas) + "\n")
        f.write("leche " + str(self.leche) + "\n")
        f.write("dulces " + str(self.dulces) + "\n")
        f.write("fruta " + str(self.fruta) + "\n")
        f.write("aparatos " + str(self.aparatos) + "\n")
        f.write("medicina " + str(self.medicinas) + "\n")
        f.close()
        print "Listo "

    def comprar(self, producto, cantidad):
        if producto == 1:
            self.refresco = self.refresco + cantidad
        elif producto == 2:
            self.papas = self.papas + cantidad
        elif producto == 3:
            self.leche = self.leche + cantidad
        elif producto == 4:
            self.dulces = self.dulces + cantidad
        elif producto == 5:
            self.fruta = self.fruta + cantidad
        elif producto == 6:
            self.aparatos = self.aparatos + cantidad
        else:
            self.medicinas = self.medicinas + cantidad

    def Menu(self):
        print "\n\t\t\t\tSupermercado\n 1) Refresco\n 2) Papas\n 3) Leche\n 4) Dulces\n 5) Fruta\n 6) Aparatos\n 7) Medicinas\n"

    def vender(self, producto, cantidad):
        if producto == 1:
            self.refresco = self.refresco - cantidad
        elif producto == 2:
            self.papas = self.papas - cantidad
        elif producto == 3:
            self.leche = self.leche - cantidad
        elif producto == 4:
            self.dulces = self.dulces - cantidad
        elif producto == 5:
            self.fruta = self.fruta - cantidad
        elif producto == 6:
            self.aparatos = self.aparatos - cantidad
        else:
            self.medicinas = self.medicinas - cantidad
