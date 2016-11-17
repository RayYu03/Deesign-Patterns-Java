from BaseFactory import BaseFactory
from MacCPU import MacCPU
from MacRAM import MacRAM

class MacFactory(BaseFactory):
    @staticmethod
    def produceCPU():
        return MacCPU()

    @staticmethod
    def produceRAM():
        return MacRAM()
