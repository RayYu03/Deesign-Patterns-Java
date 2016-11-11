from MyColor import MyColor

class Blue(MyColor):
    def clone(self):
        blue_copy = self.__class__()
        return blue_copy

    def display(self):
        print("This is Blue!")
