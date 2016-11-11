from Red import Red
from Blue import Blue

class PrototypeManager:
    def __init__(self):
        self._colers = {}
        self._colers['red'] = Red()
        self._colers['blue'] = Blue()

    def addColor(self, key, value):
        self._colers[key] = value

    def getColor(self, key):
        return self._colers[key].clone()
