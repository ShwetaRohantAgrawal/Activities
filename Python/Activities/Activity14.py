maxLength = input("Enter lenght of Fibonacci series :")
i=0;
# fibonacci_series [] =[1];
def fibonacci(i):
    if i<=1 : 
        return i
    else :
        return (fibonacci(i-2)+fibonacci(i-1))

print("Fibonacci Series: ")
for i in range(1,int(maxLength)+1) :
    print(fibonacci(i))



