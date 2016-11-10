class UserDAO(object):
    def findPermission(self, userName, userPassword):
        if(userName == "zhangsan" and userPassword == "123456"):
            return 2
        else:
            return -1
