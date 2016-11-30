# -*- coding: utf-8 -*-

from Manufacturer import Manufacturer

class Hisense(Manufacturer):
    def produce(self):
        print('生产海信电器.')
        self.appliance.assemble()
