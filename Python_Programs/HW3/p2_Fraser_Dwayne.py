# DWAYNE FRASER
# PROBLEM 2

class Product:
    """ Creates Product Class"""
    def __init__(self, name, mass, quantity, price):
        self._name = name
        self._mass = mass
        self._stock = quantity
        self._price = price

    def name(self):
        return self._name

    def mass(self):
        return self._mass

    def quantity(self):
        return self._stock

    def price(self):
        return self._price

    def set_price(self, price):
        self._price = price        

    def __str__(self):
        return "{}, ${}, {} kg, {} in stock".format(self.name(), self.price(), self.mass(), self.quantity())


class DiscountedProduct(Product):
    """ Creates Discounted Product Class """
    def __init__(self, discount, product):
        self._product = product
        self._discount = discount


    def price(self):
        return (1.0 - self._discount) * self._product.price()


    def __str__(self):
        return "discounted {}%: {}, ${}, {} kg, {} in stock".format(self._discount*100,
                 self._product.name(), self.price(), self._product.mass(), self._product.quantity())


def main():
    # create a product object for Lavalamps
    # prints "Lavalamp, $30, 0.8 kg, 123 in quantity"
    p = Product(name="Lavalamp", price=30, mass=0.8, quantity=123)
    print(p)

    # create a discounted product of p, with a 20% discount:
    disc_p = DiscountedProduct(0.2, p)
    print(disc_p.price())
    print(disc_p)

    p.set_price(20)
    print(p.price())

    print(disc_p) 
    
main()
     