from Student import Student
from copy import copy, deepcopy

def start():
    stu1 = Student("张无忌","男",24,"软件工程","软件学院","中南大学")

    # 使用原型模式
    stu2 = stu1.clone()
    stu2.setStuName("杨过")

    # 浅复制(复制其子对象)
    stu3 = copy(stu1)
    stu3.setStuName("小龙女")

    # 深复制(不会复制其子对象)
    stu4 = deepcopy(stu1)

    print("姓名：" + stu1.getStuName())
    print("性别：" + stu1.getStuSex())
    print("年龄：" + stu1.getStuAge())
    print("专业：" + stu1.getStuMajor())
    print("学院：" + stu1.getStuCollege())
    print("学校：" + stu1.getStuUniversity())
    print()

    print("姓名：" + stu2.getStuName())
    print("性别：" + stu2.getStuSex())
    print("年龄：" + stu2.getStuAge())
    print("专业：" + stu2.getStuMajor())
    print("学院：" + stu2.getStuCollege())
    print("学校：" + stu2.getStuUniversity())
    print()

    print("姓名：" + stu3.getStuName())
    print("性别：" + stu3.getStuSex())
    print("年龄：" + stu3.getStuAge())
    print("专业：" + stu3.getStuMajor())
    print("学院：" + stu3.getStuCollege())
    print("学校：" + stu3.getStuUniversity())
    print()

    print("姓名：" + stu4.getStuName())
    print("性别：" + stu4.getStuSex())
    print("年龄：" + stu4.getStuAge())
    print("专业：" + stu4.getStuMajor())
    print("学院：" + stu4.getStuCollege())
    print("学校：" + stu4.getStuUniversity())

if __name__ == '__main__':
    start()
