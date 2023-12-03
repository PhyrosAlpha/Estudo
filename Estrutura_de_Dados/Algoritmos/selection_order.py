def selection_order(list):
    result = []
    for i in range(len(list)):
        smallest = search_upper(list)
        number = list.pop(smallest)
        result.append(number)
        print(result)
    return result
        
def search_upper(list):
    smallest = 0
    for i in range(1, len(list)):
        print(list[i])
        if(list[i] < list[smallest]):
            smallest = i
        
    return smallest

list = [2,5,1,10,1000,3,8,5,10,200,199,1002,365,1,2]
print(selection_order(list))
