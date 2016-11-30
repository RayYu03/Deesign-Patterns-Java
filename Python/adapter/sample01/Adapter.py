from Cat import Cat
from Dog import Dog

class Adapter(Cat,Dog):
    def __init__(self):
        self.cat = None
        self.dog = None

    def setCat(self, cat):
        self.cat = cat

    def setDog(self, dog):
        self.dog = dog

    def cry(self):
        self.dog.wang()

    def catchMouse(self):
        self.cat.catchMouse()

    def wang(self):
        self.dog.wang()

    def jump(self):
        self.dog.jump()
