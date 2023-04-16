from sys import stdin as si


class QuattroCheesePizza:
    def __init__(self):
        self._topping_amount = int(si.readline().rstrip("\n"))
        self._topping_list = set(si.readline().rstrip("\n").split())

        self._cheese_topping_count = 0
        self.MakePizza()

    def MakePizza(self):
        for topping in self._topping_list:
            topping_tail_str = "".join(list(topping)[topping.__len__() - 6:topping.__len__()])
            if topping_tail_str == "Cheese":
                self._cheese_topping_count += 1

        print("yummy" if self._cheese_topping_count >= 4 else "sad")


if __name__ == '__main__':
    QCP = QuattroCheesePizza()
