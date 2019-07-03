def romanizer(numbers):
    romawi = []
    # for data in range(0,len(numbers)):
    romawi.append(convert(5))
    print(romawi)
def convert(number):
    arabicNumber = [
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4,
        1
    ]
    romawiSimbol = [
        "M", "CM", "D", "CD",
        "C", "XC", "L", "XL",
        "X", "IX", "V", "IV",
        "I"
    ]
    
    no_romawi = ''
    i = 0
    while number > 0:
        print(number // arabicNumber[i])
        for _ in range(number // arabicNumber[i]):
            no_romawi += romawiSimbol[i]
            number -= arabicNumber[i]
        i += 1
    return no_romawi

data = [2,3,5,10,11]
print(romanizer(data))