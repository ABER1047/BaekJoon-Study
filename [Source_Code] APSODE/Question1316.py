from sys import stdin as si


class GroupWordChecker:
    def __init__(self):
        self._word_amount = int(si.readline().rstrip("\n"))
        self._correct_word_count = 0
        self.StartCheck()

    def StartCheck(self):
        for _ in range(self._word_amount):
            input_word = list(si.readline().rstrip("\n"))
            print(f"input word : {input_word}")
            checked_char_list = [input_word[0]]
            word_length = len(input_word)
            no_correct_check = False
            for start_index in range(word_length - 1):
                if word_length == 1:
                    break

                continuous_check = input_word[start_index] == input_word[start_index + 1]
                if not continuous_check:
                    print(f"비연속적인 문자 발견 : {input_word[start_index]} -> {input_word[start_index + 1]}")
                    if input_word[start_index + 1] in checked_char_list:
                        print(f"비연속적인 문자 {input_word[start_index + 1]}은 이미 등장했습니다.")
                        no_correct_check = True
                        break
                    else:
                        print(f"등장하지 않았던 비연속적인 문자 {input_word[start_index + 1]}를 리스트에 추가합니다.")
                        checked_char_list.append(input_word[start_index + 1])

            if not no_correct_check:
                print(f"해당 단어 {''.join(input_word)}는 조건을 만족합니다.")
                self._correct_word_count += 1

        print(self._correct_word_count)


if __name__ == '__main__':
    GWC = GroupWordChecker()

