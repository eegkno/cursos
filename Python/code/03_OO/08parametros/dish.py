class MainDish(object):
    """
    Representa un plato de comida.
    """

    def __init__(self, name, price, description=None, picture=None, vegetarian=False, sides=0):
        self.name = name
        self.price = price
        self.description = description
        self.picture = picture
        self.vegetarian = vegetarian
        self.sides = sides

    def __str__(self):
        return "{name}{isveg}: {price:.2f}{desc}".format(
            name=self.name,
            desc=' (' + self.description + ')' if self.description else '',
            price=self.price,
            isveg='*' if self.vegetarian else '')
    

# Representa un aperitivo
class Appetizer(object):
    """
    Representa un aperitivo.
    """
    def __init__(self, name, price, description=None, picture=None, vegetarian=False, serves=1):
        # complete this!
        self.name = name
        self.price = price
        self.description = description
        self.picture = picture
        self.vegetarian = vegetarian
        self.serves = serves


    def __str__(self):
        """Returns an appetizer, printed same way as Main Dish"""
        # complete this!
        return "{name}{isveg}{desc}: {price:.2f}".format(
            name=self.name,
            desc=' (' + self.description + ')' if self.description else '',
            price=self.price,
            isveg='*' if self.vegetarian else '')

