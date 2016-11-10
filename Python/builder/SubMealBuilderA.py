from MealBuilder import MealBuilder

class SubMealBuilderA(MealBuilder):
    def buildFood(self):
        self._meal.setFood("鸡腿堡 ×1")

    def buildDrink(self):
        self._meal.setDrink("可乐 ×1")
