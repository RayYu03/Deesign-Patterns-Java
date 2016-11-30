from abc import ABCMeta, abstractmethod

class Manufacturer:
    __metaclass__ = ABCMeta

    @abstractmethod
    def produce(self):
        pass

    def setAppliance(self, appliance):
        self.appliance = appliance
