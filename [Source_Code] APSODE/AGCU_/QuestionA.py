from sys import stdin as si


class ChocolateBar:
    def __init__(self):
        self._input_data = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )
        self._coin_amount = self._input_data[0]
        self._ice_cream_price = self._input_data[1]
        self.CheckMoney()

    def CheckMoney(self):
        current_money = self._coin_amount * 100
        if self._ice_cream_price <= current_money:
            print("Yes")
        else:
            print("No")


if __name__ == '__main__':
    CB = ChocolateBar()
