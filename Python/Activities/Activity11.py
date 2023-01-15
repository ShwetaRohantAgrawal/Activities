fruit_shop = {
    "apple" : 10,
    "banana" : 15,
    "orange" :7,
    "peaches" : 12
}

key_to_check = input("What are you looking for ? ").lower()

if(key_to_check in fruit_shop) :
    print ("The ",key_to_check," is available.")
else :
    print ("The ",key_to_check," is not available.")