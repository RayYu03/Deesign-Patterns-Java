from MyColor import MyColor

class Red(MyColor):
    def clone(self):
        red_copy = self.__class__()
        return red_copy
        
    def display(self):
        print("This is Red!")
