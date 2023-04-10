"""
BaekJoon 2470번 문제
두 용액

https://github.com/tony9402/baekjoon
투 포인터 문제 모음에 포함되어있는 문제

문제 풀이
"""



import random
from typing import List, Tuple, Optional


class TwoSolution:
    def __init__(self, debug_mode: bool = False, solution_amount: int = 100, immediate_pm: Optional[int] = None):
        self._solution_amount = int(input()) if debug_mode is False else solution_amount
        self._solution_list = list(
            map(
                int,
                input().split(" ")
            )
        ) if debug_mode is False else self.GetTestSolutionList(solution_amount, immediate_pm = immediate_pm)

        self._max_index = len(self._solution_list) - 1
        self._solution_list.sort()
        self.FindOptimalSolution()

    @staticmethod
    def GetTestSolutionList(solution_amount: int, immediate_pm: Optional[int] = None) -> List[int]:
        result_list = []
        for _ in range(solution_amount):
            if immediate_pm is None:
                pm_op = random.choice([-1, 1])
            else:
                pm_op = immediate_pm

            a = 1 * pm_op if pm_op > 0 else 1000000000 * pm_op
            b = 1000000000 * pm_op if pm_op > 0 else 1 * pm_op
            rnd_num = random.randint(a, b)
            if rnd_num not in result_list:
                print(f"rnd_num 추가 : {rnd_num}")
                result_list.append(rnd_num)

        return result_list

    def CompleteSearch(self) -> Tuple[int, int]:
        min_solution_value = 999999999
        f = 0
        s = 0

        for first_solution in self._solution_list:
            for second_solution in self._solution_list:
                solution_value = first_solution + second_solution
                if abs(solution_value) < min_solution_value:
                    print(f"solution value 차이의 최소값 변경 : {solution_value}")
                    min_solution_value = abs(solution_value)
                    f = first_solution
                    s = second_solution
                    if solution_value == 0:
                        return f, s
                    break

        return f, s

    def CheckBoundaryIndex(self) -> int:
        for checked_index in range(self._max_index):
            pm_check = self._solution_list[checked_index] * self._solution_list[checked_index + 1]
            if pm_check < 0:
                return checked_index

    def FindOptimalSolution(self):
        # 정렬된 리스트 속의 원소 중에 음수 -> 양수로 변하는 경계의 인덱스
        plus_minus_boundary = self.CheckBoundaryIndex()

        start_index = 0
        end_index = self._max_index

        target_value = 0
        # solution_value_temp = 1999999999
        solution_value_temp = 2000000000
        current_optimal_solution = {
            "s": 0,
            "e": 0
        }

        index_check = start_index <= plus_minus_boundary <= end_index \
            if plus_minus_boundary is not None else start_index <= end_index

        while index_check:
            solution_value = self._solution_list[start_index] + self._solution_list[end_index]
            print(f"start index : {start_index}, start index value : {self._solution_list[start_index]}")
            print(f"end index : {end_index}, end index value : {self._solution_list[end_index]}")
            print(f"solution value temp : {solution_value_temp}")
            print(f"solution value : {solution_value}")
            print(f"abs(solution value) : {abs(solution_value)}\n\n")

            if start_index == end_index:
                break

            if abs(solution_value) < solution_value_temp:
                solution_value_temp = abs(solution_value)
                current_optimal_solution["s"] = self._solution_list[start_index]
                current_optimal_solution["e"] = self._solution_list[end_index]

            if solution_value > target_value:
                # end_index -= 1 if end_index > plus_minus_boundary + 1 else 0
                end_index -= 1

            elif solution_value < target_value:
                # start_index += 1 if start_index < plus_minus_boundary else 0
                start_index += 1

            else:   # solution_value == target_value
                current_optimal_solution["s"] = self._solution_list[start_index]
                current_optimal_solution["e"] = self._solution_list[end_index]
                break

        CS = self.CompleteSearch()

        print(current_optimal_solution.get("s"), current_optimal_solution.get("e"))
        print(f"sum data : {current_optimal_solution.get('s') + current_optimal_solution.get('e')}")
        print(f"complete search data : {CS[0]} {CS[1]}")
        print(f"complete search sum data : {CS[0] + CS[1]}")


if __name__ == '__main__':
    TS = TwoSolution(debug_mode = True, solution_amount = 100000, immediate_pm = 1)
