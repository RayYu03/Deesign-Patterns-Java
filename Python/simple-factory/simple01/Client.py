from TV import TV
from XMLUtilTV import XMLUtilTV
from TVFactory import TVFactory

def start():
    brandNames = XMLUtilTV.getBrandNames()
    for brandName in brandNames:
        try:
            tv = TVFactory.produceTV(brandName)
            tv.play()
        except:
            pass

if __name__ == '__main__':
    start()
