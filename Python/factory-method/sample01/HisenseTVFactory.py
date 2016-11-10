from TVFactory import TVFactory
from HisenseTV import HisenseTV

class HisenseTVFactory(TVFactory):
    def produceTV(self):
        print("海信电视机工厂生产海信电视机。")
        return HisenseTV()
