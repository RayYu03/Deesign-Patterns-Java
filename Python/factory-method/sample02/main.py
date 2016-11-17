from JpgReaderFactory import JpgReaderFactory
from GifReaderFactory import GifReaderFactory


def start():
    jpg = JpgReaderFactory.produceReader()
    jpg.read()
    print

    gif = GifReaderFactory.produceReader()
    gif.read()

if __name__ == '__main__':
    start()
