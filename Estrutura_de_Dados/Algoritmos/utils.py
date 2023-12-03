from count_time import count_time

@count_time(label="Create list")
def create_list():
    list = []
    for x in range(1, 100000001):
        list.append(x)
    return list