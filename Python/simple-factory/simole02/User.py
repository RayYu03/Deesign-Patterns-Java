from abc import abstractmethod

class User(object):
    def sameOperation(self):
        print('修改个人资料！')

    @abstractmethod
    def diffOperation(self):
        pass
