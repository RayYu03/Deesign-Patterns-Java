# -*- coding: utf-8 -*-

from Haier import Haier
from TCL import TCL
from Hisense import Hisense

from Television import Television
from Refrigeratory import Refrigeratory
from AirConditioner import AirConditioner

def start():
    tv = Television()
    frigeratory = Refrigeratory()
    air = AirConditioner()

    haier = Haier()

    haier.setAppliance(tv)
    haier.produce()

    haier.setAppliance(frigeratory)
    haier.produce()

    haier.setAppliance(air)
    haier.produce()

    print

    tcl = TCL()

    tcl.setAppliance(tv)
    tcl.produce()

    tcl.setAppliance(frigeratory)
    tcl.produce()

    tcl.setAppliance(air)
    tcl.produce()

    print

    hisense = Hisense()

    hisense.setAppliance(tv)
    hisense.produce()

    hisense.setAppliance(frigeratory)
    hisense.produce()

    hisense.setAppliance(air)
    hisense.produce()

if __name__ == '__main__':
    start()
