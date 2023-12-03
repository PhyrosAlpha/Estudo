import sys
import json

def soma_recursiva(array):
    if len(array) == 0:
        return 0
    else:
        print(array)
        result_pop = array.pop() 
        result_recursive = + soma_recursiva(array)
        print(result_recursive)
        return result_pop + result_recursive

list = json.loads(sys.argv[1])
print(soma_recursiva(list))