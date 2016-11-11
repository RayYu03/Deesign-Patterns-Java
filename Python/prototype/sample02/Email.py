from Attachment import Attachment

class Email:
    def __init__(self):
        self.attachment = Attachment()

    def getAttachment(self):
        return self.attachment

    def display(self):
        print('查看邮件...')
