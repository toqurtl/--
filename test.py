class Test(object):

    def __init__(self, id, age, name, testclass):
        self.id = id
        self.name = name
        self.age = age
        self.testclass = testclass
        

    def double_age(self):
        return self.age * 2.0

    def __str__(self):
        return str(self.id)+self.name+str(self.age)

class TestClass(object):
    def __init__(self, id):
        self.id = id


t = Test(1,20, "fuck", TestClass(3))
t.testclass

print('fuck')
