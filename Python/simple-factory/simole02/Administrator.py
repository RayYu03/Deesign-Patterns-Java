from User import User

class Administrator(User):
    def __init__(self):
        print('创建管理员对象！')

    def diffOperation(self):
        print("管理员拥有创建和管理假条权限！")
