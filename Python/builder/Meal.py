class Meal:
    def __init__(self):
        self._food = None
        self._drink = None

    def setFood(self, food):
        self._food = food

    def setDrink(self, drink):
        self._drink = drink

    def getFood(self):
        return self._food

    def getDrink(self):
        return self._drink
