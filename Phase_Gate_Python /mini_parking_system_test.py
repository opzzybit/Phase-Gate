import unittest

from mini_parking_system_function import *

class Test_Mini_Parking_Slot(unittest.TestCase):

    def test_available_slot_space(self):
        mini_slot = ["X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X"]
        
        result = get_available_space(mini_slot)
        
        self.assertEqual(result , 20)

    def test_user_slot_input(self):
        mini_slot = ["X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X"]
        
        result = get_add_to_slot_space_two(mini_slot)
        
        self.assertEqual(result[4], "OCCUPIED")
