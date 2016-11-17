from BaseFactory import BaseFactory
from PcCPU import PcCPU
from PcRAM import PcRAM

class PcFactory(BaseFactory):
    @staticmethod
    def produceCPU():
        return PcCPU()

    @staticmethod
    def produceRAM():
        return PcRAM()
