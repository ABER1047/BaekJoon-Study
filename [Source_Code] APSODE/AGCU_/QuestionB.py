from sys import stdin as si


class ShootingGame:
    def __init__(self):
        self._input_data = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )
        self._point_by_a = self._input_data[0]
        self._point_by_b = self._input_data[1]
        self._target_point_list = [512, 256, 128, 64, 32, 16, 8, 4, 2, 1]
        self.CalcPoint_C()

    def _separate_point(self, separate_target_point: int):
        point_temp = separate_target_point
        separated_point_list = []
        for target_point in self._target_point_list:
            if point_temp == 0:
                break
            elif target_point <= point_temp:
                point_temp %= target_point
                separated_point_list.append(target_point)

        return separated_point_list

    def CalcPoint_C(self):
        c_point_list = []
        a_point_list = self._separate_point(separate_target_point = self._point_by_a)
        b_point_list = self._separate_point(separate_target_point = self._point_by_b)

        for a_point in a_point_list:
            if a_point not in b_point_list:
                c_point_list.append(a_point)
        for b_point in b_point_list:
            if b_point not in a_point_list:
                c_point_list.append(b_point)

        print(sum(c_point_list))


if __name__ == '__main__':
    SG = ShootingGame()