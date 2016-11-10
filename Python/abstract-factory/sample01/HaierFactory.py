from EFactory import EFactory
from HaierTelevision import HaierTelevision
from HaierAirConditioner import HaierAirConditioner

class HaierFactory(EFactory):
    def produceTelevision(self):
        return HaierTelevision()
    def produceAirConditioner(self):
        return HaierAirConditioner()
