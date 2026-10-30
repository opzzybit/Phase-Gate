import unittest

from mini_parking_system_function import *

class Test_Mini_Parking_Slot(unittest.TestCase):

    def test_available_slot_space(self):
    
        result = get_car_slots()
        
        self.assertEqual(len(result) , 20)

    #def test_user_slot_input(self):
     #   mini_slot = ["0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"]
        
      #  result = get_add_to_slot_space_two(mini_slot)
        
       # if()
        
        #self.assertEqual(result[2], "OCCUPIED")
        
   
