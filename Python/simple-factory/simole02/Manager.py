from User import User

class Manager(User):
    def __init__(self):
        print('创建经理对象！')

    def diffOperation(self):
        print("经理拥有创建和审批假条权限！")
