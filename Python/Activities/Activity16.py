from distutils.archive_util import make_archive
from pyexpat import model
from turtle import color


class Car :

    def __init__(self,manufacturer,model,make,transmission,color) :
        self.manufacturer = manufacturer
        self.model =model
        self.make =make
        self.transmission =transmission
        self.color = color


    def accelerate(self):
        print(self.manufacturer + " " +self.model," is moving")
    def stop(self):
        print(self.manufacturer + " " +self.model," has stopped")



c1 = Car("Honda","City","2020","Manual","Black")
c2 = Car("Tata","Nexon","2021","Manual","Red")
c3 = Car("Maruti","Swift","2022","Automatic","Blue")

c1.accelerate()
c2.accelerate()
c3.accelerate()

c2.stop()
c1.stop()
c3.stop()