def get_numbers(array, number):
    result = []
    index = 0
    count = index + 1
    while index < len(array):
        while count < len(array):
            if array[index] + array[count] == number:
                result.append(array[index])
                #print(result)
                result.append(array[count])
                #print(result)
            count += 1
        index += 1
    return result
                 
array = [2,5,6,3,-6]
number = 8
print(get_numbers(array, number))
