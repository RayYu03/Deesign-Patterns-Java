from XMLUtil import XMLUtil
from HaierFactory import HaierFactory
from TCLFactory import TCLFactory

def start():
    factoryNames = XMLUtil.getFactoryNames()
    for factoryName in factoryNames:
        try:
            # 利用类名的字符串来实例化一个对象
            factory = globals()[factoryName]()
            tv = factory.produceTelevision()
            tv.play()
            ac = factory.produceAirConditioner()
            ac.changeTemperature()
        except Exception as e:
            print('Error:', e)


if __name__ == '__main__':
    start()
