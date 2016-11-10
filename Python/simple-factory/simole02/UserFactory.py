from Employee import Employee
from Manager import Manager
from Administrator import Administrator

class UserFactory(object):
    @staticmethod
    def getUser(permission):
        if (permission == 0):
            return Employee()
        elif (permission == 1):
            return Manager()
        elif (permission == 2):
            return Administrator()
        else:
            return None
