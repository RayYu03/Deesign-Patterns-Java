from TVFactory import TVFactory
from HaierTV import HaierTV

class HaierTVFactory(TVFactory):
    def produceTV(self):
        print("海尔电视机工厂生产海尔电视机。")
        return HaierTV()
    def __str__(self):
        print('Haier')
