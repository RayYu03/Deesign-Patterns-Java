from MealBuilder import MealBuilder

class SubMealBuilderB(MealBuilder):
    def buildFood(self):
        self._meal.setFood("鸡肉卷 ×1")

    def buildDrink(self):
        self._meal.setDrink("橙汁 ×1")
