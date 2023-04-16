from sys import stdin as si


class ManyCatIsGood:
    def __init__(self):
        self._want_cat_amount = int(si.readline().rstrip("\n"))
        self._magic_count = 0
        self.StartMagic()

    def StartMagic(self):
        if self._want_cat_amount == 0:  # 고양이 필요없잖아? 왜 만듬 ㅋㅋ
            print(0)

        elif self._want_cat_amount == 1:  # 생성 마법만 사용해서 만족이 가능한 경우
            print(1)

        else:
            cat_temp = 1  # 생성 마법 사용
            self._magic_count += 1  # 생성 마법 사용 1회를 마법 사용 횟수에 추가

            while True:
                replicated_cat_amount = cat_temp * 2
                if self._want_cat_amount <= replicated_cat_amount:
                    self._magic_count += 1
                    break

                else:
                    self._magic_count += 1
                    cat_temp = replicated_cat_amount

            print(self._magic_count)


if __name__ == '__main__':
    MCIG = ManyCatIsGood()
    