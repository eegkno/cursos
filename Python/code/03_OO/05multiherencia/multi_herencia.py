class Bear(object):
    """Represents a bear!"""
    def __init__(self, name):
        self.name = name

class BlackBear(Bear):
    """Represents a GrizzlyBear, which is a type of bear."""
    def __init__(self,name):
        super(BlackBear,self).__init__("Black " + name)
        
class DiscerningBear(Bear):
    """Represents a DiscerningBear, whick is a type of bear."""
    def __init__(self,name):
        super(DiscerningBear,self).__init__("Discerning " + name)


class DiscerningBlackBear(DiscerningBear, BlackBear):
    """Represents a Discerning-Black bear"""
