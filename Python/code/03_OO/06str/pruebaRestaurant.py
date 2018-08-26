# Se importa la clase Restaurant del archivo restaurant.py
from restaurant import Restaurant

# Se crea un objeto del tipo restaurant
mcdowells = Restaurant("McDowell's Hamgurger Emporium", "James", "John")

print mcdowells

# dir muestra la lista de métodos que posee el objeto
print dir(mcdowells)
