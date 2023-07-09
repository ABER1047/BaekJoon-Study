from sys import stdin


class Zero:
    def __init__(self):
        self._case_amount = int(stdin.readline().rstrip("\n"))
        self._money_stack = []

    def Start(self):
        for _ in range(self._case_amount):
            current_input_money = int(stdin.readline().rstrip("\n"))

            if current_input_money != 0:
                self._money_stack.append(current_input_money)

            else:
                del self._money_stack[-1]

        print(sum(self._money_stack))


if __name__ == '__main__':
    Z = Zero()
    Z.Start()
