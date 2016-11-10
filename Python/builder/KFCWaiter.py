class KFCWaiter:
    def __init__(self):
        self._mb = None

    def setMealBuilder(self, mb):
        self._mb = mb

    def construct(self):
        self._mb.buildFood()
        self._mb.buildDrink()
        return self._mb.getMeal()
