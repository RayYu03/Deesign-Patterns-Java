from TV import TV
from XMLUtilTV import XMLUtilTV
from HaierTVFactory import HaierTVFactory
from HisenseTVFactory import HisenseTVFactory

def start():
    factoryNames = XMLUtilTV.getFactoryNames()
    for factoryName in factoryNames:
        try:
            # 利用类名的字符串来实例化一个对象
            factory = globals()[factoryName]()
            tv = factory.produceTV()
            tv.play()
        except:
            pass

if __name__ == '__main__':
    start()
