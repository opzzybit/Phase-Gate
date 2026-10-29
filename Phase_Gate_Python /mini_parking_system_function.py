def get_available_space(slot):
    available_space = 0
    
    for row in range (len(slot) + 1):
        available_space = row 
    return  available_space

def  add_to_slot_space(index):

    occupied_slot = ["X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X"]
    
    for number in index:
        occupied_slot[number] = "OCCUPIED"
    
    return occupied_slot

def  get_add_to_slot_space_two(numbers):

    occupied_slot_two = ["X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X"]
    
    
    occupied_slot_two[4] = "OCCUPIED"
    
    return occupied_slot_two





