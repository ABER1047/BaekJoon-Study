from sys import stdin as si


class SugarDelivery:
    def __init__(self):
        self._sugar_amount = int(si.readline().rstrip("\n"))
        self._only_three_sack_amount = 1667  # 3킬로 자루 하나로 나누어떨어지는 경우의 자루수의 최대값 + 1
        self._only_five_sack_amount = 1001  # 5킬로 자루 하나로 나누어떨어지는 경우의 자루수의 최대값 + 1
        self.CalcAmount()

    def CalcAmount(self):
        if self._sugar_amount % 3 == 0 and self._sugar_amount // 3 <= self._only_three_sack_amount:
            self._only_three_sack_amount = self._sugar_amount // 3

        if self._sugar_amount % 5 == 0 and self._sugar_amount // 5 <= self._only_five_sack_amount:
            self._only_five_sack_amount = self._sugar_amount // 5

        # N mod 5 == 1 -> 5킬로 봉지의 갯수 a = ((N // 5) - 1)  ||  3킬로 봉지의 갯수 b = (N - 5 * a) // 3
        # N mod 5 == 2 -> 5킬로 봉지의 갯수 a = ((N // 5) - 2)  ||  3킬로 봉지의 갯수 b = (N - 5 * a) // 3
        # N mod 5 == 3 -> 5킬로 봉지의 갯수 a = (N // 5)  ||  3킬로 봉지의 갯수 b = (N - 5 * a) // 3
        # N mod 5 == 4 -> 5킬로 봉지의 갯수 a = ((N // 5) - 1)  ||  3킬로 봉지의 갯수 b = (N - 5 * a) // 3
        # 식을 정규화하면 -> 5킬로 봉지의 갯수 a = (N // 5) - ((N mod 5) mod 3)  || 3킬로 봉지의 갯수 b = (N - 5 * a) // 3

        five_sack_amount = (self._sugar_amount // 5) - ((self._sugar_amount % 5) % 3)

        # five_sack_amount가 음수일 경우는 제대로 나누어 떨어지지 않는 경우이므로 -1출력
        if five_sack_amount >= 0:
            three_sack_amount = (self._sugar_amount - 5 * five_sack_amount) // 3
            normal_sack_amount = five_sack_amount + three_sack_amount
            print(min([self._only_three_sack_amount, self._only_five_sack_amount, normal_sack_amount]))

        else:
            print(-1)


if __name__ == '__main__':
    SD = SugarDelivery()
