from superm import superm


class Tienda(superm):
    def __init__(self, r, p, l, d):
        superm.__init__(self, r, p, l, d, 0, 0, 0)
        self.refrescos = r
        self.papas = p
        self.leche = l
        self.dulces = d

    def Menu(self):
        print "\n\t\t\t\tTiendita\n 1) Refresco\n 2) Papas\n 3) Leche\n 4) Dulces\n"

    def informe(self):
        print "\n\t\tInforme\nrefrescos " + str(self.refresco) + "\n"
        print "papas " + str(self.papas) + "\n"
        print "leche " + str(self.leche) + "\n"
        print "dulces " + str(self.dulces) + "\n"
