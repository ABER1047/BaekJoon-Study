from sys import stdin as si


class PlusCycle:
    def __init__(self):
        self._input_number = int(si.readline().rstrip("\n"))
        self._count = 0
        self.StartCycle()

    def StartCycle(self):
        if self._input_number < 10:
            list_number_temp = [0, self._input_number]
        else:
            list_number_temp = [int(num) for num in str(self._input_number)]

        check_list = list_number_temp

        while True:
            # 15 -> 6 -> 11 -> 7 -> 8 -> 15
            # 26 -> 8 -> 68 -> 14 -> 84 -> 12 -> 42 -> 26
            # 2와 6을 더함 -> 결과의 오른쪽 값과 이전 값의 가장 오른쪽 값을 연결
            # 68 -> 6과 8을 더함 -> 결과의

            # 두자릿수의 각 자릿수의 값을 더함
            sum = list_number_temp[0] + list_number_temp[1]

            # 더한 값의 수를 각 자릿수 별로 분할
            list_sum_temp = [int(num) for num in (str(sum) if sum >= 10 else [0, sum])]

            # 반복을 위해 새로 생성된 값을 list_number_temp에 대입
            list_number_temp = [list_number_temp[1], list_sum_temp[1]]

            # 루프 횟수에 1추가
            self._count += 1
            if list_number_temp == check_list:
                print(self._count)
                break


if __name__ == '__main__':
    PC = PlusCycle()
