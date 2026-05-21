from unittest import TestCase
from count_min_to_max import *

class CountToMinToMax(TestCase):
    def test_that_min_to_max_calculates_min(self):
        array = [14, 9, 6, 5, 8, 10]
        actual = get_min(array)
        expected = 5
        self.assertEqual(actual, expected)
        
    def test_that_min_to_max_calculates_max(self):
        array = [14, 9, 6, 5, 8, 10]
        actual = get_max(array)
        expected = 14
        self.assertEqual(actual, expected)
        
        
     









