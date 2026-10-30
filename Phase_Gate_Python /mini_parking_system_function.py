def get_car_slots():
    occupied_slot = {}
    
    for numbers in range (1,21):
        occupied_slot[numbers ] = "Empty" 
    
    return occupied_slot    

def get_add_to_slot_space(indexs):
    available_space = get_car_slots()
    
    for numbers in indexs:
        available_space[numbers] = "OCCUPIED"
    return  available_space


def  get_add_to_slot_space_two(numbers):

    occupied_slot_two = ["0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"]
    
    
    occupied_slot_two[2] = "OCCUPIED"
    
    return occupied_slot_two

