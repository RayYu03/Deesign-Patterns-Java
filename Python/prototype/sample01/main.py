from Email import Email
from copy import copy
def start():
    email = Email()
    copyEmail = copy(email)

    print("email == copyEmail?")
    print(email == copyEmail)
    print("email.getAttachment == copyEmail.getAttachment?")
    print(email.getAttachment() == copyEmail.getAttachment())

if __name__ == '__main__':
    start()
