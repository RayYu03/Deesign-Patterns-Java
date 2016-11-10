from EFactory import EFactory
from TCLTelevision import TCLTelevision
from TCLAirConditioner import TCLAirConditioner

class TCLFactory(EFactory):
    def produceTelevision(self):
        return TCLTelevision()
    def produceAirConditioner(self):
        return TCLAirConditioner()
