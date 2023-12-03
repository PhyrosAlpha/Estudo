from sys import argv
from count_time import count_time
from utils import create_list

@count_time(label="Simple research")
def simples_research(list, item):
    for i in range(len(list)):
        if list[i] == item:
            return i
    return None


list = create_list()
try:
    arg_1 = int(argv[1])
except IndexError:
    print("No arguments")

print(simples_research(list, arg_1))