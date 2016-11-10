from HaierTV import HaierTV
from HisenseTV import HisenseTV

class TVFactory(object):
    @staticmethod
    def produceTV(brand):
        if brand.lower() == 'haier':
            print("正在生产一个Haier电视...")
            return HaierTV()
        elif brand.lower() == 'hisense':
            print("正在生产一个Hisense电视...")
            return HisenseTV()
        else:
            print(brand + "电视无法生产...\n")
