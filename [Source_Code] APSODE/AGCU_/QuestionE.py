from sys import stdin as si


class AlloyCoin:
    def __init__(self):
        self._input_data = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )

        self._f_coin_density = self._input_data[0]
        self._s_coin_density = self._input_data[1]
        self._lager_density_coin_mass_ratio = self._input_data[2]

    def CalcAlloyCoinDensity(self):
        pass
        #으으 밀도 싫어...
