def get_min(array):
    min_num = array[0]
    index = 0
    while index < len(array):
        if array[index] < min_num:
            min_num = array[index]
        index += 1
    return min_num
    
    
def get_max(array):
    max_num = array[0]
    index = 0
    while index < len(array):
        if array[index] > max_num:
            max_num = array[index]
        index += 1
    return max_num
