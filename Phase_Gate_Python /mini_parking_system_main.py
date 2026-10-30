from mini_parking_system_function import *


running = True
car_slot_display ="""
====================================================     
     WELCOME   TO   OPZZYBIT  MINI  CAR  SLOT          
====================================================
          MINI CAR SLOT MENU

1. View Available Spaces 

2. Park Car by Slot Number

3. Leave Slot by Number 

00. Exit Application 

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
        
            print(f"The Available Space Before = {len(get_car_slots())}")
            print()
            
            
            slot = get_car_slots()
            for key ,values in slot.items():
                print(f"{key} => {values}")
        
        case "2":
            
            
            
            count = 1
            slot_input = []
            
            while(True):
                print()
                print("Enter [exit] when you are done")
                print()
                print(f"input {count}")
                userinput = input("ENTER THE NUMBER OF SLOT FROM 1-20 :  ")
                
                if userinput == "done":
                    print()
                    print("SLOT TAKING")
                    break
                
                slot_input.append(int(userinput))
                count += 1
                
                print()
                print(get_add_to_slot_space(slot_input))
                
            print()
            print("============OCCUPIED   SLOT  SPACE===============")
            added_slot_review = get_add_to_slot_space(slot_input)
            print()
            for key ,values in added_slot_review.items():
                print(f"{key} => {values}")
            print()

        
        case "3":
                leave_slot_display ="""
                     LEAVE   SLOT  MENU
                
                
                
                """
        
        
        
