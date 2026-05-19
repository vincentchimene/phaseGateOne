table_number = int(input("Enter Multiplication Table number"))
for number in range(1, 13):
    print(f"{table_number} * {number:-2} = {number * table_number:-2}")
