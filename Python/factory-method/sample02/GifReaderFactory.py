# -*- coding: utf-8 -*-

from ImageReaderFactory import ImageReaderFactory
from GifReader import GifReader

class GifReaderFactory(ImageReaderFactory):
    @staticmethod
    def produceReader():
        print("GifReader工厂生产GifReader..")
        return GifReader()
