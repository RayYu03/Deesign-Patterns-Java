from PrototypeManager import PrototypeManager

def start():
    pm = PrototypeManager()
    obj1 = pm.getColor('red')
    obj1.display()

    obj2 = pm.getColor('blue')
    obj2.display()

    print(obj1 == obj2)

if __name__ == '__main__':
    start()
