# -*- coding: utf-8 -*-
from Man import Man
from Woman import Woman
from Robot import Robot


class PersonFactory(object):
    @staticmethod
    def producePerson(obj):
        if obj.lower() == 'man':
            print("正在生产一个男人...")
            return Man()
        elif obj.lower() == 'woman':
            print("正在生产一个女人...")
            return Woman()
        elif obj.lower() == 'robot':
            print("正在生产一个机器人...")
            return Robot()
        else:
            print(obj + "无法生产...\n")
            return None
