# Task 12.1: Point class
import math

class Point():
    def __init__(self,ix, iy):
        self.x = ix
        self.y = iy

    def Distance(self,dx,dy):
        return math.hypot(dx,dy)

    def DistanceTo(self, newx, newy):
        dx = self.x - newx
        dy = self.y - newy
        return self.Distance(dx, dy)
  
