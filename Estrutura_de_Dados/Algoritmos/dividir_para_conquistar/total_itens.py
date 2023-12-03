import sys
import json

def total_itens(list):
    if len(list) == 0:
        return 0
    list.pop()
    return 1 + total_itens(list)

arr = json.loads(sys.argv[1])
print(total_itens(arr))