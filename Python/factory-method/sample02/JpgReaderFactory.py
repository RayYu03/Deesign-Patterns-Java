# -*- coding: utf-8 -*-

from ImageReaderFactory import ImageReaderFactory
from JpgReader import JpgReader

class JpgReaderFactory(ImageReaderFactory):
    @staticmethod
    def produceReader():
        print("JpgReader工厂生产JpgReader..")
        return JpgReader()
