import random 

def number_guessing_app():
    isWinner = False
    random_number = random.randint(1, 100)
    user_number = int(input("Guess a number (1 - 100)"))
    count = 0
    while count <= 5:
        user_number = int(input("Guess a number (1 - 100)"))
        if user_number > 100 or user_number < 1:
            print("Number must be between 1 and 100")
            count -= 1
            continue
        elif user_number == random_number:
            print("Congratulations! You guessed right.")
            isWinner = True
            count += 1
            break
        elif user_number < random_number:
            print("Wrong! Your guess is less than the number!")
            count += 1
        elif user_number > random_number:
            print("Wrong! Your guess is greater than the number!")
        count += 1
    if isWinner == True:
        if count == 1:
            print("Legendary")
        elif count == 2:
            print("Excellent")
        elif count < 4:
            print("Good")
        elif count == 5:
            print("Close")
    else:
        print("Better Luck")
        
number_guessing_app()
       
            
        
        
            
        
    
    
    
    
    

        
 
