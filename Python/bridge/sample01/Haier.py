# -*- coding: utf-8 -*-

from Manufacturer import Manufacturer

class Haier(Manufacturer):
    def produce(self):
        print('生产海尔电器.')
        self.appliance.assemble()
