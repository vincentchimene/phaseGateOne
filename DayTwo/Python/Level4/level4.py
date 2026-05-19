def addition(first_number, second_number):
    sum_numbers = first_number + second_number
    return sum_numbers
    
      
print(addition(3, 5))



def is_even(number):
    check = False
    if number % 2 == 0:
        check = True
    return check
   
print(is_even(29))
print(is_even(20))


def get_square(number):
    return number **2
    
print(get_square(6))


 
def celsius_to_fahrenheit(celsius):
    fahrenheit = celsius * 9 / 5 + 32
    return fahrenheit
    
print(celsius_to_fahrenheit(100))



def is_prime(number):
    check = True
    count = 2
    while count <= number//2:
        if number % count == 0:
            check = False
        count += 1
    return check

print("IsPrime")
print(is_prime(56))  
print(is_prime(2))
print(is_prime(11))  


def get_largest(first_number, second_number, third_number):
    maximum = first_number
    if second_number > maximum:
        maximum = second_number
    if third_number > maximum:
        maximum = third_number
    return maximum
    
print("Largest")   
print(get_largest(2,4,3))
    
 
def get_simple_interest(principal,rate,time_year):
    interest = principal * rate * time_year / 100
    return interest
    
    
print(get_simple_interest(2000, 20, 2))


def get_area_of_rectangle(length, width):
    return length * width
    
    
print(get_area_of_rectangle(5, 10))


def get_reverse(number):
    count = 1  
    new_number = 0
    while number > 0:
        digit = number % 10
        number = number // 10
        new_number = (new_number * 10) + digit
    return new_number
        


print(get_reverse(234))









        
    
    
    
    
        






        
