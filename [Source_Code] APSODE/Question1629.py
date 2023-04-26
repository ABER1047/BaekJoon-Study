from sys import stdin as si


class Multiple:
    def __init__(self, debug_mod: bool = False):
        self._input_data = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        ) if debug_mod is False else [2147483647, 2147483647, 2]
        self._base_number = self._input_data[0]
        self._squere_number = self._input_data[1]
        self._modulor = self._input_data[2]
        self.StartCalc()

    def _fast_squere_mod_calc(self, base: int, squere: int, modulor: int) -> int:
        if base == 0:
            return 0

        elif squere == 0:
            return 1

        else:
            calc_result = self._fast_squere_mod_calc(
                base = base,
                squere = squere // 2,
                modulor = modulor
            )

            if squere % 2 == 0:
                return ((calc_result % modulor) * (calc_result % modulor)) % modulor

            else:
                return ((base % modulor) * (calc_result % modulor) * (calc_result % modulor)) % modulor

    def StartCalc(self):
        result = self._fast_squere_mod_calc(
            base = self._base_number,
            squere = self._squere_number,
            modulor = self._modulor
        )
        print(result)


if __name__ == '__main__':
    M = Multiple(debug_mod = True)
