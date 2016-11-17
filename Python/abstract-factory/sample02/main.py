from MacFactory import MacFactory
from PcFactory import PcFactory

def start():
    macCPU = MacFactory.produceCPU()
    macCPU.show()

    macRAM = MacFactory.produceRAM()
    macRAM.show()

    pcCPU = PcFactory.produceCPU()
    pcCPU.show()

    pcRAM = PcFactory.produceRAM()
    pcRAM.show()


if __name__ == '__main__':
    start()
