from mini_parking_system_function import *


running = True
car_slot_display ="""
====================================================     
     WELCOME   TO   OPZZYBIT  MINI  CAR  SLOT          
====================================================
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
                print("Enter [exit] when you are done")
                print()
                print(f"input {count}")
                userinput = input("ENTER THE NUMBER OF SLOT FROM 1-20 :  ")
                
                if userinput == "exit":
                    print("SLOT TAKING")
                    break
    
                slot_input.append(int(userinput))
                
                
            print()
            print(add_to_slot_space(slot_input))
            print()

        case "3":
        
            mini_car_slot_list = ["X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X"]

            parking_slot_space = get_available_space(mini_car_slot_list)
            print(f"The Available Space = {parking_slot_space}")
            print()
  
          
       

