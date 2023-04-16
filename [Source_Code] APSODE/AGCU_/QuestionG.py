from sys import stdin as si


class ConsecutiveNumberString:
    def __init__(self):
        self._input_data = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )
        self._consecutive_number = self.CreateConsecutiveNumber()
        self._divide_target_number = self._input_data[1]
        self.StartCalc()

    def CreateConsecutiveNumber(self):
        consecutive_number = ""
        try:
            for num in (num for num in range(self._input_data[0])):
                consecutive_number += str(num + 1)

        except StopIteration:
            pass

        return int(consecutive_number)

    def StartCalc(self):
        print(self._consecutive_number % self._divide_target_number)


if __name__ == '__main__':
    CNS = ConsecutiveNumberString()
