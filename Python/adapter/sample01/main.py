from Adapter import Adapter
from ConcreteCat import ConcreteCat
from ConcreteDog import ConcreteDog

def start():
    adapter = Adapter()
    adapter.setCat(ConcreteCat())
    adapter.setDog(ConcreteDog())

    cat, dog = adapter, adapter

    cat.cry()
    cat.catchMouse()

    dog.wang()
    dog.jump()


if __name__ == '__main__':
    start()
