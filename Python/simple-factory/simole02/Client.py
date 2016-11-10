from UserDAO import UserDAO
from UserFactory import UserFactory

def start():
    try:
        userDAO = UserDAO()
        permission = userDAO.findPermission('zhangsan','123456')
        user = UserFactory.getUser(permission)
        user.sameOperation()
        user.diffOperation
    except:
        pass

if __name__ == '__main__':
    start()
