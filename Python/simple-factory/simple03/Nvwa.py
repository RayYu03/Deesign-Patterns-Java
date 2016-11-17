# -*- coding: utf-8 -*-
from PersonFactory import PersonFactory

def start():
    try:
        person = PersonFactory.producePerson('MAN')
        person.sameOperation()
        person.diffOperation()

        print

        person = PersonFactory.producePerson('Woman')
        person.sameOperation()
        person.diffOperation()

        print

        person = PersonFactory.producePerson('RObot')
        person.sameOperation()
        person.diffOperation()
    except:
        pass

if __name__ == '__main__':
    start()
