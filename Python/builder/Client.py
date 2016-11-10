from SubMealBuilderA import SubMealBuilderA
from SubMealBuilderB import SubMealBuilderB
from KFCWaiter import KFCWaiter
from XMLUtil import XMLUtil

def start():
    buildNames = XMLUtil.getBuildNames()
    for buildName in buildNames:
        try:
            # 利用类名的字符串来实例化一个对象
            mb = globals()[buildName]()
            waiter = KFCWaiter()
            waiter.setMealBuilder(mb)
            meal = waiter.construct()

            print("套餐组成：")
            print('==========================================')
            print(meal.getFood())
            print(meal.getDrink())
            print('==========================================\n')
        except Exception as e:
            print(e)

if __name__ == '__main__':
    start()
