import sys

def maior_area(x, y):
    sobraX = x % y
    sobraY = y % x
 
    if(sobraX == 0):
        return sobraY
    if(sobraY == 0):
        return sobraX
    else:
        return maior_area(sobraX, sobraY)

print(sys.argv)
x = int(sys.argv[1])
y = int(sys.argv[2])
print(maior_area(x, y))