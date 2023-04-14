from sys import stdin as si


class AverageMyGrade:
    def __init__(self):
        self._subject_amount = int(si.readline().rstrip("\n"))
        self._subject_grade_list = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )

        self._subject_total = 0
        self._max_grade = 0

        self.CalcAverage()

    def CalcAverage(self):
        for subject_grade in self._subject_grade_list:
            if subject_grade > self._max_grade:
                self._max_grade = subject_grade
            self._subject_total += subject_grade
        print((self._subject_total / (self._subject_amount * self._max_grade)) * 100)


if __name__ == '__main__':
    AMG = AverageMyGrade()
