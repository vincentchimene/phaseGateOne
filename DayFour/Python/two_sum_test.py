from unittest import TestCase
from two_sum import *

class TwoSumTest(TestCase):
    def test_that_i_pass_an_array_and_number_i_get_numbers_to_that_give_sum(self):
        array = [2, 5, 6, 7, -6]
        number = 8
        actual = get_numbers(array, number)
        expected = [2, 6]
        self.assertEqual(actual, expected)









