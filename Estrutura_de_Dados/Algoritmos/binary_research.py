from sys import argv
from count_time import count_time
from utils import create_list

@count_time(label="Binary research")
def binary_research(list, item):
    low = 0
    high = len(list) - 1
    while low <= high:
        mid = (low + high) // 2
        guess = list[mid]
        if guess == item:
            return mid
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    
    return None

list = create_list()

try:
    arg_1 = int(argv[1])
except IndexError:
    print("No arguments")

print(binary_research(list, arg_1))
