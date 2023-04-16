from sys import stdin as si
from typing import List


class OrangeAteOrenge:
    def __init__(self):
        self._input_string_length = int(si.readline().rstrip("\n"))
        self._input_string = si.readline().rstrip("\n")
        self._vitamin_string_amount = 0
        self._part_string_list = []
        self.FindVitaminString()

    def _get_all_part_string(self):
        find_str_index = 1
        while find_str_index <= self._input_string_length:  # 입력받은 문자열의 길이까지 부분문자열 길이 증가
            part_string = self._input_string[0:find_str_index]
            # if part_string.__len__() > 1:
            self._part_string_list.append(part_string)
            find_str_index += 1

    @staticmethod
    def isVitaminString(string_1: List[str], string_2: List[str]):
        error_count = 0
        for str_idx in range(string_1.__len__()):
            if string_1[str_idx] != string_2[str_idx]:
                error_count += 1
        if error_count == 1:
            return True
        else:
            return False

    def FindVitaminString(self):
        vitamin_string_check = False
        self._get_all_part_string()
        for head_word in self._part_string_list:
            start_index = self._input_string_length - head_word.__len__()
            end_index = self._input_string_length

            tail_word = self._input_string[start_index:end_index]

            check = self.isVitaminString(
                string_1 = list(head_word),
                string_2 = list(tail_word)
            )

            if check:
                vitamin_string_check = True
                break
        print("YES" if vitamin_string_check else "NO")


if __name__ == '__main__':
    OAO = OrangeAteOrenge()
