# -*- coding: utf-8 -*-

from Manufacturer import Manufacturer

class TCL(Manufacturer):
    def produce(self):
        print('生产TCL电器.')
        self.appliance.assemble()
