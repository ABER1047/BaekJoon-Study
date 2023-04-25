from sys import stdin as si


class MaybeOverAverage:
    def __init__(self):
        self._case_amount = int(si.readline().rstrip("\n"))
        self.StartCheck()

    def StartCheck(self):
        for _ in range(self._case_amount):
            input_case = list(
                map(
                    int,
                    si.readline().rstrip("\n").split()
                )
            )
            student_amount = input_case[0]
            student_point_list = input_case[1:]
            student_average = sum(student_point_list) / student_amount

            over_average_student_amount = 0
            for student_point in student_point_list:
                if student_point > student_average:
                    over_average_student_amount += 1

            result = over_average_student_amount / student_amount * 100
            print(f"{result:.3f}%")


if __name__ == '__main__':
    MOA = MaybeOverAverage()
