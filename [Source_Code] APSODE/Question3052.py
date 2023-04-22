from sys import stdin as si


class Remainder:
    def __init__(self):
        self._input_number_list = self._get_ten_numbers()
        self._remainder_list = []
        self.CountDiffRemainderAmount()

    @staticmethod
    def _get_ten_numbers():
        input_number_list = []
        for _ in range(10):
            input_number_list.append(int(si.readline().rstrip("\n")))
        return input_number_list

    def CountDiffRemainderAmount(self):
        for number in self._input_number_list:
            self._remainder_list.append(number % 42)

        print(len(set(self._remainder_list)))


if __name__ == '__main__':
    R = Remainder()
