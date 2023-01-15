from tkinter.messagebox import YES


while True:
    choice = input("Do you want to play Rock-Paper-Scissors (Yes/No)? ")
    print(choice)
    if choice.lower()=='yes' :
        player1 = input("Choose Rock/Paper/Scissors :").upper()
        player2 = input("Choose Rock/Paper/Scissors :").upper()


        if player1 =="ROCK" :
            if player2=="PAPER" :
                print("Player2 wins")
            elif player2=="SCISSORS" : 
                print("Player1 wins")
            else :
                print("Play Again")
        elif player1 =="PAPER" :
            if player2=="ROCK" :
                print("Player1 wins")
            elif player2=="SCISSORS" : 
                print("Player2 wins")
            else :
                print("Play Again")
        elif player1 =="SCISSORS" :
            if player2=="PAPER" :
                print("Player1 wins")
            elif player2=="ROCK" : 
                print("Player2 wins")
            else :
                print("Play Again")
        else :
            print("Play Again")
    else :
        raise SystemExit