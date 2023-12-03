import sys
import json

def maior_valor(list):
    if len(list) == 1:
        return list[0]
    
    number = list.pop()
    result = maior_valor(list)
    if(number > result):
        return number
    else:
        return result

arr = json.loads(sys.argv[1])
print(maior_valor(arr))