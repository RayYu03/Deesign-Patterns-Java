class Student:
    def __init__(self, stuName, stuSex, stuAge, stuMajor, stuCollege, stuUniversity):
        self.stuName = stuName
        self.stuSex = stuSex
        self.stuAge = stuAge
        self.stuMajor = stuMajor
        self.stuCollege = stuCollege
        self.stuUniversity = stuUniversity


    def clone(self, **kwargs):
        student_copy = self.__class__(self.stuName, self.stuSex, self.stuAge,
                            self.stuMajor, self.stuCollege, self.stuUniversity)
        student_copy.__dict__.update(**kwargs)
        return student_copy

    def setStuName(self, stuName):
        self.stuName = stuName


    def setStuSex(self, stuSex):
    	self.stuSex = stuSex


    def setStuAge(stuAge):
    	self.stuAge = stuAge


    def setStuMajor(self, stuMajor):
    	self.stuMajor = stuMajor


    def setStuCollege(self, stuCollege):
    	self.stuCollege = stuCollege


    def setStuUniversity(self, stuUniversity):
    	self.stuUniversity = stuUniversity


    def getStuName(self):
    	return self.stuName


    def getStuSex(self):
    	return self.stuSex


    def getStuAge(self):
    	return str(self.stuAge)


    def getStuMajor(self):
    	return self.stuMajor


    def getStuCollege(self):
    	return self.stuCollege


    def getStuUniversity(self):
    	return self.stuUniversity
