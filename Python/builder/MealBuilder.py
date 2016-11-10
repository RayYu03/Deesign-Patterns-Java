from abc import ABCMeta
from abc import abstractmethod
from Meal import Meal

class MealBuilder:
    __metaclass__ = ABCMeta
    def __init__(self):
        self._meal = Meal()

    def getMeal(self):
        return self._meal

    @abstractmethod
    def buildFood(self):
        pass

    @abstractmethod
    def buildDrink(self):
        pass
