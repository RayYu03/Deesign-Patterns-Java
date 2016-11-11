from Email import Email
from copy import deepcopy
def start():
    email = Email()
    copyEmail = deepcopy(email)

    print("email == copyEmail?")
    print(email == copyEmail)
    print("email.getAttachment == copyEmail.getAttachment?")
    print(email.getAttachment() == copyEmail.getAttachment())

if __name__ == '__main__':
    start()
