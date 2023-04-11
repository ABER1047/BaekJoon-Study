from sys import stdin as si


class RepeatString:
    def __init__(self):
        self._input_amount = int(si.readline().rstrip("\n"))
        self.RepeatStart()

    def RepeatStart(self):
        for _ in range(self._input_amount):
            amount, repeat_target = si.readline().rstrip("\n").split(" ")
            repeated_string = ""
            for repeat_target_char in repeat_target:
                repeated_string += int(amount) * repeat_target_char
            print(repeated_string)


if __name__ == '__main__':
    RS = RepeatString()
