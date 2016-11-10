from User import User

class Employee(User):
    def __init__(self):
        print('创建员工对象！')

    def diffOperation(self):
        print("员工拥有创建假条权限！")
