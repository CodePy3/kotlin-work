# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
import point

p = point.Point(4.0,5.0)
distanceFromOrigin = p.DistanceTo(0.0, 0.0)
print(f"Distance from origin is: {distanceFromOrigin:.2f}")
distanceFromPoint = p.DistanceTo(4.5,7.0)
print(f"Distance from origin is: {distanceFromPoint:.2f}")
