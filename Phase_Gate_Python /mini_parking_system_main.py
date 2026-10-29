from mini_parking_system_function import *


running = True
car_slot_display ="""
     WELCOME   TO   OPZZYBIT  MINI  CAR  SLOT          
          
          MINI CAR SLOT MENU

1. Park   IN  Slot 

2. Leave   Slot

3. Display  Available Space 

00.Exit 

"""
print(car_slot_display)

while True :
    option = input("Enter Your option:  ")
    print()
    
    if option == "00":
        print("THANKS  FOR PATRONAGE!!!!")
        break
    


    match option :
        case "1":
            
            
            count = 1
            slot_input = []
            
            while(True):
                print("Enter 00 when you are done and 09 to exit from the app")
                print()
                print(f"input {count}")
                userinput = input("ENTER THE NUMBER OF SLOT FROM 1-20 :  ")
                slot_input.append(int(userinput))
                
                
                if userinput == "00":
                    print("SLOT TAKING")
                    break
    
            print()
            print(add_to_slot_space(slot_input))
            print()

        case "3":
        
            mini_car_slot_list = ["X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X"]

            parking_slot_space = get_available_space(mini_car_slot_list)
            print(f"The Available Space = {parking_slot_space}")
            print()
  
          
       

